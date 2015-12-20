grammar Lang;

//parser rules
prog:  (line)+;

line: stmt ENDLN; // semicolon is mandatory

stmt:   EXIT                          # exitStmt
    |   CREATE VARNAME WITH VALUE     # createWithValue
    |   VARNAME EQ ((VARNAME ADD VALUE) | (VALUE ADD VARNAME))  # assVarVal
    |   VARNAME EQ VARNAME ADD VARNAME# assVarVar
    |   VARNAME EQ VALUE ADD VALUE    # assValVal
    ;


//lexical(token) rules
ENDLN: ';';
EXIT: 'EXITPLEASE';
CREATE : 'create';
WITH : 'with';
EQ : '=';
VARNAME : [a-zA-Z]+;
VALUE : [0-9]+;
ADD : '+';


COMMENT: '//' .*? ('\n'|EOF) -> skip;
MULTILINECOMMENT: '/*' .*? '*/' -> skip;
EOL: [ \t\r\n] -> skip;