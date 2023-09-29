/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carre;

/**
 *
 * @author USER
 */
public class Carre {
    
    public float  longueur ; 

    public Carre(float l) {
       longueur = l;
    }
    
    public float surface(){
        
        return longueur*longueur;
        
    }
    
    public void affiche(){
         System.out.println("surface d’un carre " +surface() + "cm2") ;
    }

    
}
