import java.util.Scanner;

public class Ex03_piramide{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("--> Ingrese altura de la pirámide: ");
        int altura = teclado.nextInt();
        
        int i, espacio=0, equis=0;

        for(i = 1; i <= altura; i++){
            for(espacio = 1; espacio <= altura - i; espacio++){
                System.out.print("-");
            }
            for(equis = 1; equis <= 2 * i - 1; equis++){
                System.out.print("x");
            }

            System.out.println(" ");
        }

        /*
        int i = 1;
        while(i <= altura){
            System.out.print("x");
            i = i + 1;
        }
        System.out.println(" ");   
        */

    }
}