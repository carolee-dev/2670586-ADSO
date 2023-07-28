import java.util.Scanner;

public class Ex03_primosRandom {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.print("--> Ingrese un número N: ");
        int N = lectura.nextInt();

        int num, i, esPrimo, contaPrimos;

        num = 2;
        contaPrimos = 0;

        System.out.println("--> Primos aleatorios: ");
        
        while(contaPrimos < N){
            esPrimo = 1;
            i = 2;

            while(i <= num / 2){ // Acá verifico si num es primo. Si algún número divide a num sin dejar residuo.
                if(num % i == 0){
                    esPrimo = 0; // Variable en 0 para indicar que no es primo
                    i = num; // num se guarda en i para salir del ciclo.
                }
                i = i + 1;
            }
            if(esPrimo == 1){ // Si no se encuentra ningún divisor, esPrimo sigue siendo 1, lo que indica que num es primo.
                System.out.print(num);
                contaPrimos++;

                int primoRandom = ((int) (Math.random() * num));
                System.out.println("     Primo "+contaPrimos+" generado -> "+primoRandom);
            }
            num = num + 1;

        }
        System.out.println();
    }
}