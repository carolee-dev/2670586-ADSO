import java.util.Scanner;

public class Ex10_mostrarPrimos{
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("|---------------------------------------------|");
        System.out.print("--> Ingrese un número igual o menor a 11: ");
        int numIn = lectura.nextInt();

        int x, num, divisor;
        
        if(numIn >= 0 && numIn <= 11){

            for(int fila = 1; fila <= numIn; fila++){
                System.out.println();
                for(num = 1; num <= numIn; num++){
                    x = 1;
                    divisor = 0;
                    while(x <= num){
                        if(num % x == 0){
                            divisor++;
                        }
                        x++;
                    }
                    if(divisor == 2){
                        System.out.println("--> "+num+" es primo. ");
                    }
                }
            }
            System.out.println("|---------------------------------------------|");
        
        }else{
            System.out.println("--> Ingrese un número válido.");
        }
        System.out.println();
    }
}