import java.util.Scanner;

public class Ex05_fibonacci{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int i = 0;
        int a = 0;
        int b = 1;
        int c = 0;

        System.out.print("--> (for) Ingrese un número para ver la sucesión Fibonacci: ");
        numero = entrada.nextInt();

        for(i = 0; i < numero; i++){
            if(i < (numero - 1)){
                System.out.print(a+", ");
                c = a + b;
                a = b;
                b = c;
            }else{
                System.out.print(a);
            }
        }
        System.out.println("");

        numero = 0;
        i = 0;
        a = 0;
        b = 1;
        c = 0;

        System.out.print("--> (while) Ingrese un número para ver la sucesión Fibonacci: ");
        numero = entrada.nextInt();

        while(i < numero){
            if(i < (numero - 1)){
                System.out.print(a+ ", ");
                c = a + b;
                a = b;
                b = c;
            }else{
                System.out.print(a);
            }
            i++;
        }
        System.out.println("");

        numero = 0;
        i = 0;
        a = 0;
        b = 1;
        c = 0;

        System.out.print("--> (do-while) Ingrese un número para ver la sucesión Fibonacci: ");
        numero = entrada.nextInt();

        do{
            if(i < (numero - 1)){
                System.out.print(a+ ", ");
                c = a + b;
                a = b;
                b = c;
            }else{
                System.out.print(a);
            }
            i++;
        }while(i < numero);

        System.out.println("");

    }
}