import java.util.Scanner;

public class Ex01_promedio{
    public static void main(String args []){

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántas notas son?");
        int cantidad_notas = teclado.nextInt();

        float sumaNotas = 0;
        int i = 1;

        while (i <= cantidad_notas){
            System.out.println("Ingrese cada nota: ");
            float nota = teclado.nextFloat();

            sumaNotas = sumaNotas + nota;

            i = i + 1;

        }

        float promedio = sumaNotas/cantidad_notas;

        System.out.println("El promedio es: "+promedio);
        


		// for( int i=0; i<=multiplos; i++ ){
		//	 int resultado = numero * i;
		//	 System.out.println(numero+" x "+i+" = "+resultado);
		// }

    }
}