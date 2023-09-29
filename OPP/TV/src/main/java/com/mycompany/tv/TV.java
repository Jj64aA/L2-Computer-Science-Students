/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tv;

/**
 *
 * @author USER
 */
public class TV {
    boolean On;
    int chaine ;
    int volume=0;
    
    int ch1=0,ch2=0,ch3=0,ch4=0;
    //-----------------
    public TV(){
        On =true;
    }
    public TV(boolean O,int ch){
       On=O;
       chaine=ch ;
       volume=0; 
    }
    //------------------
    public void allumer(){
        On=true;
    }
    public void eteindre(){
        On=false;
    }
    //-------------------
    public void setChine(int ch){
        if(On == true){
            if( ch>=0 && ch<=9999 ){
                chaine=ch;
                ch1=ch2;
                ch2=ch3;
                ch3=ch4;
                ch4=chaine;
            }else{
               chaine=0;
               On=false;
        }
        }else{
            System.out.println(" error 404 ");
        }
    }
    //---------------------
    public void chaineUp(){
        setChine(chaine+1);
    }
    //--------------------
    public void chaineDown(){
        setChine(chaine-1);
    }
    //--------------------
    public void volUp(){
        if(volume <=9){
            volume ++;
            System.out.println("-volume "+volume+"-");
        }else{
            System.out.println("-volume MAX-");
        }
    }
    public void volDown(){
         if(volume > 0){
             volume --;
             System.out.println("-volume "+volume+"-");
         }else{
            System.out.println("-volume MIN-"); 
         }
    }
    //--------------------
    public void reCall(){
        System.out.println("Historiy chaine");
        System.out.println("--"+ch1+"--");
        System.out.println("--"+ch2+"--");
        System.out.println("--"+ch3+"--");
        System.out.println("--"+ch4+"--");


    }
}
