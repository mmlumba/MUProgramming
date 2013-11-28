/* Marian Lumba
IT-320-A
9-22-2013*/

%{
#include <stdio.h>
#include "hw1.tab.h"
%}

%%
":" return COLON;
"+" return PLUS;
"=" return EQUALS;
"<" return LESSTHAN;
">" return GREATTHAN;
"<=" return LESSEQUAL;
">=" return GREATEQUAL;
"==" return EQUAL;
"!=" return NOTEQUAL;
"[" return LBRACK;
"]" return RBRACK;
"(" return LPAR;
")" return RPAR;
"while" return WHILE;
"do" return DOWHILE;
"for" return FORWHILE;
"int" return INT;
[0-9]+ return INTEGER;
[a-z] return CHAR;
[<|>|<=|>=|==|!=] return OP;
"\n" return END;
