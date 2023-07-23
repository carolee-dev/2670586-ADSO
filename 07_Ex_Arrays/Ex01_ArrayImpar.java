import java.util.Scanner;
public class Ex01_ArrayImpar{
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("--> Ingrese un número: ");
        int num = lectura.nextInt();

        // Crear arreglo
        int arr [] = new int [num];

        // Ciclo para llenar el arreglo
        for(int i = 0; i < arr.length; i++){
            arr[i] = 2 * i + 1; // Operación matemática para generar números impares. Cero NO es par.
        }

        // Ciclo para imprimir el arreglo
        for(int i = 0; i < arr.length; i++){
            System.out.println("[" +arr[i]+ "]");
        }        

    }
}