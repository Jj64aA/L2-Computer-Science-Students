/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carre;

/**
 *
 * @author USER
 */
public class Parallélépipède extends Rectangle {
    public float h ;

    public Parallélépipède(float h, float largeur, float l) {
        super(largeur,l);
        this.h = h;
    }
    
    public float volume(){
        return super.surface()*h;
    }
    public void affiche(){
         System.out.println("volume d’un  Parallélépipède " +volume() + "cm3") ;
    }

    
}
