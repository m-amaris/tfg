/* Generated By:JavaCC: Do not edit this line. JSONParserConstants.java */
package Analizador;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface JSONParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int OBJECT_START = 5;
  /** RegularExpression Id. */
  int OBJECT_END = 6;
  /** RegularExpression Id. */
  int ARRAY_START = 7;
  /** RegularExpression Id. */
  int ARRAY_END = 8;
  /** RegularExpression Id. */
  int STRING = 9;
  /** RegularExpression Id. */
  int NUMBER = 10;
  /** RegularExpression Id. */
  int TRUE = 11;
  /** RegularExpression Id. */
  int FALSE = 12;
  /** RegularExpression Id. */
  int NULL = 13;
  /** RegularExpression Id. */
  int COMMA = 14;
  /** RegularExpression Id. */
  int COLON = 15;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\r\"",
    "\"\\n\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "<STRING>",
    "<NUMBER>",
    "\"true\"",
    "\"false\"",
    "\"null\"",
    "\",\"",
    "\":\"",
  };

}
