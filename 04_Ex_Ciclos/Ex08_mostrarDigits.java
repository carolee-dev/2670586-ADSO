import java.util.Scanner;

public class Ex08_mostrarDigits{
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);

        System.out.print("--> Ingrese un número de 6 dígitos: ");
        int numero = lector.nextInt();

        if(numero >= 0 && numero <= 999999){
            int digito = numero % 10;

            for(int i = 1; i <= numero || numero != 0; i++){
                numero = numero / 10;
                System.out.println("--> El dígito "+i+" es: "+digito);
            }
                

        }else{
            System.out.println("--> Ingrese un número válido.");
        }
        
    }
}