
import java.util.Scanner;
public class Parte01_nombres{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("--> Ingrese un número: ");
        int N = teclado.nextInt();

        // Crear arreglo vacío
        String nombres [] = new String [N];

        // Llenar del arreglo:
        int i = 0;
        for(i = 0; i < N; i++){ // Mejor no tocar el cero.
            System.out.print("--> Ingrese nombre del humano "+(i+1)+": ");
            nombres[i] = teclado.next();
        }
        
        // Mostrar datos del arreglo:
        for(i = 0; i < N; i++){
            System.out.println("--> Humano "+(i+1)+" se llama "+nombres[i]) ;
        }
        System.out.println();

        // Mostrar posición del nombre, ingresando nombre
        System.out.print("--> Ingrese un nombre para saber su posición: ");
        String typed_name = teclado.next();

        if(typed_name.equals(nombres[i])){
            System.out.print(" "+typed_name+" está en posición "+i);
        }

        


    }
    
}