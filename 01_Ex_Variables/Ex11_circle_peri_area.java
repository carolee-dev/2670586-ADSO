import java.util.Scanner;
public class Ex11_circle_peri_area{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        double rad, perimt, area;
        double pi = 3.14159;

        System.out.println("Ingrese el radio del círculo: ");
        rad = entrada.nextDouble();

        perimt = (2*pi*rad);
        area = pi*(rad*rad);

        System.out.println("El perímetro es "+perimt+" y el área es "+area);

    }
    
}
