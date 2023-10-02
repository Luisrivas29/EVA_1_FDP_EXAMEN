/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_examen;

import java.util.Scanner;

/**
 *
 * @author navar
 */
public class EVA1_6_EXAMEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la velocidad inicial angular (en radianes/s): ");
        double V_I = leer.nextDouble();
        //V_I=Velocidad Inicial
        System.out.print("Ingrese la velocidad angular final (en radianes/s): ");
        double V_F = leer.nextDouble();
        //V_F= Velocidad Final
        System.out.print("Ingrese el tiempo de rotación (en segundos): ");
        double T_R = leer.nextDouble();
        //T_R=Tiempo de rotacion
        System.out.print("Ingrese el radio de la rueda (en metros): ");
        double radio = leer.nextDouble();

        double distancia_Angular = (V_I + V_F) * T_R / 2;
        double distancia_En_Metros = distancia_Angular * radio;
        double velocidad_Angular_Promedio = (V_I + V_F) / 2;
        double velocidad_Promedio = velocidad_Angular_Promedio * radio;
        double aceleracion_Angular = (V_F - V_I) / T_R;
        double aceleracion_En_Metros = aceleracion_Angular * radio;
        double frecuencia_De_Giro = velocidad_Angular_Promedio / (2 * Math.PI);

        System.out.println("Distancia angular recorrida: " + distancia_Angular + " radianes");
        System.out.println("Distancia en metros recorrida: " + distancia_En_Metros + " metros");
        System.out.println("Velocidad angular promedio: " + velocidad_Angular_Promedio + " radianes/s");
        System.out.println("Velocidad en m/s promedio: " + velocidad_Promedio + " m/s");
        System.out.println("Aceleración angular: " + aceleracion_Angular + " radianes/s²");
        System.out.println("Aceleración en m/s²: " + aceleracion_En_Metros + " m/s²");
        System.out.println("Frecuencia de giro: " + frecuencia_De_Giro + " Hertz");
    }

}
