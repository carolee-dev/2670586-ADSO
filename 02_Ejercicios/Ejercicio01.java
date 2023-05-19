import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[] args){
        // crear variable de entrada
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese primer número: ");
        int num_1 = entrada.nextInt();

        System.out.println("Ingrese segundo número: ");
        int num_2 = entrada.nextInt();

        int result = num_1+num_2;
        System.out.println("El resultado es: "+result);
    }
}