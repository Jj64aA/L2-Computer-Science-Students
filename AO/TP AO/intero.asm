.data
msg1: .asciiz "\n Donnez une liste de nombres :\n"
msg2: .asciiz "La liste contient: "
msg3: .asciiz " nombres\n"
msg4: .asciiz "Le maximum est: "
msg5: .asciiz "\nSa position est: "

.text
main:

li $v0, 4
la $a0, msg1
syscall

boucle:

         li $v0, 5
         syscall
         move $t0, $v0
         addi $t1, $t1, 1
         bgt $t0, $t3,label
         j fn
         label:
               move $t3, $t0
               move $t4, $t1
         fn:
         
         
         beq $t0, $t7, fin
j boucle
fin:

li $v0, 4
la $a0, msg2
syscall

li $v0, 1
move $a0, $t1
syscall

li $v0, 4
la $a0, msg3
syscall

li $v0, 4
la $a0, msg4
syscall

li $v0, 1
move $a0, $t3
syscall

li $v0, 4
la $a0, msg5
syscall

li $v0, 1
move $a0, $t4
syscall

#===========================================
li $v0,10
syscall
.end main