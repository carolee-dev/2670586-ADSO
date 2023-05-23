import java.util.Scanner;

public class Ex02_parImpar {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola usuario, ingresa un número de 3 dígitos y te diré si es par o impar: ");
        int numero = entrada.nextInt();

        if (numero <= 100){
            System.out.println("El número deber ser de 3 digitos. ");
            }
        else{ 
            if (numero%2 == 0){
                System.out.println("El número es par. ");
            }
            else{
                System.out.println("El número es impar. ");
            }
        }

        if (numero >= 999) {
            System.out.println("...Pero no es válido. ");
        }
    }    
    
}
