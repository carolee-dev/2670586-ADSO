import java.util.Scanner;

public class Ex01_numRandomCiclo{
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        int num_user = 1;
        int min = 0; 
        int max = 9; 
        int num_random = 0;

        System.out.print("-->Ingrese un número entero entre 1 y 6: ");
        num_user = lectura.nextInt();

        if(num_user >= 1 && num_user <= 6){

            for(int i = 1; i <= num_user; i++){
                num_random = (int)(Math.random() * (max - min + (i * 100000)) + min);
            }
            if(num_user == 1 && num_random < 9){
                System.out.println("-->El número construído es: "+num_random);
        
                int producto = num_random * 2;

                System.out.println("-->Resultado producto: "+producto);
                System.out.println("");
            }
            if(num_user == 2 && num_random < 99){
                System.out.println("-->El número construído es: "+num_random);
        
                int producto = num_random * 2;

                System.out.println("-->Resultado producto: "+producto);
                System.out.println("");
            }
    

        }else{
            System.out.println("-->Número no válido. ");
        }

    }
}