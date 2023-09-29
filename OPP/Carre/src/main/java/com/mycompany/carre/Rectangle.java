/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carre;

/**
 *
 * @author USER
 */
public class Rectangle extends Carre { // عندما نريد ورثة من كلاص اخر 
    public float  largeur ;
    
    public Rectangle(float largeur, float l) {  
        super(l);                               
        this.largeur = largeur;
    }
    
    
    public  float surface(){
           return largeur*longueur;
    }
    
    public void affiche(){
         System.out.println("surface d’un Rectangle " +surface() + "cm2") ;
    }

    
    
    
}
