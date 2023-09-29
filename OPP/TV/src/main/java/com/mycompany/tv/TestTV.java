/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tv;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class TestTV {
    public static void main(String[] args) {
        TV mytv =new TV();
        System.out.println("volume : "+mytv.volume);
        mytv.setChine(22);
        mytv.setChine(3);
        mytv.setChine(5);
        mytv.setChine(66);
        mytv.setChine(90);
        System.out.println("---chain--- : "+mytv.chaine);
        mytv.reCall();
        mytv.volUp();
        mytv.volUp();
        System.out.println("volume : "+mytv.volume);
    }
}
