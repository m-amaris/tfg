/* XMLParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. XMLParserTokenManager.java */
import java.io.*;
import java.util.*;

/** Token Manager. */
@SuppressWarnings ("unused")
public class XMLParserTokenManager implements XMLParserConstants {
  static Stack lexicalStateStack = new Stack();

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_2(){
   switch(curChar)
   {
      case 60:
         return jjMoveStringLiteralDfa1_2(0x20L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_2(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa2_2(active0, 0x20L);
      default :
         return 2;
   }
}
static private int jjMoveStringLiteralDfa2_2(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa3_2(active0, 0x20L);
      default :
         return 3;
   }
}
static private int jjMoveStringLiteralDfa3_2(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 3;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 3;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa4_2(active0, 0x20L);
      default :
         return 4;
   }
}
static private int jjMoveStringLiteralDfa4_2(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 4;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_2(active0, 0x20L);
      default :
         return 5;
   }
}
static private int jjMoveStringLiteralDfa5_2(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 5;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 5;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa6_2(active0, 0x20L);
      default :
         return 6;
   }
}
static private int jjMoveStringLiteralDfa6_2(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 6;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 6;
   }
   switch(curChar)
   {
      case 112:
         return jjMoveStringLiteralDfa7_2(active0, 0x20L);
      default :
         return 7;
   }
}
static private int jjMoveStringLiteralDfa7_2(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 7;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 7;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa8_2(active0, 0x20L);
      default :
         return 8;
   }
}
static private int jjMoveStringLiteralDfa8_2(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 8;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 8;
   }
   switch(curChar)
   {
      case 115:
         return jjMoveStringLiteralDfa9_2(active0, 0x20L);
      default :
         return 9;
   }
}
static private int jjMoveStringLiteralDfa9_2(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 9;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 9;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(9, 5);
         break;
      default :
         return 10;
   }
   return 10;
}
private static final int jjStopStringLiteralDfa_1(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x10000L) != 0L)
            return 6;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_1(int pos, long active0){
   return jjMoveNfa_1(jjStopStringLiteralDfa_1(pos, active0), pos + 1);
}
static private int jjMoveStringLiteralDfa0_1(){
   switch(curChar)
   {
      case 47:
         return jjMoveStringLiteralDfa1_1(0x1400L);
      case 60:
         return jjMoveStringLiteralDfa1_1(0xb20L);
      case 62:
         return jjStartNfaWithStates_1(0, 16, 6);
      case 105:
         return jjMoveStringLiteralDfa1_1(0x4000L);
      default :
         return jjMoveNfa_1(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 47:
         return jjMoveStringLiteralDfa2_1(active0, 0x100L);
      case 99:
         return jjMoveStringLiteralDfa2_1(active0, 0x620L);
      case 100:
         return jjMoveStringLiteralDfa2_1(active0, 0x4000L);
      case 108:
         return jjMoveStringLiteralDfa2_1(active0, 0x1800L);
      default :
         break;
   }
   return jjStartNfa_1(0, active0);
}
static private int jjMoveStringLiteralDfa2_1(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(2, 14);
         break;
      case 97:
         return jjMoveStringLiteralDfa3_1(active0, 0x1800L);
      case 99:
         return jjMoveStringLiteralDfa3_1(active0, 0x100L);
      case 111:
         return jjMoveStringLiteralDfa3_1(active0, 0x620L);
      default :
         break;
   }
   return jjStartNfa_1(1, active0);
}
static private int jjMoveStringLiteralDfa3_1(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 98:
         return jjMoveStringLiteralDfa4_1(active0, 0x1800L);
      case 100:
         return jjMoveStringLiteralDfa4_1(active0, 0x600L);
      case 110:
         return jjMoveStringLiteralDfa4_1(active0, 0x20L);
      case 111:
         return jjMoveStringLiteralDfa4_1(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_1(2, active0);
}
static private int jjMoveStringLiteralDfa4_1(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_1(active0, 0x20L);
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(4, 9);
         return jjMoveStringLiteralDfa5_1(active0, 0x1c00L);
      case 110:
         return jjMoveStringLiteralDfa5_1(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_1(3, active0);
}
static private int jjMoveStringLiteralDfa5_1(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(5, 10);
         break;
      case 99:
         return jjMoveStringLiteralDfa6_1(active0, 0x100L);
      case 101:
         return jjMoveStringLiteralDfa6_1(active0, 0x20L);
      case 108:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(5, 11);
         return jjMoveStringLiteralDfa6_1(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_1(4, active0);
}
static private int jjMoveStringLiteralDfa6_1(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(6, 12);
         break;
      case 101:
         return jjMoveStringLiteralDfa7_1(active0, 0x100L);
      case 112:
         return jjMoveStringLiteralDfa7_1(active0, 0x20L);
      default :
         break;
   }
   return jjStartNfa_1(5, active0);
}
static private int jjMoveStringLiteralDfa7_1(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 112:
         return jjMoveStringLiteralDfa8_1(active0, 0x100L);
      case 116:
         return jjMoveStringLiteralDfa8_1(active0, 0x20L);
      default :
         break;
   }
   return jjStartNfa_1(6, active0);
}
static private int jjMoveStringLiteralDfa8_1(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 115:
         return jjMoveStringLiteralDfa9_1(active0, 0x20L);
      case 116:
         return jjMoveStringLiteralDfa9_1(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_1(7, active0);
}
static private int jjMoveStringLiteralDfa9_1(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(9, 5);
         else if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(9, 8);
         break;
      default :
         break;
   }
   return jjStartNfa_1(8, active0);
}
static private int jjStartNfaWithStates_1(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_1(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (curChar == 34)
                     { jjCheckNAddTwoStates(4, 5); }
                  else if (curChar == 62)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 6:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     { jjCheckNAddTwoStates(1, 2); }
                  if (curChar == 60)
                  {
                     if (kind > 13)
                        kind = 13;
                  }
                  break;
               case 1:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 2:
                  if (curChar == 60 && kind > 13)
                     kind = 13;
                  break;
               case 3:
                  if (curChar == 34)
                     { jjCheckNAddTwoStates(4, 5); }
                  break;
               case 4:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     { jjCheckNAddTwoStates(4, 5); }
                  break;
               case 5:
                  if (curChar == 34 && kind > 15)
                     kind = 15;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
               case 1:
                  { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 4:
                  { jjAddStates(0, 1); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 4:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(0, 1); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 60:
         return jjMoveStringLiteralDfa1_0(0xc0L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      default :
         return 2;
   }
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      default :
         return 3;
   }
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 3;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 3;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x40L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      default :
         return 4;
   }
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 4;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x40L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      default :
         return 5;
   }
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 5;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 5;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x80L);
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x40L);
      default :
         return 6;
   }
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 6;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 6;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x80L);
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x40L);
      default :
         return 7;
   }
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 7;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 7;
   }
   switch(curChar)
   {
      case 112:
         return jjMoveStringLiteralDfa8_0(active0, 0x80L);
      case 116:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(7, 6);
         break;
      default :
         return 8;
   }
   return 8;
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 8;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 8;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x80L);
      default :
         return 9;
   }
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 9;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 9;
   }
   switch(curChar)
   {
      case 115:
         return jjMoveStringLiteralDfa10_0(active0, 0x80L);
      default :
         return 10;
   }
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return 10;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 10;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(10, 7);
         break;
      default :
         return 11;
   }
   return 11;
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\74\143\157\156\143\145\160\164\163\76", 
"\74\143\157\156\143\145\160\164", "\74\57\143\157\156\143\145\160\164\163\76", 
"\74\57\143\157\156\143\145\160\164\76", "\74\143\157\144\145", "\57\143\157\144\145\76", "\74\154\141\142\145\154", 
"\57\154\141\142\145\154\76", null, "\151\144\75", null, "\76", null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   4, 5, 
};

static int curLexState = 2;
static int defaultLexState = 2;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       break;
     case 2:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_2();
       if (jjmatchedPos == 0 && jjmatchedKind > 17)
       {
          jjmatchedKind = 17;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           TokenLexicalActions(matchedToken);
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 5 :
        image.append(jjstrLiteralImages[5]);
        lengthOfMatch = jjstrLiteralImages[5].length();
    lexicalStateStack.push(curLexState);
         break;
      case 7 :
        image.append(jjstrLiteralImages[7]);
        lengthOfMatch = jjstrLiteralImages[7].length();
    SwitchTo((int) lexicalStateStack.pop() == 2 ? DEFAULT : CONCEPT);
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public XMLParserTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public XMLParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 6; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
  {
    if (lexState >= 3 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "CONCEPTS",
   "CONCEPT",
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, 0, 1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3ffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[6];
    static private final int[] jjstateSet = new int[2 * 6];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}