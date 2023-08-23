
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615
//----------------------------------------------------

package com.cdirecciones;

import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\006\000\002\004\005\000\002\004\005" +
    "\000\002\004\003\000\002\005\005\000\002\005\005\000" +
    "\002\005\003\000\002\006\005\000\002\006\003\000\002" +
    "\007\003\000\002\007\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\004\005\006\001\002\000\006\002\uffff\005" +
    "\uffff\001\002\000\006\002\034\005\006\001\002\000\004" +
    "\016\007\001\002\000\012\004\012\005\017\006\011\013" +
    "\015\001\002\000\010\007\025\012\026\015\032\001\002" +
    "\000\016\007\ufff4\010\ufff4\011\ufff4\012\ufff4\014\ufff4\015" +
    "\ufff4\001\002\000\016\007\ufff5\010\ufff5\011\ufff5\012\ufff5" +
    "\014\ufff5\015\ufff5\001\002\000\016\007\ufff6\010\ufff6\011" +
    "\ufff6\012\ufff6\014\ufff6\015\ufff6\001\002\000\016\007\ufff8" +
    "\010\ufff8\011\ufff8\012\ufff8\014\ufff8\015\ufff8\001\002\000" +
    "\012\004\012\005\017\006\011\013\015\001\002\000\016" +
    "\007\ufffb\010\020\011\021\012\ufffb\014\ufffb\015\ufffb\001" +
    "\002\000\016\007\ufff3\010\ufff3\011\ufff3\012\ufff3\014\ufff3" +
    "\015\ufff3\001\002\000\012\004\012\005\017\006\011\013" +
    "\015\001\002\000\012\004\012\005\017\006\011\013\015" +
    "\001\002\000\016\007\ufff9\010\ufff9\011\ufff9\012\ufff9\014" +
    "\ufff9\015\ufff9\001\002\000\016\007\ufffa\010\ufffa\011\ufffa" +
    "\012\ufffa\014\ufffa\015\ufffa\001\002\000\010\007\025\012" +
    "\026\014\027\001\002\000\012\004\012\005\017\006\011" +
    "\013\015\001\002\000\012\004\012\005\017\006\011\013" +
    "\015\001\002\000\016\007\ufff7\010\ufff7\011\ufff7\012\ufff7" +
    "\014\ufff7\015\ufff7\001\002\000\016\007\ufffc\010\020\011" +
    "\021\012\ufffc\014\ufffc\015\ufffc\001\002\000\016\007\ufffd" +
    "\010\020\011\021\012\ufffd\014\ufffd\015\ufffd\001\002\000" +
    "\006\002\ufffe\005\ufffe\001\002\000\006\002\000\005\000" +
    "\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\006\002\004\003\003\001\001\000\002\001" +
    "\001\000\004\003\032\001\001\000\002\001\001\000\012" +
    "\004\007\005\015\006\013\007\012\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\004\023\005\015\006\013\007" +
    "\012\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\006\022\007\012\001\001\000\006\006\021\007\012\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\005\030\006\013\007\012\001\001\000\010\005" +
    "\027\006\013\007\012\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        
    int contador = 1;
    public parser(Lexer lexer) {
        super(lexer);
    }
    


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= INICIO OP 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= OP 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // OP ::= id igual A coma 
            {
              Object RESULT =null;
		int n2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String n2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		System.out.println(n2 + "=" + n1 + "\n");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // A ::= A suma B 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object n2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		System.out.println("t" + contador + "=" + n1 + "+" + n2);RESULT = "t" + contador;contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("A",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // A ::= A resta B 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object n2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		System.out.println("t" + contador + "=" + n1 + "-" + n2);RESULT = "t" + contador;contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("A",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // A ::= B 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = n1;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("A",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // B ::= B multiplicacion C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object n2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		System.out.println("t" + contador + "=" + n1 + "*" + n2);RESULT = "t" + contador;contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // B ::= B division C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object n2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		System.out.println("t" + contador + "=" + n1 + "/" + n2);RESULT = "t" + contador;contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // B ::= C 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = n1;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // C ::= parentesisA A parentesisC 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = n1;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("C",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // C ::= D 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = n1;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("C",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // D ::= entero 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = n1;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("D",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // D ::= decimal 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = n1;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("D",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // D ::= id 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = n1;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("D",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}