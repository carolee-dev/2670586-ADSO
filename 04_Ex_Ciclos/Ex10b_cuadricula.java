import java.util.Scanner;

public class Ex10b_cuadricula{
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("|---------------------------------------------|");
		System.out.print("--> Ingrese un número igual o menor a 11: ");
		int N = teclado.nextInt();

		if(N >= 0 && N <= 11){

			for(int fila = 1; fila <= N; fila++){
				System.out.println();
				for(int columna = 1; columna <= N; columna++){
					int R = fila * columna;
					if(R < 10){
						System.out.print("[0"+R+"]");
					}else{
						System.out.print("["+R+"]");
					}
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