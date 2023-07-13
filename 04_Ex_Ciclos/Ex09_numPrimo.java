import java.util.Scanner;

public class Ex09_numPrimo{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero = 0; 
        int divisor = 0;
        int i = 0;

        System.out.print("--> Digite un número para saber si es primo: ");
        numero = teclado.nextInt();

        for(i = 1; i <= numero; i++){
            if(numero % i == 0){
                divisor = divisor + 1;
            }
        }

        if(divisor == 2 && numero > 1){
            System.out.println("--> El número es primo. ");
        }else{
            System.out.println("--> El número no es primo. ");
        }
        
    }
}