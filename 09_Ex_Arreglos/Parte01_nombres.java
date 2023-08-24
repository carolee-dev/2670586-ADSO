import java.util.Scanner;
public class Parte01_nombres{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("--> Ingrese un número para definir la cantidad de nombres: ");
        int N = teclado.nextInt();

        // Crear arreglo vacío
        String nombres [] = new String [N];

        // Llenar del arreglo:
        int i = 0;
        for(i = 0; i < nombres.length; i++){ // Mejor no tocar el cero.
            System.out.print("--> Ingrese nombre del humano "+(i+1)+": ");
            nombres[i] = teclado.next();
        }
        
        // Mostrar datos del arreglo:
        for(i = 0; i < nombres.length; i++){
            System.out.println("--> Humano "+(i+1)+" se llama "+nombres[i]);
        }
        System.out.println();

        // Ingresar nombre para encontrar index del nombre
        String nombreBuscado = "";
        System.out.print("--> Ingrese un nombre para saber su posición: ");
        nombreBuscado = teclado.next();

        // Buscar nombre en el arreglo y mostrar
        for(i = 0; i < nombres.length; i++){
            if(nombreBuscado.equalsIgnoreCase(nombres[i])){
                System.out.println("--> El humano existe en el index "+(i+1));
            }
        }

    }
    
}