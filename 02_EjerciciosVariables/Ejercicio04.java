import java.util.Scanner;

public class Ejercicio04{
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        int num1, num2;

        System.out.println("Ingrese primer número: ");
        num1 = entrada.nextInt();

        System.out.println("Ingrese segundo número: ");
        num2 = entrada.nextInt();

        System. out.println("Los números iniciales son: " +num1+ " y " +num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Los números intercambiados son: " +num1+ " y " +num2);
    }
}