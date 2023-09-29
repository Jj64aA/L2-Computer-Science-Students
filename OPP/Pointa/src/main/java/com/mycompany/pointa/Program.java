/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pointa;

/**
 *
 * @author USER
 */
public class Program {
    public static void main(String[] args) {
       
        Pointa p2 = new Pointa(2,2);
        p2.afficherCoordonnees();
        Pointa.methode_statique(); // p2.methode_statique();
        p2.methode_statique();
        //Pointa.afficherCoordonnees();
        System.out.println(Pointa.var_statique);
    }
}

/*
                                      x     y     var_statique
Pointa p2 = new Pointa(2,2);       |  3   | 2   |  11
p2.afficherCoordonnees();          |  4   | 2   |  12
Pointa.methode_statique();         |  4   | 2   |  13
System.out.println(Pointa.var_statique);   == > var_static 14 
  


*/