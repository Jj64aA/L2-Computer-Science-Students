.data
msg1: .asciiz "\n entre un nombre : "
msg2: .asciiz "\n\n les nombres d'entiers paires est = "

qs: .word 2
.text
main:
 lw $t0, qs        

boucle:
        li $v0, 4
        la $a0, msg1
        syscall
        
        li $v0, 5
        syscall
        move $t1, $v0
        
        rem $t3,$t1,$t0
        
        beq $t3, $t4, label
        j fn
        label:
              addi $t5, $t5, 1
        fn:
        
        beq $t1, $t2, fin  

j boucle
fin:

 li $v0, 4
 la $a0, msg2
 syscall

li $v0, 1
move $a0, $t5
syscall

#===================== fin ==================
li $v0, 10
syscall
.end main