package piat.opendatasearch;

import java.util.List;

/**
 * @author
 *
 */

public class GenerarXML {

	private List<Concept> concepts;
	private String codigoCategoria;
	private List<Dataset> datasets;
	private static int conceptsSize;

	private static final String conceptPattern = "\n\t\t\t<concept id=#ID#/>";
	private static final String cabeceraXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
			+ "<searchResults xmlns=\"http://www.piat.dte.upm.es/practica3\"\n"
			+ "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n"
			+ "xsi:schemaLocation=\"http://www.piat.dte.upm.es/practica3 ResultadosBusquedaP3.xsd\">";
	private static final String datasetPattern = "\n\t\t\t<dataset id=#ID#>";
	private static final String titlePattern = "\n\t\t\t\t<title>#TITLE#</title>";
	private static final String descriptionPattern = "\n\t\t\t\t<description>#DESC#</description>";
	private static final String themePattern = "\n\t\t\t\t<theme>#THEME#</theme>";

	public GenerarXML(List<Concept> concepts, String nombreCategoria, String codigoCategoria, List<Dataset> datasets) {
		this.concepts = concepts;
		this.codigoCategoria = codigoCategoria;
		this.datasets = datasets;
		conceptsSize = 0;
	}

	public static int recursiveConcept(List<Concept> concepts, StringBuilder sbSalida) {
		for (Concept c : concepts) {
			sbSalida.append(conceptPattern.replace("#ID#", c.getId()));
			conceptsSize++;
			recursiveConcept(c.getConcepts(), sbSalida);
		}
		return conceptsSize;
	}

	private static String conceptsToXML(List<Concept> lConcepts) {
		StringBuilder sbSalida = new StringBuilder();
		sbSalida.append("\n\t\t<concepts>");
		recursiveConcept(lConcepts, sbSalida);
		sbSalida.append("\n\t\t</concepts>");
		return sbSalida.toString();
	}

	private String summaryToXML(String codigoCategoria, List<Concept> concepts, List<Dataset> datasets) {
		String summary = "\n\t<summary>\n\t\t<query>" + codigoCategoria + "</query>\n\t\t<numConcepts>"
				+ recursiveConcept(concepts, new StringBuilder()) + "</numConcepts>\n\t\t<numDatasets>"
				+ datasets.size() + "</numDatasets>\n\t</summary>";

		return summary;
	}

	private String datasetsToXML(List<Dataset> datasets) {
		StringBuilder sbSalida = new StringBuilder();
		sbSalida.append("\n\t\t<datasets>");
		for (Dataset unDataset : datasets) {
			sbSalida.append(datasetPattern.replace("#ID#", unDataset.getId()));
			sbSalida.append(titlePattern.replace("#TITLE#", unDataset.getTitle()));
			sbSalida.append(descriptionPattern.replace("#DESC#", unDataset.getDescription()));
			sbSalida.append(themePattern.replace("#THEME#", unDataset.getTheme()));
			sbSalida.append("\n\t\t\t</dataset>");
		}
		sbSalida.append("\n\t\t</datasets>");
		return sbSalida.toString();
	}

	private String resultsToXML() {
		StringBuilder sbResults = new StringBuilder();
		sbResults.append("\n\t<results>");
		sbResults.append(conceptsToXML(concepts));
		sbResults.append(datasetsToXML(datasets));
		sbResults.append("\n\t</results>");

		return sbResults.toString();
	}

	public String generarXML() {
		StringBuilder sbSalida = new StringBuilder();

		sbSalida.append(cabeceraXML);
		sbSalida.append(summaryToXML(codigoCategoria, concepts, datasets));
		sbSalida.append(resultsToXML());
		sbSalida.append("\n</searchResults>");
		return sbSalida.toString();

	}
}
