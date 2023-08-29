.data
msg: .asciiz "\n les nbr's impaire est : "
msg1: .asciiz "  "
msg2: .asciiz "\n impossible psq x>=y ! fin l'opération !  \n"
.text
main: 
li $t0, 3  # x
li $t1, 10 # Y
li $t2, 2


blt $t0, $t1, lab
li $v0, 4
la $a0, msg2
syscall

j nx
lab:
rem $t3, $t0, $t2
beq $t3, $t5, label

j fin
label:
      addi $t0, $t0, 1
fin:
li $v0, 4
la $a0, msg
syscall

bcl:
     blt $t0, $t1, fi
     li $v0, 1
     move $a0, $t0
     syscall
     
     li $v0, 4
     la $a0, msg1
     syscall
     
    addi $t0, $t0, 2
 j bcl
 fi:   
nx:  
#============== fin
li $v0, 10
syscall
.end main
