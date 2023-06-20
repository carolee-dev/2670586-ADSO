import java.util.Scanner;

public class Ex02_celsiusFahren{
    public static void main(String[]args){
        // Crear variable de entrada
        Scanner entrada = new Scanner(System.in);

        float celsius;
        float fahren;

        System.out.print("-->Ingrese el valor en grados Celsius: ");
        celsius = entrada.nextFloat();

        fahren = (celsius*9/5)+32;

        System.out.println("-->El valor en grados Fahrenheit es: "+fahren);

    }
}