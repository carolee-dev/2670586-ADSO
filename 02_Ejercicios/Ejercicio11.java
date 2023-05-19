import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        double rad, perimt, area;
        double pi = 3.14159;

        System.out.println("Ingrese el radio del círculo: ");
        rad = entrada.nextFloat();

        perimt = (2*pi*rad);
        area = pi*(rad*rad);

        System.out.println("El perímetro es "+perimt+" y el área es "+area);

    }
    
}
