.data
msg1: .asciiz "\n entre un votre nombre : "

as: .word 10
ab: .word 0

.text
main:
lw $t0, as
lw $t1, ab

li $v0, 4
la $a0, msg1
syscall

li $v0, 5
syscall
move $t2, $v0

boucle:
         rem $t3, $t2, $t0
         beq $t2, $t1, fin
         mul $t4, $t4, $t0
         add $t4, $t4, $t3
         div $t2, $t2, $t0

j boucle
fin:

li $v0, 1
move $a0, $t4
syscall
#=========================  FIN ========================
li $v0, 10
syscall
.end main