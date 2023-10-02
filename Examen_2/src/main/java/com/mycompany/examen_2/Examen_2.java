/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_2;

import java.util.Scanner;

/**
 *
 * @author mago1
 */
public class Examen_2 {

    public static void main(String[] args) {
        double fahre; 
        double centi;
        double kel;
        
        Scanner grados = new Scanner(System.in);
        
        System.out.println("Introduce la temperatura en grados Fahrenheit");
        fahre = grados.nextDouble();
        centi = (fahre - 32 )* 0.555;
        kel = (fahre - 32 ) * 0.555 + 273.15;
        System.out.println("Grados Centigrados:");
        System.out.println(centi);
        System.out.println("Grados Kelvin:");
        System.out.println(kel);
    }
}
