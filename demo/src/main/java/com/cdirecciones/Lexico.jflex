//Especificaciones
package com.cdirecciones;
import static com.cdirecciones.sym.*;
import java_cup.runtime.Symbol;
%%

%class Lexer
%public
%unicode
%line
%column
%cup
%{
  private Symbol symbol(int type) {
    return new Symbol(type, yyline+1, yycolumn+1);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline+1, yycolumn+1, value);
  }

%}

//Expresiones regulares

LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\f]
Id 		= [:jletter:] [:jletterdigit:]*
Integer 	= 0 | [1-9][0-9]*
Decimal 	= {Integer}\.\d+

%%
{Integer}           {return  symbol(entero,yytext());}
{Id}                {return  symbol(id,yytext());}
{Decimal}           {return  symbol(decimal,yytext());}
"+"                 {return  symbol(suma);}
"-"                 {return  symbol(resta);}
"/"                 {return  symbol(division);}
"*"                 {return  symbol(multiplicacion);}
"("                 {return  symbol(parentesisA);}
")"                 {return  symbol(parentesisC);}
"="                 {return symbol(igual);}
";"                 {return symbol(coma);}
{WhiteSpace}        {/*Ignorar*/}
[^]		{System.out.println("Error con:" + yytext());}