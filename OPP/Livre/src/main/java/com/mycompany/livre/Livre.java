/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livre;

/**
 *
 * @author USER
 */
public class Livre {
     String Titre;
     String Auteur;
     float Prix;
     Livre(){
       
    }
     Livre(String t,String a,float p){
      Titre=t;
      Auteur=a;
      Prix=p; 
    }
     public void Afficher(){
         System.out.println("Book information");
         System.out.println("Title :"+Titre);
         System.out.println("Writer :"+Auteur);
         System.out.println("Price :"+Prix);
     }
}

