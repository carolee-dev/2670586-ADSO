import java.util.Scanner;

public class Ex03_conVariAux{
    public static void main(String[]args){
        // Crear variable de entrada
        Scanner entrada = new Scanner(System.in);

        int num1, num2, variAux;

        System.out.print("-->Ingrese primer número: ");
        num1 = entrada.nextInt();

        System.out.print("-->Ingrese segundo número: ");
        num2 = entrada.nextInt();

        System. out.println("-->Los números iniciales son: " +num1+ " y " +num2);

        variAux = num1;
        num1 = num2;
        num2 = variAux;

        System.out.println("-->Los números intercambiados son: " +num1+ " y " +num2);
    }
}