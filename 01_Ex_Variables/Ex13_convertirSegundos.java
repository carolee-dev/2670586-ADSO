import java.util.Scanner;

public class Ex13_convertirSegundos{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese los segundos que desea convertir: ");
        int seg = entrada.nextInt();

        int sobrante = 0; 

        int hr = seg/3600;
        sobrante = seg - (hr*3600);
        
        int min = sobrante/60;
        sobrante = sobrante - (min*60);

        seg = sobrante/1;

        System.out.println("Los "+seg+" segundos ingresados equivalen a "+hr+" horas "+min+" minutos y "+seg+" segundos.");

    }
    
}
