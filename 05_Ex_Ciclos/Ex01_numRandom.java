import java.util.Scanner;

public class Ex01_numRandom{
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        int num_user = 1; 
        int num_random = 0;

        System.out.print("-->Ingrese un número entero entre 1 y 6: ");
        num_user = lectura.nextInt();

        if(num_user >= 1 && num_user <= 6){

            if(num_user == 1){
                num_random = (int)(Math.random() * 10); // Se multiplica para limitarlo
                System.out.println("-->El número construído es: "+num_random);
                
                int producto = num_random * 2;

                System.out.println("-->Resultado producto: "+producto);
            }
            if(num_user == 2){
                num_random = (int)(Math.random() * 100); // Se multiplica para limitarlo
                System.out.println("-->El número construído es: "+num_random);
                
                int producto = num_random * 2;

                System.out.println("-->Resultado producto: "+producto);
            }
            if(num_user == 3){
                num_random = (int)(Math.random() * 1000); // Se multiplica para limitarlo
                System.out.println("-->El número construído es: "+num_random);
                
                int producto = num_random * 2;

                System.out.println("-->Resultado producto: "+producto);
            }
            if(num_user == 4){
                num_random = (int)(Math.random() * 10000); // Se multiplica para limitarlo
                System.out.println("-->El número construído es: "+num_random);
                
                int producto = num_random * 2;

                System.out.println("-->Resultado producto: "+producto);
            }
            if(num_user == 5){
                num_random = (int)(Math.random() * 100000); // Se multiplica para limitarlo
                System.out.println("-->El número construído es: "+num_random);
                
                int producto = num_random * 2;

                System.out.println("-->Resultado producto: "+producto);
            }
            if(num_user == 6){
                num_random = (int)(Math.random() * 1000000); // Se multiplica para limitarlo
                System.out.println("-->El número construído es: "+num_random);
                
                int producto = num_random * 2;

                System.out.println("-->Resultado producto: "+producto);
            }

        }else{
            System.out.println("-->Número no válido. ");
        }

    }
}