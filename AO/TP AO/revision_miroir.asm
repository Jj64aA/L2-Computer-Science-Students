.data 
msg1: .asciiz "\n entre un nbr : "
msg2: .asciiz "\n un nbr propres  "

as: .word 1
qs: .word 7

.text
main:

lw $t4, as
lw $t5, qs
li $v0, 4
la $a0, msg1
syscall

li $v0, 5
syscall
move $t0, $v0

addi  $t2, $t0, -1
boucle:
        rem $t1, $t0, $t4
        beq $t1, $t6, label
        
         j fn
         label :
         add $t3, $t3, $t4
         fn: 
        addi $t4, $t4, 1
        beq $t4, $t2, fin

j boucle
fin:



beq $t3, $t5, labe
j fni
labe:
li $v0, 4
la $a0, msg2
syscall

fni:




#========================
li $v0, 10
syscall
.end main
