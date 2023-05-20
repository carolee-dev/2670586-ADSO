import java.util.Scanner;

public class Ex01_SaludoEdad {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        int edad = 0;

        System.out.println("Hola usuario :) ");

        System.out.print("¿Cuántos años tienes? ");
        edad = teclado.nextInt();

        if(edad < 17){
            System.out.println("Eres menor de edad y recibes un auxilio de $800.000 ");
        }else{
            if(edad > 18){System.out.println("Eres mayor de edad y pagas un impuesto de $200.000 ");
            }
        }

        if(edad <= 0){
            System.out.println("Digita una edad válida");
        }

        if(edad >= 100){
            System.out.println("Haz tenido una larga vida");
        }

    }
}