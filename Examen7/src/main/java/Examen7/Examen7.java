
package Examen7;
import java.util.Scanner;

/**
 *
 * @author raulr
 */
public class Examen7 {

    public static void main(String[] args) {
        
         double pendiente;
         double area;
         double valor1;
         double valor2;
         double valor3;
         Scanner input = new Scanner(System.in);
         
         //Calcular la pendiente y el area
        System.out.println("Introduce el valor de x del cual quieras saber su pendiente");
         valor1 = input.nextDouble();
         System.out.println("Introduce el primer valor de x para calcular su area (primero el numero mayor)");
         valor2 = input.nextDouble();
         System.out.println("Introduce el segundo valor de x para calcular su area");
         valor3 = input.nextDouble();
          area = ((valor2*valor2*valor2)/3) - ((valor3*valor3*valor3)/3);
         pendiente = (valor1)* (valor1);
         System.out.println("La pendiente de x es: " + pendiente);
         System.out.println("El area entre los dos valores de x es igual a: " + area + " unidades cuadradas");
        
         
         
    }
}
