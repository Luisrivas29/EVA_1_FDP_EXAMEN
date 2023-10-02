/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_3;

import java.util.Scanner;

/**
 *
 * @author mago1
 */
public class Examen_3 {

    public static void main(String[] args) {
        double radio;
        double metros;
        double cubic;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce el radio en mtrs");
        radio = captu.nextDouble();
        System.out.println("Introdice la velocidad en m/s");
        metros = captu.nextDouble();
        cubic = (radio * radio * 3.1416) * (metros); 
        System.out.println("La cantidad es:");
        System.out.println(cubic + "m³");
    }
}
