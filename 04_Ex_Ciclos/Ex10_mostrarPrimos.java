import java.util.Scanner;

public class Ex10_mostrarPrimos{
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("|---------------------------------------------|");
        System.out.print("--> Ingrese un número igual o menor a 11: ");
        int N = lectura.nextInt();
        
        if(N >= 0 && N <= 11){

            int num, i, esPrimo, contador, fila, columna;

            for(fila = 1; fila <= N; fila++){
                System.out.println();

                num = 2;
                contador = 0;
                fila = 1;
                columna = 1;
                while(contador < N * N){
                    esPrimo = 1;
                    i = 2;

                    while(i <= num / 2){
                        if(num % i == 0){
                            esPrimo = 0;
                            i = num;
                        }
                        i = i + 1;
                    }
                    if(esPrimo == 1){
                        if(num <= 10){
                            System.out.print("[00"+num+"]");
                        }else if(num < 100){
                            System.out.print("[0"+num+"]");
                        }else{
                            System.out.print("["+num+"]");
                        }
                        contador = contador + 1;

                        if(contador % N == 0){
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