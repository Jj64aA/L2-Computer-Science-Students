/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point;

/**
 *
 * @author USER
 */
 class Point {
     int x;
     int y;
     Point(){
         this.x=0;
         this.y=0;
     }
     Point(int x,int y){
         this.x=x;
         this.y=y;
     }
     void deplace(int x, int y) {
        this. x= this. x+ x ;
        this. y= this. y+ y ;
     }
     void afficher() {
        System.out.println(" ["+x +","+y+"]") ;
       }
}
