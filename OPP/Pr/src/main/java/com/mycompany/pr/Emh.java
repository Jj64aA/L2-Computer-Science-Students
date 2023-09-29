/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pr;

/**
 *
 * @author USER
 */
public class Emh extends Em{
    
    public int h;

    public Emh(int h, int code, String jobe, float salire, String name, int age, String adrres) {
        super(code, jobe, salire, name, age, adrres);
        this.h = h;
    }
    
    private float salireEMH(){
        
        return h*salire;
        
    }
    
    public void info(){
        
        super.info();
        System.out.println(" salireEMH (h) :"+salireEMH());
        
    }
    
    
    
    
    
}
