grammar assignment2;

start:  stmt ;
//Statmemets
stmt : VAR ASSIGN expr                                 #assign
     | SKP                                             #skip
     | IF boolExp THEN stmt ELSE stmt                  #ifelse
     | WHILE boolExp stmt                              #while
     | PRINT BRAC expr KETS                            #printExp
     | PRINT BRAC boolExp KETS                         #printBool
     | BEGIN stmt+ ENDING                              #CompStmt
     ;

//Expressions
expr  : left = expr op = (MULT | DIV | MODE) right = expr #multiplicative
      | left = expr op = (ADD | SUB) right = expr  #additive
      | figure                                    #number
      | BRAC expr KETS                              #brackets
      | VAR                                        #variable
      | SUB expr                                   #negExp
      ;
//Boolean Expression
boolExp : TRUE                                                    #true
        | FALSE                                                  #false
        | NOT boolExp                                            #negBool
        | left=boolExp op=(AND | OR) right=boolExp               #boolOp
        | left=expr op=(LS | LSQ | EQU | GR | GRQ) right=expr    #relational
        ;
//Numbers
figure  : FLOAT               #float
        |  NUM                #integer
         ;


//Tokens

IF : 'if' ;
THEN : 'then' ;
ELSE : 'else' ;
WHILE : 'while' ;
END : 'end' ;
NOT : 'not' ;
AND : 'and' ;
OR : 'or' ;
TRUE : 'True' ;
FALSE : 'False' ;
MODE: '%';
BEGIN: '{';
ENDING: '}';
BRAC : '(' ;
KETS : ')' ;
PRINT : 'print' ;
SKP : 'skip' ;
ASSIGN : ':=' ;
DOLLAR: '$';
MULT : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
SEMICOLON : ';' ;
LS : '<' ;
LSQ : '<=' ;
EQU : '==' ;
GR : '>' ;
GRQ : '>=' ;
NUM : '-'? [0-9]+ ;
FLOAT: '-'? [0-9]+ '.' [0-9]+;
VAR : [a-zA-Z][a-zA-Z0-9]* ;
WS : [ \t\r\n]+ -> skip ;