import java.util.Scanner;

public class Ex02_mayorDe4{
    public static void main(String args[]){
        Scanner tecla = new Scanner(System.in);

        int numero1, numero2, numero3, numero4;

        System.out.println("--> Hola, digita el primer número: ");
        numero1 = tecla.nextInt();

        System.out.println("--> Digita el segundo número: ");
        numero2 = tecla.nextInt();

        System.out.println("--> Digita el tercer número: ");
        numero3 = tecla.nextInt();

        System.out.println("--> Digita el cuarto número: ");
        numero4 = tecla.nextInt();

        if(numero1 > numero2 && numero1 > numero3 && numero1 > numero4){
            System.out.println("El número mayor es: " + numero1);
            }else if(numero2 > numero3 && numero2 > numero4 && numero2 > numero1){
                System.out.println("El número mayor es: " + numero2);
            }else if(numero3 > numero1 && numero3 > numero2 && numero3 > numero4){
                System.out.println("El número mayor es: " + numero3);
            }else{
                System.out.println("El número mayor es: " + numero4);
            }

    }
}
