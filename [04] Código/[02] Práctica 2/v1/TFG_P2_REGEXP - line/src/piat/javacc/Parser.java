/* Parser.java */
/* Generated By:JavaCC: Do not edit this line. Parser.java */
package piat.javacc;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class Parser implements ParserConstants {

  final public void procesarLinea(AtomicInteger lineasCorrectas,ConcurrentHashMap<String, String> hmServidores,ConcurrentHashMap <String,AtomicInteger> hmUsuarios,ConcurrentHashMap<String, Pattern> hmPatronesEstadisticasAgregadas,ConcurrentHashMap<String, AtomicInteger> hmEstadisticasAgregadas) throws ParseException {Token fecha,hora,tipoServidor,numeroServidor;
  Token mensaje = null;
  String traza;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case FECHA:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      fecha = jj_consume_token(FECHA);
      hora = jj_consume_token(HORA);
      tipoServidor = jj_consume_token(TIPO_SERVIDOR);
      numeroServidor = jj_consume_token(NUMERO_SERVIDOR);
      mensaje = jj_consume_token(MENSAJE);
traza = fecha.image+hora.image+tipoServidor.image+numeroServidor.image+mensaje.image;
      // estadisticasServidor
      hmServidores.put(tipoServidor.image+numeroServidor.image, tipoServidor.image);

      // estadisticasUsuarios
          Matcher comparador = Pattern.compile(".*\\smsa.*message.*\\sfrom:\\s<([\\w-]+\\.[\\w-]+)@.*").matcher(traza);
          if (comparador.matches()) {
            final AtomicInteger contadorAnterior = hmUsuarios.putIfAbsent(comparador.group(1), new AtomicInteger(1));
            if (contadorAnterior != null) contadorAnterior.incrementAndGet();
            }


      // estadisticasAgregadas
                String clave, estadistico;
                final AtomicInteger contadorAnterior2;

                // Recorrer el mapa hmpatron2esEstadisticasAgregadas, que contiene los patron2es a
                // probar, para ver si cada uno de esos patron2es casan con la traza a analizar
                for (Map.Entry<String, Pattern> entrada : hmPatronesEstadisticasAgregadas.entrySet()) {
                        estadistico = entrada.getKey(); // String con el nombre del estad�stico
                        if (entrada.getValue().matcher(traza).matches()) { // Si casa, entonces actualizar el mapa hmEstadisticasAgregadas
                                clave = tipoServidor + " " + " " + fecha + " " + estadistico; // La clave del mapa
                                                                                                                                                                // hmEstadisticasAgregadas est� formada
                                                                                                                                                                // por el tipo del servidor y el nombre
                                                                                                                                                                // del estad�stico
                                // hmEstadisticasAgregadas
                                // estara formada por el tipo del servidor, la fecha de la traza y el nombre del
                                // estadistico.
                                // Por ejemplo "security-in 2020-02-21 - msgBLOCKED"

                                // A�adir el estad�stico al mapa. Si no existe el valor del contador es 1, pero
                                // si existe, se recupera el valor y se incrementa
                                contadorAnterior2 = hmEstadisticasAgregadas.putIfAbsent(clave, new AtomicInteger(1));
                                if (contadorAnterior2 != null)
                                        contadorAnterior2.incrementAndGet();
                                break; // Este break sale del for, pues al ser los patron2es disjuntos, en cuanto una
                                                // l�nea cumple un patr�n, no hace falta mirar otros patron2es
                        }
                }
                lineasCorrectas.incrementAndGet();
          // System.out.println(traza);

    }
    jj_consume_token(0);
}

  /** Generated Token Manager. */
  public ParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[1];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x20,};
	}

  /** Constructor. */
  public Parser(Provider stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new ParserTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Parser(String dsl) throws ParseException, TokenMgrException {
	   this(new StringProvider(dsl));
  }

  public void ReInit(String s) {
	  ReInit(new StringProvider(s));
  }
  /** Reinitialise. */
  public void ReInit(Provider stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new ParserTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Parser(ParserTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ParserTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[10];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 1; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 10; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage, token_source == null ? null : ParserTokenManager.lexStateNames[token_source.curLexState]);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

                     }
