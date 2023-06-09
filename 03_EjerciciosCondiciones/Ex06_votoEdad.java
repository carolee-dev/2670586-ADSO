import java.util.Scanner;

public class Ex06_votoEdad{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        int edad = 0;

        System.out.println("--> Ingresa tu edad para saber si puedes o no votar: ");
        edad = teclado.nextInt();

        
        if(edad > 0 && edad < 18){
                System.out.println("Aun no puedes votar. ");
            }else if(edad >= 18 && edad < 100){
                System.out.println("Puedes ejercer tu derecho al voto. ");
            }else if(edad <= -0){
                System.out.println("Ingrese un valor válido. ");
            }else{
                System.out.println("Consulte con la Registraduría si es apto o apta para votar.");
            }
        
    }
}