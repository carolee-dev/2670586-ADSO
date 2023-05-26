import java.util.Scanner;

public class Ex04_mayorMenor{
    public static void main(String args[]){
        Scanner tecla = new Scanner(System.in);

        int numero1, numero2, numero3;

        System.out.println("Hola, por favor digita el primer número entero: ");
        numero1 = tecla.nextInt();

        System.out.println("Ahora, digita el segundo número entero: ");
        numero2 = tecla.nextInt();

        System.out.println("Y por último, digita el tercer número entero: ");
        numero3 = tecla.nextInt();

        if(numero1 > numero2 || numero1 > numero3){
            System.out.println("El número mayor es: " + numero1);
            }else if(numero2 > numero3){
                System.out.println("El número mayor es: " + numero2);
            }else{
                System.out.println("El número mayor es: " + numero3);
            }

        if(numero1 < numero2 || numero1 < numero3){
            System.out.println("El número menor es: " + numero1);
            }else if(numero2 < numero3){
                System.out.println("El número menor es: " + numero2);
            }else{
                System.out.println("El número menor es: " + numero3);
            }

    }
}
