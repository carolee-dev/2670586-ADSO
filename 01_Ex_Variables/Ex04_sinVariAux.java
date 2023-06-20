import java.util.Scanner;

public class Ex04_sinVariAux{
    public static void main(String[]args){
        
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.print("-->Ingrese primer número: ");
        num1 = teclado.nextInt();

        System.out.print("-->Ingrese segundo número: ");
        num2 = teclado.nextInt();

        System. out.println("-->Los números iniciales son: " +num1+ " y " +num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("-->Los números intercambiados son: " +num1+ " y " +num2);
    }
}