.data
as: .word 2
bs: .word 10
cs: .word 1
gs: .word 0
msg1: .asciiz "entre un nombre : "
msg2: .asciiz "\n la resultat en binaire est : "

.text 
main:
lw $t0, as
lw $t1, bs
lw $t3, cs
lw $t5, gs

li $v0, 4
la $a0, msg1
syscall

li $v0, 5
syscall
move $t2, $v0

boucle:
           rem $t4, $t2, $t0
           mul $t4, $t4, $t3
           mul $t3, $t3, $t1
           add $t6, $t6, $t4
           beq $t2, $t5, fin 
           div $t2, $t2, $t0
           
j boucle
fin:

li $v0, 4
la $a0, msg2
syscall

li $v0, 1
move $a0, $t6
syscall

#================= FIN ==================
li $v0, 10
syscall 
.end main