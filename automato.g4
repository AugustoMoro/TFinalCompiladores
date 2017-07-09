grammar automato;

exprAutomato: '(' estadosExp ',' alfabetoExp ',' transicaoExp ',' estadoInicial ',' estadoFinal ')';

estadosExp: '{' estados '}';
estados: ESTADOS | ESTADOS ',' estados;

alfabetoExp: '{' alfabeto '}';
alfabeto: ALFABETO | ALFABETO ',' alfabeto;

transicaoExp: '{' transicao '}';
transicao: 'T' '(' ESTADOS ',' ALFABETO ')' '=' ESTADOS | 'T' '(' ESTADOS ',' ALFABETO ')' '=' ESTADOS ',' transicao;

estadoInicial: '{' ESTADOS '}';

estadoFinal: '{' estados '}';

ALFABETO: [a-z] | [A-Z] | [0-9];

ESTADOS: [a-zA-Z0-9]+;

WS: [ \t\r\n]+ -> skip;