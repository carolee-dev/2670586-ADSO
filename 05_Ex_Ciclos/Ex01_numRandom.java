import java.util.Scanner;

public class Ex01_numRandom{
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        int num_user = 1;

        System.out.print("-->Ingrese un número entero entre 1 y 6: ");
        num_user = lectura.nextInt();

        for(int i=1; num_user >= 1 && num_user <=6; i=i+1){
            int min = num_user, max = 9;
            int num_random = 0; 
            num_random = (int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.print("El número construído es: "+num_random);
        }

        int producto = num_random * 2;

        System.out.println("Resultado producto: "+producto);

    }
}