import java.util.Scanner;

public class Ex01_numRandom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num_user;
        int min, max;
        int num_random = 0;
        int producto;
        
        System.out.print("Ingresa un número entero entre 1 y 6: ");
        num_user = scanner.nextInt();

        min = (int) Math.pow(10, num_user - 1);
        max = (int) Math.pow(10, num_user) - 1;

        if(num_user >= 1 && num_user <= 6){

            for (int i = 0; i < num_user; i++) {
                num_random = (int) (Math.random() * (max - min + 1)) + min;
            }
            System.out.println("--> El número construído es: "+num_random);

            producto = num_random * 2;   

            System.out.println("--> Resultado producto: "+producto);
            System.out.println("");

        }else{
            System.out.println("--> Número no válido. ");
        }
    }
}
