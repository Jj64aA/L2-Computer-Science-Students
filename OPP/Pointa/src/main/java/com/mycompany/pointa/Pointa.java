/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pointa;

/**
 *
 * @author USER
 */
public class Pointa {
   int x;
   int y;
   static int var_statique=7;
   
   Pointa(int a,int b){                           
       var_statique=var_statique+3;   
       x = a;                       
       y = b ;                      
       afficherCoordonnees();
       
   }
   static void methode_statique(){
       var_statique++;
   }
   void afficherCoordonnees(){                    //(4,2)     var_static = 12
       x++;                                 
       System.out.println("("+x+","+y+")");      // (4,2) 
       var_statique++;                            
   }
}
