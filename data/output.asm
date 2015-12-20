$varOne0 0
LOADN 1
STORE $varOne0
$varOne1 1
LOADN 2
STORE $varOne1
$varOne2 2
LOADN 3
STORE $varOne2
$varOne3 3
LOADN 4
STORE $varOne3
$varOne4 4
LOADN 5
STORE $varOne4

$i 5
LOADN 0
STORE $i

$sum 6
LOADN 0
STORE $sum

LOADV $varOne
SETR 
LOADV $sum
MUXR 
ADD 
MUXOP 
STORE $sum
LOADV $i
ADD 1
STORE $i
HALT
