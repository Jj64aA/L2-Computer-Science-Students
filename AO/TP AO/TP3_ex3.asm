.data
qs: .word 23
ss: .word 1
ms: .word 2
msg1: .asciiz "  est paire !\n"
msg2: .asciiz " \n"
.text
main:

lw $t0, qs
lw $t1, ss
lw $t2, ms

boucle:
           rem $t3, $t1, $t2
           beq $t3, $t4, label
               li $v0, 1
               move $a0, $t1
               syscall
               li $v0, 4
               la $a0, msg2
               syscall
           j fn
           label:
               li $v0, 1
               move $a0, $t1
               syscall
               li $v0, 4
               la $a0, msg1
               syscall              
           fn:
           beq $t1, $t0, fin
           addi $t1, $t1, 1
           
j boucle
fin:

#===============  FIN ============
li $v0, 10
syscall
.end main