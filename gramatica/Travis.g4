grammar Travis;


programa: encabezado LA cuerpo LC ;
encabezado: VOID MAIN PA PC #inicio;

cuerpo: declaraciones;


declaraciones: (while_state|if_state|asignacion|declaracion|impresion|declarasignar)*;

if_state: IF PA condicion PC LA declaraciones LC elseIf_state* else_state?  #ifGod;
else_state: ELSE LA declaracionesElse LC #elseGod;
elseIf_state: ELSE IF PA condicion PC LA declaraciones LC #elseifgod;
while_state: WHILE PA condicion PC LA declaraciones LC #whileGod;



declarasignar: tipo_dato ID IGUAL expr ';'#declarasigod;

declaracion: tipo_dato ID ';'#declaragod;

impresion: PRINT PA expr PC ';' #impregod;

asignacion: ID IGUAL expr ';' #asignagod;


condicion: condicion AND condicion #andExpr
            |
            condicion OR condicion #orExpr
            |
            expr op = (IG|NIG) expr #igualdad
            |
            expr op = (GT|LT|GTEQ|LTEQ) expr #relacional

            |
            TRUE #trueGod
            |
            FALSE #falseGod
            |
             NUMERO #condicionN
            |
            '('condicion')' #condicionParentesis;

expr: expr op = (MUL|DIV) expr #mulDiv
      |
      expr op = (SUM|RES) expr #sumRes
      |
      NUMERO #int
      |
      '-'NUMERO #intneg
      |
      ID #id
      |
      '('expr')' #parentesis
      ;

tipo_dato: INT;
declaracionesElse : declaraciones;



//Palabras reservadas
INT: 'lit';
VOID: 'astro';
MAIN: 'world';
PRINT: 'outwest';
TRUE: 'true';
FALSE: 'false';
IF: 'dis';
ELSE:'antidote';
WHILE:'rodeo';

//Simbolos
OR : '||';
AND : '&&';
IG : '==';
NIG : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
NOT: '!';
IGUAL: '=';
SUM: '+';
RES: '-';
MUL: '*';
DIV: '/';
PA: '(';
PC: ')';
LA:'{';
LC:'}';


//ID
COMENTARIO:   '$!' .*? '!$' -> skip;
COMENTARIO_LINEA:   '$$' ~[\r\n]* -> skip;
ID: [a-zA-Z][a-zA-Z0-9]*;
NUMERO: [0-9]+;

WS:[ \t\r\n]+ -> skip;