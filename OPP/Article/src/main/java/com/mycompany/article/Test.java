/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.article;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        TabArticle T = new TabArticle();
        /*
        System.out.println("-------------------------------------------");
        T.Lire_Article();
        System.out.println("-------------------------------------------");
        System.out.println("------------------Affichege----------------");
        T.Affiche_Article();
        System.out.println("-------------------------------------------");
        T.Saisie_ventes(2);
        System.out.println("------------------Affichege----------------");
        T.Affiche_Article();
        System.out.println("-------------------------------------------");
        System.out.println("-----------------Reduire-------------------");
        T.Reduire_prix(50);
        System.out.println("-------------------------------------------");
        System.out.println("------------------Affichege----------------");
        T.Affiche_Article();
        System.out.println("-------------------------------------------");
        System.out.println("max ventes :"+T.Max_Total_Vente());
        */
        
        Scanner sc = new Scanner(System.in);
        int ga;
        int ga1;
        do{
            System.out.println("-------------------------------------------");
            System.out.println("---------chose  un operation--------");
            System.out.println("1 ==> affiche   les article ");
            System.out.println("2 ==> vent un article ");
            System.out.println("3 ==> reduite les prix des articles ");
            System.out.println("4 ==> insert article");
            System.out.println("5 ==> Max vents");
            System.out.println("------------------------------------");
            System.out.print(" | Lire operation | Enter : ");
            ga1 = sc.nextInt();
            System.out.println("------------------------------------");
            switch (ga1){
                case 1 :
                    T.Affiche_Article();   
                    break;
                case 2 :
                    System.out.println("-----------------------------------------------------------------");
                    System.out.print(" |lier nomber ventes | Enter : ");
                    int ve = sc.nextInt();
                    T.Saisie_ventes(ve);
                    System.out.println("-----------------------------------------------------------------");
                    break;
                case 3 :
                    T.Reduire_prix(10);
                    break;
                case 4 :
                    System.out.println("----------------------------Article|stock------------------------");
                    T.Lire_Article();   
                    System.out.println("-----------------------------------------------------------------");
                    break;
                case 5 :
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println(  "-------- MAx vents "+T.Max_Total_Vente()+"------------------------");
                    System.out.println("-----------------------------------------------------------------");
                    break;
                default :
                    System.out.println("------------------------------------");
                    System.out.println("----------------ERROR---------------");
                    System.out.println("------------------------------------");
            }
            
             
            System.out.println("-------------------------------------------");
            System.out.print(" | Exit  oui ==> 1 , non ==> 0 | Enter : ");
            ga = sc.nextInt();
            System.out.println("-------------------------------------------");
            if(ga == 1){
                break;
            }
        }while(true);
        
    }
}
