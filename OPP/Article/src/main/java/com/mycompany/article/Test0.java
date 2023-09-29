/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.article;

/**
 *
 * @author USER
 */
public class Test0 {
     public static void main(String[] args) {
         Article a = new Article();
         
         System.out.print(a.toString());
         System.out.println("----------------------");

         System.out.println(" "+a.getDesing()+"---"+a.getPrix()+"---"+a.getTotal_vente());
         a.vente(15);
         
         System.out.print(a.toString());
         a.setPrix(70000);
         System.out.print(a.toString());
         
         
         
         
     }
     
}
