import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        float num1, num2, div, resid;

        System.out.println("Ingrese dos números: ");
        num1 = teclado.nextFloat();
        num2 = teclado.nextInt();

        div = num1/num2;
        resid = num1%num2;

        System.out.println("El resultado de la división es: "+div+" y su residuo es: "+resid);        

    }
    
}
