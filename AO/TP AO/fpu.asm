.data
msg : .asciiz"la somme de tableau :"
msg1 : .asciiz"\nla moyen de tableau :"
tab : .word 1,2,3,4,5,6,7,8,9
.text
main:
li $a1,9
la $a2,tab
li $t0,0
li $t1,0
loop:
lw $a3, ($a2)  
add $t0, $t0, $a3 
addi $a2, 4 
addi $a1, -1 
bne $a1, $zero,loop

la $a0,msg
li $v0,4
syscall

move $a0,$t0
li $v0,1
syscall

div $t0,$a1
mflo $t1

la $a0,msg1
li $v0,4
syscall

move $a0,$t1
li $v0,1
syscall

li $v0,10
syscall
.end main

