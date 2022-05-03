grammar Calculadora;

programa: instrucciones+;

instrucciones:
                expr SALTO #impresion
                |
                ID '=' expr SALTO #asignacion
                |
                SALTO #vacio;

expr: expr op = (MUL|DIV) expr #mulDiv
      |
      expr op = (SUM|RES) expr #sumRes
      |
      INT #int
      |
      ID #id
      |
      '('expr')' #parentesis
      ;


IGUAL: '=';
MUL: '*';
DIV: '/';
SUM: '+';
RES: '-';
SALTO: [\r\n];
INT: [0-9]+;
ID: [a-zA-Z]+;
WSPACE: [ \t] -> skip;