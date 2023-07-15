import java.util.Scanner;

public class Ex09_numPrimo{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numIn = 0; 
        int divisor = 0;
        int i = 0;

        System.out.print("--> Digite un número para saber si es primo: ");
        numIn = teclado.nextInt();

        for(i = 1; i <= numIn; i++){
            if(numIn % i == 0){
                divisor = divisor + 1;
            }
        }

        if(divisor == 2 && numIn > 1){
            System.out.println("--> El número es primo. ");
        }else{
            System.out.println("--> El número no es primo. ");
        }

        System.out.println("");
        
    }
}