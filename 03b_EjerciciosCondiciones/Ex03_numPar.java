import java.util.Scanner;

public class Ex03_numPar{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Hola, ingresa un número y te diré si es par o impar: ");
        int numero = input.nextInt();

        if(numero % 2 == 0){
            System.out.println("--> El número es par.");
        }else{
            System.out.println("--> El nuúmero es impar. ");
        }

    }
}