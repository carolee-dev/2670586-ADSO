import java.util.Scanner;

public class Ex10_div_resto{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        float num1, num2, div, resto;

        System.out.println("-->Ingrese dos números: ");
        num1 = teclado.nextFloat();
        num2 = teclado.nextFloat();

        div = num1/num2;
        resto = num1%num2;

        System.out.println("El resultado de la división es: "+div+" y su residuo es: "+resto);        

    }
    
}
