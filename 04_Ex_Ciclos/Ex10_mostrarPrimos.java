import java.util.Scanner;

public class Ex10_mostrarPrimos{
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("|---------------------------------------------|");
        System.out.print("--> Ingrese un número igual o menor a 11: ");
        int N = lectura.nextInt();
        
        if(N <= 0 || N > 11){
            System.out.println("--> Ingrese un número válido. ");
            return;
        }

        int numero = 2;
        int cantiPrimos = 0;

        System.out.println("Los números primos encontrados son: ");

        while(cantiPrimos < N * N){
            if(numPrimo(numero)){
                System.out.println("["+numero+"]");
                cantiPrimos = cantiPrimos + 1;
            }
            numero++;
        }
        System.out.println("|---------------------------------------------|");

    }

    public static boolean numPrimo(int numero){
        if(numero <= 1){
            return false;
        }
        int limite = (int) Math.sqrt(numero);

        for(int i = 2; i <= limite; i++){
            if(numero % i == 0){
                return false;
            }
        }
        return true;

    }
}