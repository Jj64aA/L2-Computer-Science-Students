.data
msg1: .asciiz "\n detacte nombre parfait  \n enter votre nombre : "
msg2: .asciiz " est parfait"
msg3: .asciiz " non parfait"
msg4: .asciiz "\n le nombre "
w: .word 1
k: .word 8128

.text
main:
lw $t1, w
lw $t0, k
#lw $t7, k
#==============================
li $v0, 4
la $a0, msg1
syscall
li $v0, 5
syscall
move $t7, $v0
move $t8, $v0
#==============================
addi $t7, $t7, -1

li $v0, 4
la $a0, msg4
syscall

li $v0, 1
move $a0, $t8
syscall

boucle:
        rem $t2, $t0, $t1
        beq $t2, $t3, label
               
        j fin
        label:
               add $t4, $t4, $t1
        fin:
        beq $t1, $t7, fn
        addi $t1, $t1, 1
j boucle
fn:

bne $t0, $t4, loop
         li $v0, 4
         la $a0, msg2
         syscall
j exit
loop:
         li $v0, 4
         la $a0, msg3
         syscall
exit:
# ================  FIN  ===============
li $v0, 10
syscall
.end main
