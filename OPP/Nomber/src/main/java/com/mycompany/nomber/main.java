/*;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomber;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        float x,y,w,z;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Donne nomber 1 :");
        x = input.nextFloat();
        
        System.out.println("Donne nomber 2 :");
        y = input.nextFloat();
        
        System.out.println("Donne nomber 3 :");
        w = input.nextFloat();
        
        System.out.println("Donne nomber 4 :");
        z = input.nextFloat();
        
        Nomber M1 = new Nomber(x,y,w,z);
        
        System.out.println("somme   :"+M1.somme());
        System.out.println("multple : "+M1.mult());
    }
}
