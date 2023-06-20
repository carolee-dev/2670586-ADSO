import java.util.Scanner;

public class Ex15_convertirMetros{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        double mt;
        double cm = 100, pulg = 39.37, pies = 3.281;

        System.out.print("-->Ingrese los metros que desea convertir: ");
        mt = entrada.nextDouble();

        cm = mt*cm;
        pulg = mt*pulg;
        pies = mt*pies;

        System.out.println("-->Los metros ingresados equivalen a: "+cm+" centímetros, "+pulg+" pulgadas y "+pies+" pies.");

    }
    
}
