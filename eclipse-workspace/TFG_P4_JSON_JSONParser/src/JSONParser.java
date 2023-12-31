/* JSONParser.java */
/* Generated By:JavaCC: Do not edit this line. JSONParser.java */
import java.io.*;
import java.util.*;
public class JSONParser implements JSONParserConstants {
  public static void main(String [] args) throws ParseException
  {
    JSONParser parser;
    try
    {
      parser = new JSONParser(new JSONParserTokenManager(new SimpleCharStream(new StreamProvider(new FileInputStream(args[0]), "UTF-8"))));
      List < Resource > resourceList = parser.document();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }

/****************************  ANALIZADOR SINTÁCTICO  ****************************/
  final public 
List < Resource > document() throws ParseException {List < Resource > resourceList = new ArrayList < Resource >();
  Resource r;
    jj_consume_token(GRAPHS);
    jj_consume_token(ARRAY_START);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDRESOURCE:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      r = resource();
resourceList.add(r);
    }
    jj_consume_token(ARRAY_END);
return resourceList;
}

  final public Resource resource() throws ParseException {Resource r = new Resource();
  Token t;
    jj_consume_token(IDRESOURCE);
    t = jj_consume_token(STRING);
r.setResourceId(t.image);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDCONCEPT:{
      jj_consume_token(IDCONCEPT);
      t = jj_consume_token(STRING);
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      ;
    }
r.setConceptId(t.image);
    jj_consume_token(TITLE);
    t = jj_consume_token(STRING);
r.setTitle(t.image);
    jj_consume_token(DESCRIPTION);
    t = jj_consume_token(STRING);
r.setDescription(t.image);
    jj_consume_token(TIME_START);
    t = jj_consume_token(STRING);
r.setStartDate(t.image);
    jj_consume_token(TIME_END);
    t = jj_consume_token(STRING);
r.setEndDate(t.image);
    jj_consume_token(LINK);
    t = jj_consume_token(STRING);
r.setLink(t.image);
    jj_consume_token(EVENT_LOCATION);
    t = jj_consume_token(STRING);
r.setEventLocation(t.image);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AREA:{
      jj_consume_token(AREA);
      jj_consume_token(IDAREA);
      t = jj_consume_token(STRING);
r.setArea(t.image);
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LATITUDE:{
      jj_consume_token(LATITUDE);
      t = jj_consume_token(DOUBLE);
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      ;
    }
if(!t.image.toString().equals("\"\""))r.setLatitude(Double.parseDouble(t.image));
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LONGITUDE:{
      jj_consume_token(LONGITUDE);
      t = jj_consume_token(DOUBLE);
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      ;
    }
if(!t.image.toString().equals("\"\""))r.setLongitude(Double.parseDouble(t.image));
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ORGANIZATION_NAME:{
      jj_consume_token(ORGANIZATION_NAME);
      t = jj_consume_token(STRING);
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      ;
    }
r.setOrganizationName(t.image);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ACCESIBILITY:{
      jj_consume_token(ACCESIBILITY);
      t = jj_consume_token(STRING);
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      ;
    }
r.setAccesibility(t.image);
return r;
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
  final private int[] jj_la1 = new int[7];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x4,0x10,0x800,0x1000,0x2000,0x4000,0x8000,};
	}

  /** Constructor. */
  public JSONParser(Provider stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new JSONParserTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public JSONParser(String dsl) throws ParseException, TokenMgrException {
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
 token_source = new JSONParserTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public JSONParser(JSONParserTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(JSONParserTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 7; i++) jj_la1[i] = -1;
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
	 boolean[] la1tokens = new boolean[26];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 7; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 26; i++) {
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
	 return new ParseException(token, exptokseq, tokenImage, token_source == null ? null : JSONParserTokenManager.lexStateNames[token_source.curLexState]);
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
