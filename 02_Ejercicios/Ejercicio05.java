import java.util.Scanner;

public class Ejercicio05{
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);

        Double base, altura, area;

        System.out.println("\n Calculemos el área de un triángulo :)");
        
        System.out.println("\n Digita el valor de la base: ");
        base = teclado.nextDouble();

        System.out.println("\n Ahora, digita el valor de la altura: ");
        altura = teclado.nextDouble();

        area = (base*altura)/2;

        System.out.println("\n El área del triángulo es: "+area);

    }
    
}
