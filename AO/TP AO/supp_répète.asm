.data
qa: .word 1222222
qz: .word 10
fd: .word 1
msg1: .asciiz "\n un programme qui permet supprimier le répète : \n le nombre est : "
msg2: .asciiz "\n resultat est  : "

.text
main:
lw $t0, qa
lw $t1, qz
lw $t4, fd
lw $t5, fd

li $v0, 4
la $a0, msg1
syscall

li $v0, 1
move $a0, $t0
syscall

         rem $t2, $t0, $t1
         move $t3, $t2
         move $t6, $t2
         div $t0, $t0, $t1
boucle:
         rem $t2, $t0, $t1
         
         beq $t2, $t3, label
               mul $t4, $t4, $t1
               mul $t5, $t4, $t2
               add $t6, $t6, $t5 
               move $t3, $t2 
                  
         j fn
         label:
               
         fn:
         beq $t0, $t9, fin
         div $t0, $t0, $t1
j boucle
fin:

li $v0, 4
la $a0, msg2
syscall

li $v0, 1
move $a0, $t6
syscall
#============ FIN ============
li $v0, 10
syscall
.end main