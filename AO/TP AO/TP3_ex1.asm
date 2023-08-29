.data
as: .word 10
bs: .word 1

.text
main:

lw $t0, as
lw $t1, bs

boucle:
      mul $t2, $t1, $t1
      add $t3, $t3, $t2
      beq $t1, $t0, fin
      addi $t1, $t1, 1
j boucle
fin:

li $v0, 1
move $a0, $t3
syscall

li $v0, 10
syscall
.end main 