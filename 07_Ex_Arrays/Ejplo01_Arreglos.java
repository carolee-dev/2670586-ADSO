import java.util.Scanner;
public class Arreglos_0721{
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        // Crear Arreglo

        // Arreglo vacío
        // int edades[] = new int[10];
        
        
        // Arreglo lleno
        // int estatura[] = { 180, 150, 120, 110, 140 }; 
        // Java crea los espacios según la cantidad de datos alimentados.
        // Esta no se suele usar.
        // String clientes[] = {"Oscar","Maria","Ana","Daniel","Andrés"};

        // edades[0] = 25; // edades en posición cero se le asigna 25.
        // edades[7] = 33;

         // Llenado automático:
        // for(int i = 0; i < 10; i++){
        //     System.out.println("Ingrese edad del humano "+i+" : ");
        //     edades[i] = lectura.nextInt();
        // }
        
        // Impresión datos automático:
        // for(int i; i < 10; i++){
        //     System.out.println("Position "+i+" es "+edades[i]);
        // }
        // System.out.println("|------------------------|");


        // Forma ineficiente:
        // System.out.print("Valor en posición 0 es: "+edades[0]);
        // System.out.print("Valor en posición 1 es: "+edades[1]);
        // System.out.print("Valor en posición 2 es: "+edades[2]);
        // System.out.print("Valor en posición 3 es: "+edades[3]);
        // System.out.print("Valor en posición 4 es: "+edades[4]);
        // System.out.print("Valor en posición 5 es: "+edades[5]);
        // System.out.print("Valor en posición 6 es: "+edades[6]);
        // System.out.print("Valor en posición 7 es: "+edades[7]);
        // System.out.print("Valor en posición 8 es: "+edades[8]);
        // System.out.print("Valor en posición 9 es: "+edades[9]);


        // Realizar un algoritmo donde se pida al usuario un número N, se cree un arreglo de tamaño N.
        // El sistema debe llenar de forma automática el arreglo con números pares.
        // Al final el sistema muestra el contenido del arreglo.
        
        System.out.println("--> Ingrese un número: ");
        int N = lectura.nextInt();

        int num [] = new int [N];

        if(N % 2 == 0){
            for(int i = 0; i < num; i++){
                System.out.println("--> Posición par "+i+" es: "+num);
            }
        }

        



        

    }
}