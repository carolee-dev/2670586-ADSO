import java.util.Scanner;
public class Ejplo02_Arreglos{
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        // Realizar un algoritmo donde se pida al usuario un número N, se cree un arreglo de tamaño N.
        // El sistema debe llenar de forma automática el arreglo con números pares.
        // Al final el sistema muestra el contenido del arreglo.
        
        System.out.print("--> Ingrese un número: ");
        int ene = lectura.nextInt();

        // Crear arreglo
        int arr [] = new int [ene];

        // Ciclo para llenar el arreglo
        for(int i = 0; i < arr.length; i++){
            arr[i] = (i + 1) * 2; // Operación matemática para generar números pares. Cero NO es par.
        }

        // Ciclo para imprimir el arreglo
        for(int i = 0; i < arr.length; i++){
            System.out.println("[" +arr[i]+ "]");
        }        

    }
}