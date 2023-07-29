import java.util.Scanner;

public class Ex07_romboImpar{
    public static void main(String[]args){
        Scanner lectura = new Scanner(System.in);

        // Pedir dato al usuario.
        System.out.print("--> Ingrese un número entero impar: ");
        int N = lectura.nextInt();
        
        // Hacer bandera de impar.
        if(N % 2 == 1){

            // Parte superior del rombo
            for(int filas_sup = 1; filas_sup <= N; filas_sup += 2){
                int espacios = (N - filas_sup) / 2;

                // Mostrar espacios parte superior
                for(int i = 0; i < espacios; i++){
                    System.out.print("-");
                }
                // Mostrar equis parte superior
                for(int i = 0; i < filas_sup; i++){
                    System.out.print("x");
                }
                System.out.println();
            }               
            
            // Parte inferior
            for(int filas_inf = N - 2; filas_inf >= 1; filas_inf -= 2){
                int espacios_inf = (N - filas_inf) / 2;

                // Mostrar espacios parte inferior
                for(int j = 0; j < espacios_inf; j++){
                    System.out.print("-");
                }
                // Mostrar equis parte inferior
                for(int j = 0; j < filas_inf; j++){
                    System.out.print("x");
                }
                System.out.println();
            }
            System.out.println("");

        }else{
            System.out.println("--> Número debe ser impar. ");
        }

    }
}