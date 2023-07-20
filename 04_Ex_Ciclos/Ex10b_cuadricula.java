import java.util.Scanner;

public class Ex10b_cuadricula{
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("|---------------------------------------------|");
		System.out.print("--> Ingrese un número igual o menor a 11: ");
		int numIn = teclado.nextInt();

		if(numIn >= 0 && numIn <= 11){

			for(int fila = 1; fila <= numIn; fila++){
				System.out.println();
				for(int columna = 1; columna <= numIn; columna++){
					System.out.print(" ["+(fila * columna)+"]");
				}
			}
			System.out.println();
			System.out.println("|---------------------------------------------|");

		}else{
            System.out.println("--> Ingrese un número válido.");
        }
		System.out.println();	

	}
}