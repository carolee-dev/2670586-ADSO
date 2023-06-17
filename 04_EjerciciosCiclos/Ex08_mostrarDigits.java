import java.util.Scanner;

public class Ex08_mostrarDigits{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        int numero = 0; 
        int conta = 0;
        int cantidad = 0;


        System.out.print("--> Ingrese un número de 6 dígitos: ");
        numero = teclado.nextInt();
        int cant_digitos = numero;

        if(numero >= 0 && numero <= 999999){
            for(conta = 1; cant_digitos >= 10; conta++){
                cant_digitos = cant_digitos / 10;
            }
            System.out.println(conta);

            for(int w = 1; w <= conta ; w++){



            }





            // int digito1 = (numero % 1000000)/100000;
            // int digito2 = (numero % 100000)/10000;
            // int digito3 = (numero % 10000)/1000;
            // int digito4 = (numero % 1000)/100;
            // int digito5 = (numero % 100)/10;
            // int digito6 = (numero % 10);

            // System.out.println("El dígito "+conta+" es: "+digito);

        }else{
            System.out.println("--> Ingrese un número válido.");
        }
        
    }
}