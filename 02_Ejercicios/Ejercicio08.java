import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);


        String nombre1, apellido1;

        System.out.println("Por favor ingresa tu primer nombre: ");
        nombre1 = entrada.next();

        System.out.println("Por favor ingresa tu primer apellido: ");
        apellido1 = entrada.next();
        
        System.out.print("Su nombre es: "+nombre1+" "+apellido1);


    }
}
