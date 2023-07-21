import java.util.Scanner;

public class Ex10_mostrarPrimos{
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("|---------------------------------------------|");
        System.out.print("--> Ingrese un número igual o menor a 11: ");
        int N = lectura.nextInt();
        
        if(N >= 0 && N <= 11){

            int num, i, esPrimo, contaPrimos, fila, columna;

            for(fila = 1; fila <= N; fila++){
                System.out.println();

                num = 2;
                contaPrimos = 0;
                fila = 1;
                columna = 1;
                while(contaPrimos < N * N){
                    esPrimo = 1;
                    i = 2;

                    while(i <= num / 2){ // Acá verifico si num es primo. Si algún número divide a num sin dejar residuo.
                        if(num % i == 0){
                            esPrimo = 0; // Variable en 0 para indicar que no es primo
                            i = num; // Para salir del ciclo.
                        }
                        i = i + 1;
                    }
                    if(esPrimo == 1){ //Si no se encuentra ningún divisor, esPrimo sigue siendo 1, lo que indica que num es primo.
                        if(num < 10){
                            System.out.print("[00"+num+"]");
                        }else if(num < 100){
                            System.out.print("[0"+num+"]");
                        }else{
                            System.out.print("["+num+"]");
                        }
                        contaPrimos = contaPrimos + 1;

                        if(contaPrimos % N == 0){
                            fila = fila + 1;
                            columna = 1;
                            System.out.println("");
                        }else{
                            columna = columna + 1;
                        }
                    }
                    num = num + 1;
                }    
                
            }
            System.out.println();
            System.out.println("|---------------------------------------------|");
        
        }else{
            System.out.println("--> Ingrese un número válido.");
        }
        System.out.println();
    }
}