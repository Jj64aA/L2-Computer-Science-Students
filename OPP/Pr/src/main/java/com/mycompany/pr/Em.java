/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pr;

/**
 *
 * @author USER
 */
public class Em extends Pr{    
    public int code ;
    public String jobe;
    public float salire ;

    public Em(int code, String jobe, float salire, String name, int age, String adrres) {
        super(name, age, adrres);
        this.code = code;
        this.jobe = jobe;
        this.salire = salire;
    }
    
    public void info(){
        
        super.info();
        System.out.println(" Code :"+code);
        System.out.println(" Name job :"+jobe);
        System.out.println(" Dz :"+salire);
        
        
    }
    
    
    
}
