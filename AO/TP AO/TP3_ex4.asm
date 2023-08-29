.data
msg: .asciiz " entre votre valeur :    "
msg1: .asciiz "\n la table multiplication est : \n\n    "
msg3: .asciiz " x "
msg4: .asciiz " = "
msg5: .asciiz "\n    "
as: .word 0
cs: .word 10

.text
main:
lw $t0, as
lw $t4, cs

  li $v0, 4
  la $a0, msg
  syscall
         
  li $v0, 5
  syscall
  move $t1, $v0

         li $v0, 4
         la $a0, msg1
         syscall
         
boucle:
         li $v0, 1
         move $a0, $t1
         syscall
         li $v0, 4
         la $a0, msg3
         syscall
         li $v0, 1
         move $a0, $t0
         syscall
         li $v0, 4
         la $a0, msg4
         syscall
         mul $t2,$t1,$t0
          li $v0, 1
         move $a0, $t2
         syscall
         li $v0, 4
         la $a0, msg5
         syscall
         beq $t0, $t4, fin
         addi $t0, $t0, 1
j boucle
fin:


#==================== fin ================
li $v0, 10
syscall
.end main
