import java.util.Scanner;

public class Ex08_mostrarDigits{
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);

        System.out.print("--> Ingrese un número de 6 dígitos: ");
        int numero = lector.nextInt();
        
        int digito1 = (numero % 1000000)/100000;
        int digito2 = (numero % 100000)/10000;
        int digito3 = (numero % 10000)/1000;
        int digito4 = (numero % 1000)/100;
        int digito5 = (numero % 100)/10;
        int digito6 = (numero % 10);

        if(numero >= 0 && numero <= 999999){
            
            

            // System.out.println("El dígito "+i+" es: "+digito);

        }else{
            System.out.println("--> Ingrese un número válido.");
        }
        
    }
}