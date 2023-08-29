.data
msg1: .asciiz "\n somme '0' = "
msg2: .asciiz "\n somme sans '0' = "
msg3: .asciiz "\n produit les nombres négative  = "
tab : .word -21, 3, 0, -6, 0, 54

.text
main :
li $t4, 20
li $t0, 0              #somme
li $t6, 1              #produit
li $t1, 6             #taille
la $t2, tab            #$t2 reçoit l'adresse du premier élément

bcl:
      lw $t3, ($t2)          #lire une valeur du tableau
      add $t0, $t0, $t3      #ajouter la valeur lu dans $t0
      bnez $t3, next 
         sw $t4, ($t2)
      next:
      lw $t3, ($t2)
      add $t5, $t5, $t3
      bgez  $t3, nex 
         mul $t6, $t6, $t3
      nex:
      addi $t2, $t2, 4       #incrémenter le pointeur du tableau par 4
      addi $t1,$t1, -1       #décrémenter le compteur de la boucle bcl
      bne $t1, $zero, bcl    # si la valeur n'est pas nulle brancher sur bcl

li $v0, 4
la $a0, msg1  # somme avec 0
syscall

li $v0, 1
move $a0, $t0
syscall

li $v0, 4
la $a0, msg2 # somme sans 0
syscall

li $v0, 1
move $a0, $t5
syscall

li $v0, 4
la $a0, msg3  # produit les nombres négative
syscall

li $v0, 1
move $a0, $t6
syscall
#=========================================
li $v0, 10
syscall
.end main
