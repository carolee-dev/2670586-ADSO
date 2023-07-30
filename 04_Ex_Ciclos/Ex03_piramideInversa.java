import java.util.Scanner;
public class Ex03_piramideInversa{
    public static void main(String[]args){
        Scanner lectura = new Scanner(System.in);

        System.out.print("--> Ingrese altura de la pirámide: ");
        int altura = lectura.nextInt();

        
        for(int i = altura; i >= 1; i--){ // Desde acá establezco el decremento

            // Mostrar espacios
            for(int espacio = 1; espacio <= altura - i; espacio++){
                System.out.print("-");
            }
            // Mostras equis
            for(int equis = 0; equis < 2 * i - 1; equis++){
                System.out.print("x");
            }
            
            System.out.println(" ");
        }
    }
}