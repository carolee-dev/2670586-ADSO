import java.util.Scanner;

public class Ex01_posiNega{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        int numero = 0;

        System.out.println("--> Digite un número para saber si es + ó - ");
        numero = teclado.nextInt();

        if(numero > 0){
            System.out.println("--> El número es positivo. ");
        }else if(numero >= 0 && numero <= -0){
            System.out.println("--> El número es negativo. ");
        }

    }
}