.data
msg1: .asciiz "\n as  sup  bs "
msg2: .asciiz "\n as  inf  bs "
as: .word 4
bs: .word 45


.text
main :


lw $t1, as
lw $t2, bs

   ble $t1, $t2, else            # if ($t1 <= $t2 ) affiche msg2  else  ffiche msg1    
li $v0, 4
la $a0, msg1
syscall

j fin

else :

li $v0, 4
la $a0, msg2
syscall

fin:

li $v0, 10
syscall

.end main