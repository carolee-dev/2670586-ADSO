import java.util.Scanner;

public class Ex20_suma5Digitos{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" Ingresa un número máximo de 5 dígitos: ");
        int numero = entrada.nextInt();

        /* 
        int digito1 = (numero%10);
        int digito2 = (numero%100)/10;
        int digito3 = (numero%1000)/100;
        int digito4 = (numero%10000)/1000;
        int digito5 = (numero%100000)/10000; 
        */

        int digito1 = (numero%100000)/10000;
        int digito2 = (numero%10000)/1000;
        int digito3 = (numero%1000)/100;
        int digito4 = (numero%100)/10;
        int digito5 = (numero%10);

        System.out.println(" Dígito 1 es: "+digito1);
        System.out.println(" Dígito 2 es: "+digito2);
        System.out.println(" Dígito 3 es: "+digito3);
        System.out.println(" Dígito 4 es: "+digito4);
        System.out.println(" Dígito 5 es: "+digito5);

        int resultado = digito1 + digito2 + digito3 + digito4 + digito5;
        System.out.println(" La suma de los dígitos es: "+resultado);

    }
}