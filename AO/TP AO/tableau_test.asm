.data
tab: .word -21, 3, 0, -6, 0, 54
msg1: .asciiz "  "
.text
main:
li $t0, 0
li $t1, 6
la $t2, tab

affichge:
          lw $t3 ($t2)
          
          li $v0, 1
          move $a0, $t3
          syscall
          
          li $v0, 4
la $a0, msg1  # somme avec 0
syscall
          
          addi $t2, $t2, 4
          addi $t1, $t1, -1
          
          bne $t1, $t0, affichge
         

#================= fin
li $v0, 10
syscall
.end main 