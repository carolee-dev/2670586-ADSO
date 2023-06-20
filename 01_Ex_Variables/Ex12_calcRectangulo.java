import java.util. Scanner;

public class Ex12_calcRectangulo{
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);

        float base, height, area;

        System.out.print("-->Digite base del rectángulo: ");
        base = teclado.nextFloat();

        System.out.print("-->Digite altura del rectángulo: ");
        height = teclado.nextFloat();

        area = base * height;

        System.out.println("El área del rectángulo es de: "+area+"²");

    }
    
}
