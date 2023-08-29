.data
as: .word -34
bs: .word 2
cs: .word 0
msg1: .asciiz "\n la somme est négatifs !"
msg2: .asciiz "\n la somme est positifs !"

msg3: .asciiz "\n la produit est négatifs !"
msg4: .asciiz "\n la produit est positifs !"

.text
main:

lw $t0, as
lw $t1, bs
lw $t4, cs

mul $t2, $t1, $t0
add $t3, $t1, $t0
#===================== conditionnel pour la somme ===========
bgez $t3, boup
      li $v0, 4
      la $a0, msg1
      syscall
j fin
boup:
      li $v0, 4
      la $a0, msg2
      syscall
fin:
#===================  conditionnel pour la produit ==========
bltz $t2, loop
      li $v0, 4
      la $a0, msg4
      syscall 
j fin1
loop:
      li $v0, 4
      la $a0, msg3
      syscall
fin1:  
#=================== fin ======================
li $v0, 10
syscall
.end main