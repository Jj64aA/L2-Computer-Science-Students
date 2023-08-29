.data
as: .word 22
bs: .word 2


msg1: .asciiz "\n le nombre "
msg2: .asciiz " est premier ! "
msg3: .asciiz " est non premier ! "

.text
main:

lw $t0, as
lw $t1, bs
lw $t2, bs
lw $t5, bs

loop:

li $v0, 4
la $a0, msg1
syscall

li $v0, 1
move $a0, $t2
syscall

boucle:
            rem $t3, $t2, $t1
            beq $t3, $t4, fin
            addi $t1, $t1, 1     
j boucle
fin:
# ==================== cond if pre ============
bne $t2, $t1, label
         li $v0, 4
         la $a0, msg2
         syscall
j exit
label:
         li $v0, 4
         la $a0, msg3
         syscall
exit:

        beq $t2, $t0, fn
        addi $t2, $t2, 1
        move $t1, $t5
j loop
fn:
#============== FIN =================
li $v0, 10
syscall
.end main
