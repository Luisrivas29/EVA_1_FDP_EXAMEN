/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_examen2;

import java.util.Scanner;

/**
 *
 * @author navar
 */
public class EVA1_4_EXAMEN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);

        // Captura los valores de las resistencias desde tu teclado
        double[] resistencias = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingres la resistencia " + (i + 1) + ": ");
            resistencias[i] = leer.nextDouble();
        }

        // Captura el voltaje
        System.out.print("Ingrese el voltaje: ");
        double voltaje = leer.nextDouble();
        //R_E=resistencia equivalente
        // Calcula la resistencia equivalente
        double R_E = 0;
        for (int i = 0; i < 5; i++) {
            R_E += 1 / resistencias[i];
        }
        R_E = 1 / R_E;

        // Calcular la intensidad de corriente
        double I_C = voltaje / R_E;
        //I_C=Intencidadcorriente
        // Calcula la intensidad de corriente en las resistencias
        double[] intensidadesResistencias = new double[5];
        for (int i = 0; i < 5; i++) {
            intensidadesResistencias[i] = voltaje / resistencias[i];
        }

        // Muestra los resultados al usuario
        System.out.println("Resistencia equivalente: " + R_E);
        System.out.println("Intensidad de corriente: " + I_C);
        System.out.println("Intensidad de corriente en cada resistencia:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Resistencia " + (i + 1) + ": " + intensidadesResistencias[i]);
        }
    }
    
}
