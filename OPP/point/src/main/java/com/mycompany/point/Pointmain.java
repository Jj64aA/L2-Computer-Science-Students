/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.point;

/**
 *
 * @author USER
 */
public class Pointmain {
    public static void main(String[] args) {
      Point P = new Point(3,5); // creation d’un objet P de classe Point
      System.out.println( "avant le deplacement") ;
      P.afficher();  // appel de la methode afficher
      P.deplace(2,1) ; // appel de la methodedeplace
      System.out.println( "apres le deplacement" ) ;
      P.afficher();
}
}
