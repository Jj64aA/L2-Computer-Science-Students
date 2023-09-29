/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author USER
 */
public class Etoile {
    int h;
    Etoile(int h){
        this.h=h;
    }
    void dep(int x){
        int i;
        for(i=1;i<=x;i++){
            System.out.print(" ");
        }
    }
    void afficher(){
    int i;
    int h1=this.h;
    for(i=1;i<=this.h;i++){
        dep(h1);
        for(int j =1;j<=i;j++){
            System.out.print("*");
            System.out.print(" ");
            }
        System.out.println();
        h1--;
        }
    }
}
