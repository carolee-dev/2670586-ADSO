import java.util.Scanner;

public class Ex16_interesCompB{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        double capital, tasa; 
        int tiempo;

        System.out.print("-->¿Cuánto es su capital inicial? ");
        capital = entrada.nextDouble();

        System.out.print("-->Ingrese la tasa de interés: ");
        tasa = entrada.nextDouble();

        System.out.print("-->¿A cuántos meses va a invertir el capital? ");
        tiempo = entrada.nextInt();

        double monto = capital * Math.pow((1 + tasa / 100), tiempo);
        double interes_comp = monto - capital;

        System.out.println("-->El interés compuesto será de: "+interes_comp);
        System.out.println("-->El monto será de: "+monto);

    }
}