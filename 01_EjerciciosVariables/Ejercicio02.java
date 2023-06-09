import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[] args){
        // crear variable de entrada
        Scanner entrada = new Scanner(System.in);

        float cels;
        float fahren;

        System.out.println("Ingrese valor grados celsius: ");
        cels = entrada.nextFloat();

        fahren = (cels*9/5)+32;

        System.out.println("El valor en Fahrenheit es: "+fahren);

    }
}