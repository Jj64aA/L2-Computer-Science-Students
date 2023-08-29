.data
msg1: .asciiz "\n\n enter votre nbr svp! : "
msg2: .asciiz "................."
nbr: .word 1

.text
main:

lw $t0, nbr
lw $t1, nbr

li $v0, 4
la $a0, msg1
syscall

li $v0, 5
syscall
move $t2, $v0

boucle:
      mul $t0,$t0,$t1
      beq $t2, $t1, fin
      addi $t1,$t1, 1
      
j boucle
fin:

li $v0, 4
la $a0, msg2
syscall

li $v0, 1
move $a0, $t0
syscall

li $v0, 10
syscall
.end main