/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carre;

/**
 *
 * @author USER
 */
public class main {
    public static void main(String[] args) {
       
        Carre C = new Carre(4);
        
        System.out.println("surface d’un carre " +C.surface() + "cm2") ;
        
        Parallélépipède M = new Parallélépipède(3,10,2);
        
        M.affiche();
        
    }

}
