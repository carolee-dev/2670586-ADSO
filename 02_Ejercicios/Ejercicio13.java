import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int seg; 
        float hr=3600, min=60;

        System.out.println("Ingrese los segundos que desea convertir: ");
        seg = entrada.nextInt();

        hr = seg/hr;
        min = seg/min;
        seg = seg;

        System.out.println("Los "+seg+" segundos ingresados equivalen a "+hr+" horas y "+min+" minutos.");

    }
    
}
