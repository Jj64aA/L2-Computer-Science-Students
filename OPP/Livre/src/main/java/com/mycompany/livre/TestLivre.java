/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livre;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class TestLivre {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        System.out.print("GEV ME Title :");
        String t=input.nextLine();
        System.out.println();
        System.out.print("GEV ME Writer :");
        String w=input.nextLine();
        System.out.println();        
        System.out.print("GEV ME Price :");
        float p=input.nextFloat();
        System.out.println("- - - - - - - - - - - - ");

        Livre L1 =new Livre(t,w,p);
        L1.Afficher();
        System.out.println("- - - - - - - - - - - - ");
        Livre L2 =new Livre("Programmee en langage C","Claude Delannoy",1200);
        L2.Afficher();
    }
}
