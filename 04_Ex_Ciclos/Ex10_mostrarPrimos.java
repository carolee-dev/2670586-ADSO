import java.util.Scanner;

public class Ex10_mostrarPrimos{
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("|---------------------------------------------|");
        System.out.print("--> Ingrese un número igual o menor a 11: ");
        int N = lectura.nextInt();
        
        if(N >= 0 && N <= 11){

            int num, i, esPrimo, contador;

            for(int fila = 1; fila <= N; fila++){
                System.out.println();
                for(num = 1; num <= N; num++){

                    num = 2;
                    contador = 0;
                    while(contador < N){
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
                            System.out.print("["+num+"]");
                            contador = contador + 1;
                        }
                        num = num + 1;
                    }
                    
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