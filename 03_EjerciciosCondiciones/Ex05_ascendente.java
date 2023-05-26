import java.util.Scanner;

public class Ex05_ascendente {
    public static void main(String args[]){
        Scanner ingreso = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Hola, por favor digita el primer número entero: ");
        num1 = ingreso.nextInt();

        System.out.println("Ahora, digita el segundo número entero: ");
        num2 = ingreso.nextInt();

        System.out.println("Y por último, digita el tercer número entero: ");
        num3 = ingreso.nextInt();

        if(num1 < num2 && num1 < num3){
        }
        if (num2 < num3){
            System.out.println("Los números se ingresaron en orden ascendente. ");
        }else{
            System.out.println("Los números NO se ingresaron en orden ascendente. ");
        }

    }
    
}
