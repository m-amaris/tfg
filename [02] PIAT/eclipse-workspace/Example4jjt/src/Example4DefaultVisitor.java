/* Generated By:JavaCC: Do not edit this line. Example4DefaultVisitor.java Version 7.0.12 */
public class Example4DefaultVisitor implements Example4Visitor{
  public Object defaultVisit(SimpleNode node, Object data){
    node.childrenAccept(this, data);
    return data;
  }
  public Object visit(SimpleNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTStart node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTAdd node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTMult node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTMyOtherID node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTInteger node, Object data){
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=eb9127d913fcab75ad5eac215a5a4537 (do not edit this line) */
