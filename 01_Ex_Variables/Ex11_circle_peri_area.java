import java.util.Scanner;

public class Ex11_circle_peri_area{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        double radio, perimt, area;
        double pi = 3.14159;

        System.out.print("-->Ingrese el radio del círculo: ");
        radio = entrada.nextDouble();

        perimt = (2 * pi * radio);
        area = pi * (radio * radio);

        System.out.println("-->El perímetro es "+perimt+" y el área es "+area);

    }
    
}
