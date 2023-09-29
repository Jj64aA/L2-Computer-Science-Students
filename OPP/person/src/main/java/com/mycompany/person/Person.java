/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.person;

/**
 *
 * @author USER
 */
public class Person {
    private String Fullname;
    private int age;
    private String adress;

    public Person() {
        
        System.out.println("vid constrecter");
        
    }
    
    
    
    public Person( String Fullname ,int age,String adress){
        this.Fullname=Fullname;
        this.adress=adress;
        this.age=age;
    }
    public String getName(){
        return Fullname;
    } 
    public int getAge(){
        return age;
    }
    public String getAdress(){
        return adress;
    }
    public  void exp(){
        System.out.println("Full name : "+getName());
        System.out.println("Age       : "+getAge());
        System.out.println("Adress    : "+getAdress());
    }
}
