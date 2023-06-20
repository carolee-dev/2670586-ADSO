import java.util.Scanner;

public class Ex15_convertirLongitud{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        float mt;
        double cm = 100, pulg = 39.37, pies = 3.281;

        System.out.println("Ingrese los metros que desea convertir: ");
        mt = entrada.nextFloat();

        cm = mt*cm;
        pulg = mt*pulg;
        pies = mt*pies;

        System.out.println("Los "+mt+" metros ingresados equivalen a "+cm+" centímetros, "+pulg+" pulgadas y "+pies+" pies.");

    }
    
}
