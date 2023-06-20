import java.util.Scanner;

public class Ejplo_while{
	public static void main(String[]args){
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("--> Ingrese número de Tabla de Multiplicar a mostrar: ");
		int numero = entrada.nextInt();

		System.out.print("--> Ingrese la cantidad de Múltiplos: ");
		int multiplos = entrada.nextInt();

		int contador = 0, resultado = 0;

		while(contador <= multiplos){
			resultado = numero * contador;
			System.out.println(numero+" x "+contador+" = "+resultado);
			contador = contador +1;
		}		

	}
}