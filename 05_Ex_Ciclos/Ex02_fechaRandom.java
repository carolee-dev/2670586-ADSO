public class Ex02_fechaRandom {
	public static void main(String[] args) {

        int anio = 0;
        int mes = 0;
        int dia = 0;
        boolean bisiesto = true;
		
		for (int i = 0; i < 5; i++) {

			// Año
			do{
				anio = ((int)(Math.random() * 10000)) + 1;
			}while( anio < 1000 || anio > 9999 );

			// Mes
			do{
				mes = ((int)(Math.random() * 12)) + 1;
			}while( mes < 1 || mes > 12 );

			// Día
			bisiesto = ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0));
			if (bisiesto && mes == 2) {
				dia = ((int) (Math.random() * 29)) + 1;
			}else if (bisiesto && mes == 2){
				dia = ((int) (Math.random() * 28)) + 1;
			}else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				dia = ((int) (Math.random() * 31)) + 1;
			}else{
				dia = ((int) (Math.random() * 30)) + 1;
			}

		}
        // Imprimir Fecha
			System.out.println(" Fecha sorpresa: "+dia+" - "+mes+" - "+anio+((bisiesto)? " -> Bisiesto":" "));
	}
}