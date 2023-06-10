import java.util.Scanner;

public class Ex02_ponderado{
    public static void main(String args[]){
        Scanner tecla = new Scanner(System.in);

        System.out.println("¿Cuántas materias son?");
        int cantidad_materias = tecla.nextInt();

        double sumaNotas = 0;
        double sumaCreditos = 0;
        int i = 1;
        
        while(i <= cantidad_materias){
            System.out.println("Nota materia "+i+" : ");
            double nota = tecla.nextDouble();

            System.out.println("Créditos materia "+i+" : ");
            double credito = tecla.nextDouble();

            sumaNotas = sumaNotas + (nota*credito);
            sumaCreditos = sumaCreditos + credito;

            i = i + 1;
        }
        
        System.out.println("Total de créditos: "+sumaCreditos);

        double ponderado = sumaNotas/sumaCreditos;
        System.out.println("Ponderado del semestre: "+ponderado);

    }
}