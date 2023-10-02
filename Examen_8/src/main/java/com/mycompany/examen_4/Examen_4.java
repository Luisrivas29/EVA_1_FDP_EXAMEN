/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_4;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author mago1
 */
public class Examen_4 {

    public static void main(String[] args) {
        double x;
        double y;
        double div;
        double Div;
        double X;
        double Y;
        double f;
               
        
        Scanner captu = new Scanner(System.in);
                
        System.out.println("Introduce el centro en eje X");
        x = captu.nextDouble();
        System.out.println("Introduce el cerntro en eje Y");
        y = captu.nextDouble();
        System.out.println("Introduce tu primer divisor");
        div = captu.nextDouble();
        System.out.println("Introduce tu segundo divisor");
        Div = captu.nextDouble();
        X = Math.sqrt(div);
        Y = Math.sqrt(Div);
        f = Math.sqrt(div + Div);
        System.out.println("El vector es:" + X + " en ambos lados del eje x partiendo del centro");
        System.out.println("El vector es:" + Y + " en ambos lados del eje y partiendop del centro");
        System.out.println("El foco es:" + f + " en ambos lados del eje x partiendo del centro");
        System.out.println("El centro es igual a: " + x + "," + y);
        

     
        
    }
}
