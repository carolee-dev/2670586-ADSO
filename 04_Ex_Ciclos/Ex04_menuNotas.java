import java.util.Scanner;

public class Ex04_menuNotas{
    public static void main(String[]args){
        Scanner lector = new Scanner (System.in);
        int opcion = 0;

        while(opcion != 3){
            System.out.println("|------- Welcome -------|");
            System.out.println("| 1. Docente            |");
            System.out.println("| 2. Estudiante         |");
            System.out.println("| 3. Salir              |");
            System.out.println("|-----------------------|");

            System.out.print("--> Escoja una opción: ");
            opcion = lector.nextInt();

            if(opcion == 1){
                System.out.println("¿Cuántas notas son?");
                int cantidad_notas = lector.nextInt();

                float sumaNotas = 0;
                int i = 1;

                while(i <= cantidad_notas){
                    System.out.println("Ingrese cada nota: ");
                    float nota = lector.nextFloat();
                    sumaNotas = sumaNotas + nota;
                    i = i + 1;
                }
                float promedio = sumaNotas/cantidad_notas;
                System.out.println("El promedio es: "+promedio);

            }else if(opcion == 2){
                System.out.println("¿Cuántas materias son?");
                int cantidad_materias = lector.nextInt();

                double sumaNotas = 0;
                double sumaCreditos = 0;
                int i = 1;
            
                while(i <= cantidad_materias){
                    System.out.println("Nota Materia "+i+" : ");
                    double nota = lector.nextDouble();

                    System.out.println("Créditos Materia "+i+" : ");
                    double credito = lector.nextDouble();

                    sumaNotas = sumaNotas + (nota*credito);
                    sumaCreditos = sumaCreditos + credito;
                    i = i + 1;
                }
                System.out.println("Total de créditos: "+sumaCreditos);

                double ponderado = sumaNotas/sumaCreditos;
                System.out.println("Ponderado del semestre: "+ponderado);

            }else if(opcion == 3){
                System.out.println(" --- Saliendo --- ");
            }else{
                System.out.println(" -- Opción Inválida -- ");
            }
        }

    }
}