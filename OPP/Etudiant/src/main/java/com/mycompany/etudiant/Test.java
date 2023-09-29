/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.etudiant;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Test {
    
    static void print_obj(Etudiant E){
        System.out.println("-------------------------------------");
        System.out.println("Name: "+E.getName());
        System.out.println("Average: "+E.getMoyenne());
        System.out.println("-------------------------------------");

    }
    
    public static void main(String[] args) {
        //Etudiant my = new Etudiant ("mohammed");
        //System.out.println(my.getName());
        
       ArrayList<Double> liste = new ArrayList<Double>();
       Scanner input =new Scanner(System.in);
       
       System.out.print(" Gev me name student : ");
       String name =input.nextLine();
       
       System.out.println( "Input a Grade Group :");
       boolean an = true;
       int i=1;
       do{
           System.out.println("- - - - - - - -"); 
           System.out.print("Grade "+i+" : ");
           double x = input.nextFloat();
           System.out.println("- - - - - - - -");
           liste.add(x);
           i += 1;
           System.out.println("- - - - - - - - - - - - - - - - - - - -"); 
           System.out.println("Do you want to stop Enter a value of 0 ");
           System.out.print("Input :");
           int in = input.nextInt();
           System.out.println("- - - - - - - - - - - - - - - - - - - -"); 
           if( in ==0){
               an =false;
           }
       }while( an == true);
       
       System.out.println(liste.get(0));
       
       
       Etudiant E = new Etudiant(name,liste);
       
       /*
       System.out.println("Name: "+E.getName());
       System.out.println("Average: "+E.getMoyenne());
       */
       
       //--my function 
       print_obj(E); // display properties object E .
       //--------
       
       System.out.println("Operations on Class Etudiant  or object E");
       
        an =true ;
        do{
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("Choose one of the operations :");
            System.out.println(" 0 - Exit.");
            System.out.println(" 1 - Add Grade function ==> ajouterNote().");
            System.out.println(" 2 - Make a change to the signs function ==> Modifier_Note(). ");
            System.out.println(" 3 - View all contents.");
            System.out.print("Input :");
            int in2 = input.nextInt();
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            if(in2 == 0){
                break;
            }
            if(in2 == 1){
                System.out.println("- - - - - - - - -");
                System.out.print("Input add :");
                double in_add =input.nextFloat();
                E.ajouterNote(in_add);
                System.out.println("- - - - - - - - -");
                System.out.println();
            }
            if(in2 == 2){
                System.out.println("- - - - - - - - -");
                System.out.print("Input Edit :");
                double in_edit =input.nextFloat();
                System.out.print("Input index :");
                int index =input.nextInt();
                E.Modifier_Note(index, in_edit);
                System.out.println("- - - - - - - - -");
                System.out.println();
            }
            if(in2 == 3){
                print_obj(E);
            }
           
           System.out.println("- - - - - - - - - - - - - - - - - - - -"); 
           System.out.println("Do you want to stop Enter a value of 0 ");
           System.out.print("Input :");
           int in1 = input.nextInt();
           System.out.println("- - - - - - - - - - - - - - - - - - - -"); 
           if( in1 ==0){
               an =false;
           }
       }while( an == true);
    }
}
