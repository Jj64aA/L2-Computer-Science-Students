.data
msg1: .asciiz "\n Bienvenue "
msg2: .asciiz "\n Joyeux anniversaire "
msg3: .asciiz "\n Au revoir ! "
msg4: .asciiz "\n entre la dete d'aujourd'hui :  "
msg5: .asciiz " / "
msg6: .asciiz "\n entre la dete de naissance : "
msg7: .asciiz "\n entre votre nom : "
msg8: .asciiz ""

.text
main:
#=================== date aujourd'hui
li $v0, 4
la $a0, msg4
syscall

li $v0, 5
syscall
move $t0, $v0

li $v0, 4
la $a0, msg5
syscall

li $v0, 5
syscall
move $t1, $v0

li $v0, 4
la $a0, msg5
syscall

li $v0, 5
syscall
move $t2, $v0
#===================== nom
li $v0, 4
la $a0, msg7
syscall

li $v0, 8
la $a0, msg8
li $a1, 40
syscall

li $v0, 4
la $a0, msg1
syscall

li $v0, 4
la $a0, msg8
syscall
#===================== date de naissance
li $v0, 4
la $a0, msg6
syscall

li $v0, 5
syscall
move $t3, $v0

li $v0, 4
la $a0, msg5
syscall

li $v0, 5
syscall
move $t4, $v0

li $v0, 4
la $a0, msg5
syscall

li $v0, 5
syscall
move $t5, $v0
#========================= calcul 
sub $t6, $t0, $t3
sub $t7, $t1, $t4
sub $t8, $t6, $t7
#========================= connditionnel
beq $t8, $t9, label
        li $v0, 4
        la $a0, msg3
        syscall      
              
j fin
label:

        li $v0, 4
        la $a0, msg2
        syscall 
        
        li $v0, 4
        la $a0, msg8
        syscall 
fin:
#=====================  FIN  ================
li $v0, 10
syscall
.end main