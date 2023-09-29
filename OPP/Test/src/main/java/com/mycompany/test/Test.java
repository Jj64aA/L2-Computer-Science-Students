/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Tp1");
        Scanner input = new Scanner(System.in);
        System.out.print("Gev me h : ");
        int h=input.nextInt();
        Etoile H = new Etoile(h);
        H.afficher();
    }
}
