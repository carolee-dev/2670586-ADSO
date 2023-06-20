import java.util.Scanner;

public class Ex13_convertirSegundos{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int inputSegs, horas, tiempo, minutos, segundosOut;

        System.out.print("-->Ingrese los segundos que desea convertir: ");
        inputSegs = entrada.nextInt();

        horas = inputSegs / 3600;

        minutos = (inputSegs - (horas*3600)) / 60;

        segundosOut = (inputSegs - ((horas*3600) + (minutos*60)));

        System.out.println("-->Los segundos ingresados equivalen a: "+horas+" horas, "+minutos+" minutos y "+segundosOut+" segundos.");

    }
    
}
