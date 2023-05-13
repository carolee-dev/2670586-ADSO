import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[] args){
        // crear variable de entrada
        Scanner entrada = new Scanner(System.in);

        float num_1;
        float fahren;

        System.out.println("Ingrese valor grados celsius: ");
        num_1 = entrada.nextFloat();

        fahren = (num_1*9/5)+32;

        System.out.println("El valor en Fahrenheit es: "+fahren);
    }
}