import java.util.Scanner;

public class Entrada {
    public static void main(String[] args){
        /* variable para leer el teclado */
        Scanner teclado = new Scanner(System.in);

        byte turno;
        short loteria_risaralda;
        int saldo_bancario;
        long tarjeta_identidad;
        float nota;
        double pi;
        boolean bandera;
        
        System.out.println("\nIngrese turno: ");
        turno = teclado.nextByte();
        
        System.out.println("Ingrese loteria_risaralda: ");
        loteria_risaralda = teclado.nextShort();
        
        System.out.println("Ingrese saldo_bancario: ");
        saldo_bancario = teclado.nextInt();

        System.out.println("Ingrese tarjeta_identidad: ");
        tarjeta_identidad = teclado.nextLong();
        
        System.out.println("Ingrese nota: ");
        nota = teclado.nextFloat();
        
        System.out.println("Ingrese pi: ");
        pi = teclado.nextDouble();

        System.out.println("Ingrese bandera: ");
        bandera = teclado.nextBoolean();

        System.out.println("\nTurno: "+turno);
        System.out.println("Loteria_risaralda: "+loteria_risaralda);
        System.out.println("Saldo_bancario: "+saldo_bancario);
        System.out.println("Tarjeta_identidad: "+tarjeta_identidad);
        System.out.println("Nota: "+nota);
        System.out.println("Pi: "+pi);
        System.out.println("Boolean: "+bandera);
        
        
        /* int cedula, contador;
        cedula = 0;
        contador = 0;
        System.out.println("Ingrese su cédula: ");
        cedula = teclado.nextInt();

        System.out.println("Ingrese contador: ");
        contador = teclado.nextInt(); */

    }
}