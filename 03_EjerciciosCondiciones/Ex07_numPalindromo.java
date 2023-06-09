import java.util.Scanner;

public class Ex07_numPalindromo{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("--> Digita un número entero (maximo 5 digitos): ");
        int numero = input.nextInt();

        if(numero >= 0 && numero <= 99999){

            int digit1 = (numero/10000)%10;
			int digit2 = (numero/1000)%10;
			int digit3 = (numero/100)%10;
			int digit4 = (numero/10)%10;
			int digit5 = numero%10;

            /*
            System.out.println("Digito 1: "+digit1);
            System.out.println("Digito 2: "+digit2);
            System.out.println("Digito 3: "+digit3);
            System.out.println("Digito 4: "+digit4);
            System.out.println("Digito 5: "+digit5);
            */

           
            if(digit5 == digit5){
                if(digit4 == digit5){
                    if(digit3 == digit5){
                        if(digit5 == digit2 && digit4 == digit3){
                            if(digit5 == digit1 && digit4 == digit2){
                                System.out.println("Es palíndromo. ");
                            }
                        }
                    }
                }
            }else{
                System.out.println("No es palíndromo. ");
            }
            


        }else{
            System.out.println(" --> Fuera de rango. Ingresa un valor aceptable. ");
        }

    }
}
