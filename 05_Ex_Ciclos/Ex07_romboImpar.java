import java.util.Scanner;

public class Ex07_romboImpar{
    public static void main(String[]args){
        Scanner lectura = new Scanner(System.in);

        // Pedir dato al usuario.
        System.out.print("--> Ingrese un número entero impar: ");
        int N = lectura.nextInt();
        
        // Hacer bandera de impar.
        if(N % 2 == 1){
            int alto = 0;
            int ancho = 0;
            int espacio = 0;
            int equis = 0;

            
            for(alto = 1; alto <= N; alto++){
                //System.out.print(alto);
                for(ancho = 1; ancho <= N; ancho++){
                    //System.out.print(ancho);
                    for(espacio = 1; espacio <= ancho-1; espacio++){
                        System.out.print("-");
                    }
                    for(equis = 1; equis <= ancho; equis++){
                        System.out.print("x");
                    }
                }
                
            System.out.println(" ");
            }
            

        }else{
            System.out.println("--> Número debe ser impar. ");
        }

    }
}