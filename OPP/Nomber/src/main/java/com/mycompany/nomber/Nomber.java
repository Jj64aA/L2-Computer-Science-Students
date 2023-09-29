/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nomber;

/**
 *
 * @author USER
 */
public class Nomber {
      float a;
      float b ;
      float c;
      float d;

    public Nomber(float x,float y , float w, float z) {
        a = x;
        b = y; 
        c = w;
        d = z;
    }
     
    public float somme(){
        return a+b+c+d;
    }
    
    public float mult(){
        return a*b*c*d;
    }
    
}
