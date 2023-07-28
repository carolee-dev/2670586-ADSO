import java.util.Scanner;
public class Ex02_ArrayPrimos{
    public static void main(String[]args){

        // 1 Crear variable de entrada
        Scanner leer = new Scanner(System.in);

        // 2 Solicitar dato al usuario
        System.out.print("--> Ingrese un número: ");
        int numero = leer.nextInt();

        // 3 Crear arreglo
        int arreglo [] = new int [numero];

        // 4 Llenar arreglo
        int contaPrimos = 0;
        int primo = 2;
        while(contaPrimos < numero){ 
            // Verificar si el número es primo
            int divisores = 0;
            for(int i = 1; i <= primo; i++){
                if(primo % i == 0){
                    divisores++;
                }
            }
            // Si es primo
            if(divisores == 2){
                // Se almacena el primo en el arreglo
                arreglo [contaPrimos] = primo;
                // Aumentamos contaPrimos
                contaPrimos++;
            }
            // Aumentamos primo para que al siguiente ciclo no empiece en 2 perpetuamente
            primo++;
        }

        // 5 Imprimir arreglo
        System.out.println("--> Lista Generada de Primos: ");
        for(int i = 0; i < numero; i++){
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println();

    }
}