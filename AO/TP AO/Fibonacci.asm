.data

a: .word 1
b: .word 1
#n: .word 6
c: .word 1
msg1: .asciiz " U"
msg2: .asciiz " = "
msg3: .asciiz "\n calcul un terme n Fibonacci : \n entre un terme n :  "


.text
main:
lw $t0, a
lw $t1, b
#lw $t2, n  
lw $t4, c

li $v0, 4
la $a0, msg3
syscall

li $v0, 5
syscall
move $t2, $v0

boucle:
        add $t3, $t1, $t0
        move $t0, $t1
        move $t1, $t3
        addi $t4, $t4, 1
        beq $t4, $t2, fin
    
j boucle
fin:
li $v0, 4
la $a0, msg1
syscall

li $v0, 1
move $a0, $t2
syscall

li $v0, 4
la $a0, msg2
syscall

li $v0, 1
move $a0, $t3
syscall
#============== fin ==========
li $v0, 10
syscall
.end main