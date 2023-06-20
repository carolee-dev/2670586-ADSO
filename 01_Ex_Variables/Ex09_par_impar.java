import java.util.Scanner;

public class Ex09_par_impar{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        int numero = 0;

        System.out.print("-->Ingresa un número para saber si es par o impar: ");
        numero = teclado.nextInt();

        if(numero % 2 == 0){
            System.out.println("-->El número es par.");
        }
        else{
            System.out.println("-->El número es impar.");
        } 

    }
    
}
