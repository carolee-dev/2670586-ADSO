import java.util.Scanner;

public class Ejplo_for{
	public static void main(String[]args){
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("--> Ingrese número de Tabla de Multiplicar a mostrar: ");
		int numero = entrada.nextInt();

		System.out.print("--> Ingrese la cantidad de Múltiplos: ");
		int multiplos = entrada.nextInt();

		for(int iter = 1; iter <= multiplos; iter = iter + 1){
            int resultado = numero * iter;
            System.out.println(numero+" x "+iter+" = "+resultado);
        }	

        // En ciclo 'for' NO hay que crear variable iteradora.
        // Está dentro de la estructura:
        // for(variable iteradora ; condición ; incremento o decremento){
        //     Bloque de código
        // }
	}
}