/* Generated By:JavaCC: Do not edit this line. JSONParserConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface JSONParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int GRAPHS = 1;
  /** RegularExpression Id. */
  int IDRESOURCE = 2;
  /** RegularExpression Id. */
  int ARRAY_START = 3;
  /** RegularExpression Id. */
  int ARRAY_END = 4;
  /** RegularExpression Id. */
  int IDCONCEPT = 5;
  /** RegularExpression Id. */
  int TITLE = 6;
  /** RegularExpression Id. */
  int DESCRIPTION = 7;
  /** RegularExpression Id. */
  int TIME_START = 8;
  /** RegularExpression Id. */
  int TIME_END = 9;
  /** RegularExpression Id. */
  int LINK = 10;
  /** RegularExpression Id. */
  int EVENT_LOCATION = 11;
  /** RegularExpression Id. */
  int AREA = 12;
  /** RegularExpression Id. */
  int LATITUDE = 13;
  /** RegularExpression Id. */
  int LONGITUDE = 14;
  /** RegularExpression Id. */
  int ORGANIZATION_NAME = 15;
  /** RegularExpression Id. */
  int ACCESIBILITY = 16;
  /** RegularExpression Id. */
  int ACCESIBILITY_STRING = 17;
  /** RegularExpression Id. */
  int STRING = 18;
  /** RegularExpression Id. */
  int INTEGER = 19;
  /** RegularExpression Id. */
  int DOUBLE = 20;
  /** RegularExpression Id. */
  int TRUE = 21;
  /** RegularExpression Id. */
  int FALSE = 22;
  /** RegularExpression Id. */
  int NULL = 23;
  /** RegularExpression Id. */
  int IDAREA = 24;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int GRAPH = 1;
  /** Lexical state. */
  int RESOURCE = 2;
  /** Lexical state. */
  int RESOURCE_END = 3;
  /** Lexical state. */
  int GETVALUE = 4;
  /** Lexical state. */
  int INAREA = 5;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\"\\\"@graph\\\"\"",
    "\"\\\"@id\\\"\"",
    "\"[\"",
    "\"]\"",
    "\"\\\"@type\\\"\"",
    "\"\\\"title\\\"\"",
    "\"\\\"description\\\"\"",
    "\"\\\"dtstart\\\"\"",
    "\"\\\"dtend\\\"\"",
    "\"\\\"link\\\"\"",
    "\"\\\"event-location\\\"\"",
    "\"\\\"area\\\"\"",
    "\"\\\"latitude\\\"\"",
    "\"\\\"longitude\\\"\"",
    "\"\\\"organization-name\\\"\"",
    "\"\\\"accesibility\\\"\"",
    "<ACCESIBILITY_STRING>",
    "<STRING>",
    "<INTEGER>",
    "<DOUBLE>",
    "\"true\"",
    "\"false\"",
    "\"null\"",
    "\"\\\"@id\\\"\"",
    "<token of kind 25>",
  };

}