import java.util.Scanner;

public class Ex05_areaTriangulo{
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);

        double base, altura, area;

        System.out.println("\n Calculemos el área de un triángulo :)");
        
        System.out.print("-->Digita el valor de la base: ");
        base = teclado.nextDouble();

        System.out.print("-->Ahora, digita el valor de la altura: ");
        altura = teclado.nextDouble();

        area = (base*altura)/2;

        System.out.println("-->El área del triángulo es: "+area);

    }
    
}
