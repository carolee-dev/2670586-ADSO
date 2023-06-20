import java.util.Scanner;

public class Ex09_par_impar{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        int num = 0;

        System.out.println("Ingresa un número: ");
        num = teclado.nextInt();

        if(num % 2 == 0){
            System.out.println("El número es par.");
        }
        else{
            System.out.println("El número es impar.");
        } 

    }
    
}
