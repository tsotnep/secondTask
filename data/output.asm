$varOne 0
LOADN 11
STORE $varOne

$varTwo 1
LOADN 0
STORE $varTwo

LOADV $varOne
ADD 5
STORE $varTwo

LOADN 1
add 1
STORE $varTwo

$varThree 2
LOADN 0
STORE $varThree

LOADV $varTwo
SETR 
LOADV $varOne
MUXR 
ADD 
MUXOP 
STORE $varThree

HALT
