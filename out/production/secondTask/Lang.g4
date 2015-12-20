grammar Lang;

//parser rules
prog:  (line)+;

line: stmt ENDLN;

stmt:   EXIT                          # exitStmt
    |   CREATE VARNAME WITH VALUE     # createWithValue
    |   CREATE VARNAME WITH '[' VALUE VALUE+ ']'    #createArray
    |   VARNAME EQ ((VARNAME ADD VALUE) | (VALUE ADD VARNAME))  # assVarVal
    |   VARNAME EQ VARNAME ADD VARNAME# assVarVar
    |   VARNAME EQ VALUE ADD VALUE    # assValVal
    |   VARNAME VALUE EQ VALUE        # addToArrayElement
    ;


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