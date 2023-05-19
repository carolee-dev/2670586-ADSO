import java.util. Scanner;

public class Ejercicio12 {
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);

        float b, h, area;

        System.out.println("Digite base del rectángulo: ");
        b = teclado.nextFloat();

        System.out.println("Digite altura del rectángulo:");
        h = teclado.nextFloat();

        area = b * h;

        System.out.println("El área del rectángulo es: "+area+"²");

    }
    
}
