/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.etudiant;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Etudiant {
   
   private String name ;
   private ArrayList<Double> listNotes ;
   private double moyenne;
   
   /*
   public Etudiant(String name){
       this.name =name;
   }
   */
   //--------constructeur------------
   public  Etudiant(String name,ArrayList<Double> list){
       this.name = name ;
       listNotes = list ;
   }
   //----------getter----------------
   public String getName(){
       return name;
   }
   public ArrayList<Double> getListeNotes(){
       return listNotes;
   }
   public double getMoyenne(){
       moyenne = calcul_moy();
       return moyenne;
   }
   //---------------------------------
   
   //----function private-------------
   
   private double calcul_moy(){
       double somme=0;
       int longueur = listNotes.size();
       for(int i=0;i<longueur;i++){
           somme = somme + listNotes.get(i);
       }
       return  somme / longueur ; // return moyenne
   }
   //---------functions----------------
   public void ajouterNote(double note){
       if (note <0){
           listNotes.add(0.0);
       }else if(note > 20){
           listNotes.add(20.0);
       }else{
           listNotes.add(note);
       }
       moyenne = calcul_moy();
   }
    
   public void Modifier_Note(int index ,double note ){
       while ( note > 20.0 || note < 0.0){
           Scanner input = new Scanner(System.in);
           System.out.print("Give me a grade belongs to a domain [0 ; 20] ");
           note = input.nextFloat();
       }
       listNotes.set(index, note);
       moyenne = calcul_moy();
   }
   
}
