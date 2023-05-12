import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[] args){
        // crear variable de entrada
        Scanner entrada = new Scanner(System.in);

        int num_1;
        int num_2;
        int result;

        System.out.println("Ingrese primer número: ");
        num_1 = entrada.nextInt();

        System.out.println("Ingrese segundo número: ");
        num_2 = entrada.nextInt();

        result = num_1+num_2;

        System.out.println("El resultado es: "+result);
    }
}