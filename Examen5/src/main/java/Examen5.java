import java.util.Scanner;

public class Examen5 {
        public static void main(String[] args) {
            
            double velo;
            double altura;
            double distancia;
            Scanner input = new Scanner(System.in);
            
            System.out.println("introduce la velocidad inicial en m/s");
            velo = input.nextDouble();
            altura = (elevarCuadrado(velo))*(0.5)/19.62;
            distancia = (elevarCuadrado(velo)*(1)/9.81);
            System.out.println("La altura maxima es " + altura + " metros");
            System.out.println("La distancia que alcanza el objeto es " + distancia + " metros");
    } 
    public static double elevarCuadrado(double x){
        return x*x;
    }
}
