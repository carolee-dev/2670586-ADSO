import java.util.Scanner;
public class Ex07_separarMiles {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        int nums = 0;

        System.out.println("Ingresa un número máximo de 10 dígitos e inferior a dos mil millones: ");
        nums = input.nextInt();

        System.out.println("// ---------- FORMATO DE MONEDA ----------- //");


        int miles1 = (nums % 1000000000) / 1000000;
        int miles2 = (nums % 1000000) / 1000;
        int miles3 = (nums % 1000) / 1;
        int miles4 = (nums % 10);

        if (nums > 999999999 && nums <= 2147483647){
            System.out.println("Moneda: $ "+miles1+"."+miles2+"."+miles3+"."+miles4);
        }

        if (nums > 999999 && nums <= 999999999){
            System.out.println("Moneda: $ "+miles1+"."+miles2+"."+miles3);
        }

        if (nums > 999 && nums <= 999999){
            System.out.println("Moneda: $ "+miles1+"."+miles2);
        }

        if (nums >= 0  && nums <= 999){
            System.out.println("Moneda: $ "+miles1+"."+miles2);
        }

        if (nums > 2147483647){
            System.out.println("Ingrese número no mayor a 2.147.483.647 ");
        }
        

    }
    
}
