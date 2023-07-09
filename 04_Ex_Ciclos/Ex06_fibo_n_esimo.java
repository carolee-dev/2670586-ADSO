import java.util.Scanner;
public class Ex06_fibo_n_esimo{
    public static void main(String args[]){
        Scanner leer = new Scanner(System.in);

        int numero = 0;
        int i = 0;
        int a = 0;
        int b = 1;
        int c = 0;

        System.out.print("--> Ingrese la posición del n-ésimo Fibonacci: ");
        numero = leer.nextInt();

        // for(i = 0; i < numero; i++){
        //     if(i < numero){
        //         System.out.print("("+i+")"+a);
        //         c = a + b;
        //         a = b;
        //         b = c;
        //     }else if(i < numero -1){
        //         System.out.print(a);
        //     }
        // }

        for(i = 0; i < numero - 1; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.print("--> El n-ésimo número Fibonacci es: "+a);

        System.out.println("");
    }
}