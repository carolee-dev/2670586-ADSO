import java.util.Scanner;

public class Ex08_mostrarDigits{
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);

        int numero = 0;

        System.out.print("--> Ingrese un número de 6 dígitos: ");
        numero = lector.nextInt();
        System.out.println("------------------------------------");

        // Bandera
        if(numero >= 0 && numero <= 999999){
            // Bucle para separar número en orden máquina
            int digito = 0;
            int numInvertido = 0;
            int contador = 0;
            while(numero > 0){
                digito = numero % 10;
                numero = numero / 10;
                numInvertido = numInvertido * 10 + digito;
                              
                contador = contador + 1;
            }
            // System.out.println("--> Número invertido es: "+numInvertido);

            // Bucle para separar número "al derecho".
            contador = 0;
            while(numInvertido > 0){
                digito = numInvertido % 10;
                numInvertido = numInvertido / 10;

                contador ++;
                
                System.out.println("--> El dígito "+contador+" es: "+digito);
            }
                
        }else{
            System.out.println("--> Ingrese un número válido.");
        }
        
    }
}