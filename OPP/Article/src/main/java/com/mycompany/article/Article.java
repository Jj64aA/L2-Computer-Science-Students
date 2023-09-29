/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.article;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Article {

    private String design;
    private float prix;
    private int total_vente;
    private int quantite;
    
    // -------Constructeur-------
    public Article(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------");
        System.out.print(" Donne la designatio de l'article              : ");
        design = sc.nextLine();
        
        do{
          System.out.print(" Donne le prix (prix > 0) de l'article         : ");
          prix =sc.nextFloat();  
        }while(prix <= 0.0);
        
        do{
          System.out.print(" Donne le quantite (quantite > 0) de l'article : ");
          quantite =sc.nextInt();  
        }while(quantite <= 0);
        System.out.println("-----------------------------------------------------------------");
        total_vente = 0 ;
    }
    
    
    // -------Méthodes--------
    
    //--getter et setteur--
    
    public float getPrix(){
        return prix;
    }
    public void setPrix(float prix){
        this.prix = prix;
    }    
    
    public String getDesing(){
        return design;
    }
    
    public int getTotal_vente(){
        return total_vente;
    }
    //--fonctions-----
    
    public void vente(int q){
        if(q > 0){
            if(q == quantite){
                quantite = 0 ;
                total_vente += q ;
                System.out.println("* Opération effectuée");
            }else if(quantite > q){
                quantite = quantite - q ;
                total_vente += q ;
                System.out.println("* Opération effectuée");
            }else{
                System.out.print("* vente sera impossible ");
                System.out.println(" 'Quantité non disponible' ");
            }
        }else{
            System.out.print("* vente sera impossible ");
            System.out.println(" 'Entrée invalide, veuillez ré-entrer' ");
        }
    }
    
    public String toString(){
        return " La désignaction : "+design+"|"+" prix : "+prix+"|"+" Quantite :"+quantite+"|"+" Total Vente : "+total_vente+"\n";
    }
}
