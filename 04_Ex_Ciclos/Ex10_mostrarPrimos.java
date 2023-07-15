import java.util.Scanner;

public class Ex10_mostrarPrimos{
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("|---------------------------------------------|");
        System.out.print("--> Ingrese un número igual o menor a 11: ");
        int numIn = lectura.nextInt();

        int x, num, contador;
        
        if(numIn >= 0 && numIn <= 11){
            
            for(num = 1; num <= numIn; num++){
                x = 1;
                contador = 0;
                while(x <= num){
                    if(num % x == 0){
                        contador++;
                    }
                    x++;
                }
                if(contador == 2 && numIn > 1){
                    System.out.println("["+num+"]");
                }
            }
            System.out.println("|---------------------------------------------|");
        
        }else{
            System.out.println("--> Ingrese un número válido.");
        }
    }
}