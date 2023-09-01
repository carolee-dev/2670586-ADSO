import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_texto = new Scanner(System.in);

        Canino listaPerritos [] = new Canino [100];
        int indicePerritos = 0;

        listaPerritos[0] = new Canino(1001, "Bento Jose", "Akita", "Macho", "Negro", 3.5, 25.5);
        listaPerritos[1] = new Canino(2002, "Lupe Lucía", "Rottweiler", "Hembra", "Negro", 2, 23.8);
        listaPerritos[2] = new Canino(3003, "Momo Antonio", "Mastiff", "Macho", "Albaricoque", 1.5, 30.2);
        listaPerritos[3] = new Canino(4004, "Chance Mauricio", "Labrador", "Macho", "Dorado", 7, 21.7);
        listaPerritos[4] = new Canino(5005, "Tabi Mariana", "Shih-poodle", "Hembra", "Gris", 5, 3.6);
        indicePerritos = 5;

        int opcion = 0;
        while (opcion != 11) {
            System.out.println("\n");
            System.out.println("*-----------------------------------------------------------*");
            System.out.println("*              R E G I S T R O   P E R R U N O              *");
            System.out.println("*-----------------------------------------------------------*");
            System.out.println("");
            System.out.println("                           Memoria disponible: " +(100 - indicePerritos)+ " Registros.");
            System.out.println("");
            System.out.println("   1. Registrar perro");
            System.out.println("   2. Ver lista de perros ");
            System.out.println("   3. Editar info perro ");
            System.out.println("   4. Eliminar perro de lista ");
            System.out.println("   5. Perro con mayor edad ");
            System.out.println("   6. Perro con menor edad ");
            System.out.println("   7. Perro con mayor peso ");
            System.out.println("   8. Perro con menor peso ");
            System.out.println("   9. Promedio de edades ");
            System.out.println("   10. Promedio de pesos ");
            System.out.println("   11. Salir del registro ");
            System.out.println("");
            System.out.println("------------------------------------------------------------*");
            System.out.println("");

            System.out.print("Por favor escoja una de las opciones: ");
            opcion = entrada_numero.nextInt();

            if (opcion == 1) { // Registrar
                System.out.println("\n");
                System.out.println("*-------------------------------------------*");
                System.out.println("*              REGISTRAR PERRO              *");
                System.out.println("*-------------------------------------------*");
                System.out.println("");

                System.out.print(" Ingrese número de ID: ");
                int numeroID = entrada_numero.nextInt();

                // Validar si el número de ID ya existe en la lista
                boolean idExistente = false;
                for (int i = 0; i < indicePerritos; i++) {
                    if (listaPerritos[i].getNumeroID() == numeroID) {
                        idExistente = true;
                        break; 
                    }
                }
                if (idExistente == false) { // Si no existe, proceder a registrar
                    System.out.print(" Ingrese nombre del perro: ");
                    String nombre = entrada_texto.nextLine();

                    System.out.print(" Ingrese raza: ");
                    String raza = entrada_texto.nextLine();

                    System.out.print(" Ingrese género: ");
                    String genero = entrada_texto.nextLine();

                    System.out.print(" Ingrese color: ");
                    String color = entrada_texto.nextLine();

                    System.out.print(" Ingrese edad: ");
                    double edad = entrada_numero.nextDouble();

                    System.out.print(" Ingrese peso: ");
                    double peso = entrada_numero.nextDouble();

                    // Objeto 'temporal' de tipo Canino para el Constructor (instanciar):
                    Canino temporal = new Canino(numeroID, nombre, raza, genero, color, edad, peso);
                    listaPerritos[ indicePerritos ] = temporal; // Para almacenar el objeto temporal en arreglo 'listaPerritos'
                    // Este objeto que acabamos de instanciar ocupa el índice 0 del arreglo
                    indicePerritos += 1;

                } else {
                    System.out.println("***  El número de ID ya existe  ***");
                }

            }

            if (opcion == 2) { // Ver lista
                System.out.println("\n");
                System.out.println("*-------------------------------------------*");
                System.out.println("*               LISTA PERRUNA               *");
                System.out.println("*-------------------------------------------*");
                System.out.println("");

                for (int i = 0; i < listaPerritos.length; i++) {
                    if (listaPerritos[i] != null) { // Si listaPerritos en posición i es diferente a nulo es porque hay algo adentro
                        System.out.println(" "+(i+1)+" -> "+listaPerritos[i].getInfoOneLine());
                    }
                }
                
            }
        
            if (opcion == 3) { // Editar
                System.out.println("\n");
                System.out.println("*-------------------------------------------*");
                System.out.println("*             EDITAR INFO PERRO             *");
                System.out.println("*-------------------------------------------*");
                System.out.println("");
                // Solicitar numeroID:
                System.out.print("--> Ingrese número ID del perro: ");
                int numeroID = entrada_numero.nextInt();

                // Buscar si existe
                int perroEncontrado = -1;
                for (int i = 0; i < listaPerritos.length; i++) {
                    if (listaPerritos[i] != null && listaPerritos[i].getNumeroID() == numeroID) {
                        perroEncontrado = i;
                    }
                }// Dejar que recorra todo el arreglo y validar por fuera del 'for'.

                // Si. Solicitar los nuevos datos
                // No. Mostrar mensaje de error
                if (perroEncontrado != -1 ) {
                    System.out.print(" Ingrese nombre del perro: ");
                    String nombre = entrada_texto.nextLine();

                    System.out.print(" Ingrese raza: ");
                    String raza = entrada_texto.nextLine();

                    System.out.print(" Ingrese género: ");
                    String genero = entrada_texto.nextLine();

                    System.out.print(" Ingrese color: ");
                    String color = entrada_texto.nextLine();

                    System.out.print(" Ingrese edad: ");
                    double edad = entrada_numero.nextDouble();

                    System.out.print(" Ingrese peso: ");
                    double peso = entrada_numero.nextDouble();

                    // Objeto 'temporal' de tipo Canino para el Constructor (instanciar):
                    Canino temporal = new Canino(numeroID, nombre, raza, genero, color, edad, peso);
                    listaPerritos[ perroEncontrado ] = temporal; // Para almacenar el objeto temporal en arreglo 'listaPerritos'

                } else {
                    System.out.println("");
                    System.out.println("*** El número ID "+numeroID+" no existe en el registro ***");
                    System.out.println("");
                }
            }

            if (opcion == 4) { // Eliminar
                System.out.println("\n");
                System.out.println("*-------------------------------------------*");
                System.out.println("*            ELIMINAR INFO PERRO            *");
                System.out.println("*-------------------------------------------*");
                System.out.println("");
                // Solicitar numeroID:
                System.out.print("--> Ingrese número ID del perro: ");
                int numeroID = entrada_numero.nextInt();

                // Buscar si existe con un 'for' que recorra el arreglo
                int perroEncontrado = -1;
                for (int i = 0; i < listaPerritos.length; i++) {
                    if (listaPerritos[i] != null && listaPerritos[i].getNumeroID() == numeroID) {
                        perroEncontrado = i;
                    }
                }// Dejar que recorra todo el arreglo y validar por fuera del 'for'.

                // Validar si existe el perrito con ese número de ID
                if (perroEncontrado != -1) {
                    for (int i = perroEncontrado; i < listaPerritos.length - 1; i++) { // Recorrer hasta antes de la última posición
                        listaPerritos[i] = listaPerritos[ i+1 ]; // Acá se reemplaza la información
                    }
                    listaPerritos[ listaPerritos.length - 1] = null; // La última posición debe quedar en nulo
                    indicePerritos -= 1;

                    System.out.println("*------------------------------------*");
                    System.out.println("***  REGISTRO ELIMINADO CON EXITO  ***");
                    System.out.println("*------------------------------------*");


                } else {
                    System.out.println("");
                    System.out.println("*** El número ID "+numeroID+" no existe en el registro ***");
                    System.out.println("");
                }
                
            }

            if (opcion == 5) { // Perro con mayor edad
                System.out.println("*-------------------------------------------*");
                System.out.println("*           PERRO CON MAYOR EDAD            *");
                System.out.println("*-------------------------------------------*");

                Canino perroMayorEdad = listaPerritos[0];
                for (int i = 0; i < indicePerritos; i++) {
                    if (listaPerritos[i].getEdad() > perroMayorEdad.getEdad()) {
                        perroMayorEdad = listaPerritos[i];
                    }
                }
                System.out.println("  Nombre: "+perroMayorEdad.getNombre());
                System.out.println("  Edad: "+perroMayorEdad.getEdad()+" años");
            }

            if (opcion == 6) { // Perro con menor edad
                System.out.println("*-------------------------------------------*");
                System.out.println("*           PERRO CON MENOR EDAD            *");
                System.out.println("*-------------------------------------------*");

                Canino perroMenorEdad = listaPerritos[0];
                for (int i = 0; i < indicePerritos; i++) {
                    if (listaPerritos[i].getEdad() < perroMenorEdad.getEdad()) {
                        perroMenorEdad = listaPerritos[i];
                    }
                }
                System.out.println("  Nombre: "+perroMenorEdad.getNombre());
                System.out.println("  Edad: "+perroMenorEdad.getEdad()+" años");
            }

            if (opcion == 7) { // Perro con mayor peso
                System.out.println("*-------------------------------------------*");
                System.out.println("*           PERRO CON MAYOR PESO            *");
                System.out.println("*-------------------------------------------*");

                Canino perroMayorPeso = listaPerritos[0];
                for (int i = 0; i < indicePerritos; i++) {
                    if (listaPerritos[i].getPeso() > perroMayorPeso.getPeso()) {
                        perroMayorPeso = listaPerritos[i];
                    }
                }
                System.out.println("  Nombre: "+perroMayorPeso.getNombre());
                System.out.println("  Peso: "+perroMayorPeso.getPeso()+" kg");
            }

            if (opcion == 8) { // Perro con menor peso
                System.out.println("*-------------------------------------------*");
                System.out.println("*           PERRO CON MENOR PESO            *");
                System.out.println("*-------------------------------------------*");

                Canino perroMenorPeso = listaPerritos[0];
                for (int i = 0; i < indicePerritos; i++) {
                    if (listaPerritos[i].getPeso() < perroMenorPeso.getPeso()) {
                        perroMenorPeso = listaPerritos[i];
                    }
                }
                System.out.println("  Nombre: "+perroMenorPeso.getNombre());
                System.out.println("  Peso: "+perroMenorPeso.getPeso()+" kg");
            }

            if (opcion == 9) { // Promedio de edades
                System.out.println("*-------------------------------------------*");
                System.out.println("*             PROMEDIO DE EDADES            *");
                System.out.println("*-------------------------------------------*");

                // Sumar todas las edades que hay en el arreglo
                double sumaEdades = 0;
                for (int i = 0; i < indicePerritos; i++) {
                    sumaEdades += listaPerritos[i].getEdad();
                }

                // Calcular promedio:
                double promedioEdades = sumaEdades / indicePerritos;
                System.out.println("*** El promedio de edades de los perritos registrados es de "+promedioEdades+" años ***");
            }

            if (opcion == 10) { // Promedio de pesos
                System.out.println("*-------------------------------------------*");
                System.out.println("*             PROMEDIO DE PESOS             *");
                System.out.println("*-------------------------------------------*");

                // Sumar todos los pesos que hay en el arreglo
                double sumaPesos = 0; 
                for (int i = 0; i < indicePerritos; i++) {
                    sumaPesos += listaPerritos[i].getPeso();
                }

                // Calcular promedio:
                double promedioPesos = sumaPesos / indicePerritos;
                System.out.println("*** El promedio de pesos de los perritos registrados es de "+promedioPesos+" kg ***");

            }

            if (opcion == 11) { // Salir del programa
                System.out.println("*------------------------------------*");
                System.out.println(" --> Gracias por usar el programa <-- ");
                System.out.println("       <^..^>  A D I O S  <^..^>      ");
                System.out.println("");
                
            }

        }
        
    }
}