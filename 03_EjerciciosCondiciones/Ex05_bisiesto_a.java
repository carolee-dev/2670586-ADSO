import java.util.Scanner;

public class Ex05_bisiesto_a{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        int anio;

        System.out.println("--> Digite un año para saber si es o no bisiesto: ");
        anio = entrada.nextInt();

        if(anio % 4 == 0){
            if(anio % 100 == 0){
                if(anio % 400 == 0){
                    System.out.println("Es bisiesto. ");
                }else{
                    System.out.println("No es bisiesto. ");
                }

            }else{
                System.out.println("Es bisiesto. ");
            }

        }else{
            System.out.println("No es bisiesto. ");
        }
        
    }
}