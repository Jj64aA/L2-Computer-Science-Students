.data
tab: .space 20
msg1: .asciiz "\n    Donnez la dimension du tableau : "
msg2: .asciiz "Insrer l'element svp : "
msg3: .asciiz "  "

.text
main:
la $t0, tab
addi $t1, $zero, 0

li $v0, 4
la $a0, msg1
syscall

li $v0, 5
syscall
move $t2, $v0

remplire:
beq $t1, $t2, suite

li $v0, 4
la $a0, msg2
syscall

li $v0, 5
syscall
move $t3, $v0

sw $t3, ($t0)
addi $t0, $t0, 4
addi $t1, $t1, 1
b remplire
suite: 

la $t0, tab
addi $t1, $zero, 0

afficher:
beq $t1, $t2, fin

lw $t3, ($t0)

li $v0, 1
move $a0, $t3
syscall

li $v0, 4
la $a0, msg3
syscall

addi $t0, $t0, 4
addi $t1, $t1, 1

b afficher
fin:


#=============  fin ========
li $v0, 10
syscall
.end main