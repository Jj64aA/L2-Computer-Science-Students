.data
nombre : .word 100
msg : .asciiz "\n"


.text
main:
lw $t0, nombre
lw $t1, 1
lw $t2,0

bcl:
    div $t0, $t1
    mfhi $t4
    bnez $t4, vrai
    la $a0, msg
    li $v0, 4
    syscall
    move $a0, $t1
    li $v0,1
    vrai:
    addi $t1, $t1, 1
    ble $t1, $t0, bcl
    





#===================
li $a0, 10
syscall
.end main