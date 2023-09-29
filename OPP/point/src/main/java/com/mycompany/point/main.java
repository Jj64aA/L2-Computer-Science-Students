/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.point;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class main {
     public static void main(String[] args) {
        System.out.println("Tp1");
        Scanner input = new Scanner(System.in); 
        String s="m";
        String s1="m1";


        System.out.print("Donne x de point :");
        float x=input.nextFloat();
        System.out.print("Donne y de point :");
        float y=input.nextFloat();
        
        System.out.print("Donne x de point 2 :");
        float x1=input.nextFloat();
        System.out.print("Donne y de point 2:");
        float y1=input.nextFloat();
        
        Point p =new Point(x,y,s);
        Point p1 =new Point(x1,y1,s1);

        p.afficher();
        p1.afficher();
        System.out.println("Choisis une option 1==>deplace point 2==>distance deux point ");
        System.out.print("yes ou no :");
        int ga =input.nextInt();
        if(ga ==1){
            System.out.print("Donne dx :");
            float dx=input.nextFloat();
            System.out.print("Donne dy :");
            float dy=input.nextFloat();
            p.deplace(dx, dy);
            System.out.println("point apré deplce");
            p.afficher();
        }
        if(ga ==2){
            System.out.println("distant deux point m et m2");
            System.out.println("distant:"+p.distance(p1));

        }
        else{
            System.out.println("fin program //");
        }
    }
}
