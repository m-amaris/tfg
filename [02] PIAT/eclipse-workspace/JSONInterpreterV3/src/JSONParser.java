/* JSONParser.java */
/* Generated By:JavaCC: Do not edit this line. JSONParser.java */
import java.io.*;
import java.util.*;
import com.google.gson.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 * Clase principal JSONParser.
 */
public class JSONParser implements JSONParserConstants {
  private static File file;
  /**
     * Método principal para ejecutar el analizador JSON.
     * @param args Argumentos de línea de comandos.
     * @throws ParseException Excepción en caso de error de análisis.
     */
  public static void main(String args []) throws ParseException
  {
    JSONParser.getFile();
    if (file == null)
    {
      System.out.println("Archivo no valido o ningun archivo selecionado");
      System.exit(- 1);
    }
    try
    {
      JSONParser parser = new JSONParser(new JSONParserTokenManager(new SimpleCharStream(new FileReader(JSONParser.file))));
      Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();
      String jsonOutput = gson.toJson(parser.json());
      System.out.println(jsonOutput);
      //System.out.println(parser.json());
    }
    catch (ParseException e)
    {
      System.out.println(e.getMessage());
    }
    catch (IOException e)
    {
      System.out.println("Error al leer el archivo JSON: " + e.getMessage());
    }
  }

  /**
     * Obtiene el archivo JSON seleccionado por el usuario.
     */
  private final static void getFile()
  {
    JFileChooser search = new JFileChooser();
    FileNameExtensionFilter filter1 = new FileNameExtensionFilter("Archivo de texto (.txt)", "txt");
    FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Archivo JSON (.json)", "json");
    search.setFileFilter(filter1);
    search.setFileFilter(filter2);
    int option = search.showOpenDialog(null);
    if (option == JFileChooser.APPROVE_OPTION)
    {
      file = search.getSelectedFile();
    }
  }

/**
 * Método para analizar un elemento JSON.
 * @return Elemento JSON analizado.
 */
  final public JsonElement json() throws ParseException {JsonElement j;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OBJECT_START:{
      j = object();
      break;
      }
    case ARRAY_START:{
      j = array();
      break;
      }
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return j;}
    throw new Error("Missing return statement in function");
}

/**
 * Método para analizar un objeto JSON.
 * @return Objeto JSON analizado.
 */
  final public JsonObject object() throws ParseException {AbstractMap.SimpleEntry < String, JsonElement > p;
  JsonObject o = new JsonObject();
    jj_consume_token(OBJECT_START);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case STRING:{
      p = pair();
o.add(p.getKey(), p.getValue()); // Obtener la pareja clave-valor JSON y añadirlo al objeto JSON

      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case COMMA:{
          ;
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          break label_1;
        }
        jj_consume_token(COMMA);
        p = pair();
o.add(p.getKey(), p.getValue());
      }
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    jj_consume_token(OBJECT_END);
{if ("" != null) return o;}
    throw new Error("Missing return statement in function");
}

/**
 * Método para analizar un array JSON.
 * @return Array JSON analizado.
 */
  final public JsonArray array() throws ParseException {JsonObject o;
  JsonArray a = new JsonArray();
    jj_consume_token(ARRAY_START);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OBJECT_START:{
      o = object();
a.add(o); // Obtener el objeto JSON y añadirlo al array JSON

      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case COMMA:{
          ;
          break;
          }
        default:
          jj_la1[3] = jj_gen;
          break label_2;
        }
        jj_consume_token(COMMA);
        o = object();
a.add(o);
      }
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      ;
    }
    jj_consume_token(ARRAY_END);
{if ("" != null) return a;}
    throw new Error("Missing return statement in function");
}

/**
 * Método para analizar una pareja clave-valor JSON.
 * @return Pareja clave-valor analizada.
 */
  final public AbstractMap.SimpleEntry < String, JsonElement > pair() throws ParseException {JsonElement e;
  Token t;
    t = jj_consume_token(STRING);
    jj_consume_token(COLON);
    e = value();
{if ("" != null) return new AbstractMap.SimpleEntry < String, JsonElement > (t.image.substring(1, t.image.length() - 1), e);} // Obtener los elementos JSON y añadirlos a la pareja clave-valor JSON 

    throw new Error("Missing return statement in function");
}

/**
 * Método para analizar un valor JSON.
 * @return Valor JSON analizado.
 */
  final public JsonElement value() throws ParseException {Token t;
  JsonElement e;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case STRING:{
      t = jj_consume_token(STRING);
//System.out.println(new JsonPrimitive(t.image.substring(1, t.image.length() - 1)));
      {if ("" != null) return new JsonPrimitive(t.image.substring(1, t.image.length() - 1));}
      break;
      }
    case INTEGER:{
      t = jj_consume_token(INTEGER);
{if ("" != null) return new JsonPrimitive(Integer.parseInt(t.image));}
      break;
      }
    case DOUBLE:{
      t = jj_consume_token(DOUBLE);
{if ("" != null) return new JsonPrimitive(Double.parseDouble(t.image));}
      break;
      }
    case TRUE:{
      jj_consume_token(TRUE);
{if ("" != null) return new JsonPrimitive(true);}
      break;
      }
    case FALSE:{
      jj_consume_token(FALSE);
{if ("" != null) return new JsonPrimitive(false);}
      break;
      }
    case NULL:{
      t = jj_consume_token(NULL);
{if ("" != null) return JsonNull.INSTANCE;}
      break;
      }
    case OBJECT_START:{
      e = object();
{if ("" != null) return e;}
      break;
      }
    case ARRAY_START:{
      e = array();
{if ("" != null) return e;}
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
}

  /** Generated Token Manager. */
  public JSONParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[6];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0xa0,0x8000,0x200,0x8000,0x20,0x7ea0,};
	}

  /** Constructor with InputStream. */
  public JSONParser(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public JSONParser(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new JSONParserTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public JSONParser(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new JSONParserTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new JSONParserTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public JSONParser(JSONParserTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(JSONParserTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 6; i++) jj_la1[i] = -1;
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
	 boolean[] la1tokens = new boolean[17];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 6; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 17; i++) {
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
	 return new ParseException(token, exptokseq, tokenImage);
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
