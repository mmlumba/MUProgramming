/* Marian Lumba
IT-320-A
9-29-2013*/

%{
#include <stdio.h>
%}

%token COLON
%token PLUS
%token EQUALS
%token LESSTHAN
%token GREATTHAN
%token LESSEQUAL
%token GREATEQUAL
%token EQUAL
%token NOTEQUAL
%token LBRACK
%token RBRACK
%token LPAR
%token RPAR
%token WHILE
%token DOWHILE
%token FORWHILE
%token INT
%token INTEGER
%token CHAR
%token OP
%token END
%%

exp: statement END { printf("Correct Syntax"); }
;

statement: expression
;

expression: while_expression1 | while_expression2 | do_expression | for_expression1 | for_expression2
;

while_expression1: WHILE LPAR condition RPAR declaration
;

while_expression2: WHILE LPAR condition RPAR LBRACK declaration RBRACK 
;

do_expression: DOWHILE LBRACK declaration RBRACK WHILE LPAR condition RPAR
;

for_expression1: FORWHILE LPAR declaration condition COLON increment RPAR declaration
;

for_expression2: FORWHILE LPAR declaration condition COLON increment RPAR LBRACK declaration RBRACK
;

condition: CHAR op INTEGER
;

op: LESSTHAN | GREATTHAN | LESSEQUAL | GREATEQUAL | EQUAL | NOTEQUAL
;

declaration: declaration INT CHAR EQUALS INTEGER COLON | INT CHAR EQUALS INTEGER COLON
;

increment: CHAR EQUALS CHAR PLUS INTEGER COLON
;

%%

int yyerror(char *s) {
	fprintf(stderr, "error: %s\n", s);
}

int main() {
	yyparse();
}
