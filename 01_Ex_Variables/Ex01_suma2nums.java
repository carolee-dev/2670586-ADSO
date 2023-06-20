import java.util.Scanner;

public class Ex01_suma2nums{
    public static void main(String[]args){
        // Crear variable de entrada
        Scanner entrada = new Scanner(System.in);

        System.out.print("-->Ingrese primer número: ");
        int num_1 = entrada.nextInt();

        System.out.print("-->Ingrese segundo número: ");
        int num_2 = entrada.nextInt();

        int result = num_1+num_2;
        System.out.println("-->El resultado es: "+result);
    }
}