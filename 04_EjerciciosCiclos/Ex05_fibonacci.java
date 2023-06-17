import java.util.Scanner;

public class Ex05_fibonacci{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int fibo1 = 0;
        int fibo2 = 1;
        int conta = 1;
        int fiboActual = 0;
        
        System.out.println("--> Ingrese un número para ver la sucesión Fibonacci: ");
        numero = entrada.nextInt();

        while(conta <= numero){
            if(conta == 1){
                System.out.print(fibo1+" ");
            }
            if(conta == 2){
                System.out.print(fibo2+" ");
            }
            if(conta > 2){
                fiboActual = fibo1 + fibo2;
                System.out.print(fiboActual+" ");
                fibo1 = fibo2;
                fibo2 = fiboActual;
            }

            conta = conta + 1;
        }

    }

}