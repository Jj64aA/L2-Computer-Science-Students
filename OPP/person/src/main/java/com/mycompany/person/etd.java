/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.person;

/**
 *
 * @author USER
 */

import java.util.Scanner;
public class etd extends Person{
  private int idBac;
  private int anne;

    public etd() {
    }

    
    
    
   
    public etd(String Fullname, int age, String adress,int idBac,int anne ) {
    
        super(Fullname, age, adress);
        
        this.idBac =idBac;
        this.anne=anne;
    }

    

    public String getId(){
        return ""+anne+""+idBac;
    }
    /*
    public void exp(){
         System.out.println("ID        : "+getId());
         System.out.println("Full name : "+getName());
         System.out.println("Age       : "+getAge());
         System.out.println("Adress    : "+getAdress());
    }
    */
    public void exp(){
       System.out.println("ID        : "+getId()); 
       super.exp();
       
       
    }
}
