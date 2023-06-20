import java.util.Scanner;

public class Ex09_numPrimo{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        int numero=0; 
        int divisores=0;
        int i=0;

        System.out.print("--> Digite un número para saber si es primo: ");
        numero = teclado.nextInt();

        for(i = 1; i <= numero; i++){
            if(numero % i == 0){
                divisores = divisores + 1;
            }
        }

        if(divisores == 2){
            System.out.println("--> El número es primo. ");
        }else{
            System.out.println("El número no es primo. ");
        }
        
    }
}