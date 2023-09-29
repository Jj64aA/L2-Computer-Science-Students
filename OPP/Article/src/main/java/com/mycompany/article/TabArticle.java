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
import java.util.ArrayList;
public class TabArticle {
    private ArrayList<Article> tab = new ArrayList();
    
    public void Lire_Article(){
        int an;
        do{
        System.out.println("  Lire Article .. .. .. !");
        Article MyArticle = new Article();
        tab.add(MyArticle);
        System.out.print("  Do want buy  Article in Array List 1 ==> yes : "); 
        Scanner input = new Scanner(System.in);
        an = input.nextInt();
        }while( an == 1 );
    }
    
    public void Affiche_Article(){
        for(Article MyArticle :tab){
            System.out.println(MyArticle.toString());
        }
    }
    private int existe(String d){
        int i=0;
        for(Article MyArticle :tab){
          if(MyArticle.getDesing().equals(d)){
              return i;
          }
          i += 1 ;
        }
        
        return -1;
        
    }
    //--------------------------
    private String Sreturn(){
        Scanner input = new Scanner(System.in);
        System.out.print("  Enter Designtion de l'article  : ");
        String d = input.nextLine();
        return d;
    }
    private int Qreturn(){
        Scanner input = new Scanner(System.in);
        System.out.print("  Enter quantite  : ");
        int qn = input.nextInt();
        return qn;
    }
    //--------------------------
    public void Saisie_ventes(int n){
        int N=0;
        while(N < n){
           System.out.println(); 
           String d =Sreturn();   // raed String "desinge"
           int eq = existe(d);
           if(eq != -1){
               int qn =Qreturn(); // lier quntite vent 
               tab.get(eq).vente(qn);
           }
           N++;
           //d="";
        }
        
    }
    
    private float TES(float p,int n){
        return (p*n)/100;
    }
    
    public void Reduire_prix(){
        for(Article MyArticle :tab){
            if(MyArticle.getTotal_vente() < 5){
                float newPrix = MyArticle.getPrix() - TES(MyArticle.getPrix(),10);
                MyArticle.setPrix(newPrix);
                }
        }
    }
    public void Reduire_prix(int n){
        for(Article MyArticle :tab){
            if(MyArticle.getTotal_vente() < 5){
                float newPrix = MyArticle.getPrix() - TES(MyArticle.getPrix(),n);
                MyArticle.setPrix(newPrix);
                }
        }
    }
    
    public int Max_Total_Vente(){
        int max=0;
        for(Article MyArticle :tab){
            if(MyArticle.getTotal_vente() > max ){
                max = MyArticle.getTotal_vente();
            }
        }
        return max;
    }
    
}
