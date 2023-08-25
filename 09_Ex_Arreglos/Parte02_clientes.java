import java.util.Scanner;
public class Parte02_clientes{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        // Crear arreglo vacío con 100 posiciones tipo String
        String clientes [] = new String [100];

        // Crear variable para +/- cantidad de clientes
        int cantidadClientes = 0; 

        boolean salir = false;
        int opcion = 0;

        do { // Mostrar menú:
            System.out.println("------------------------------------------------------------*");
            System.out.println("");
            System.out.println("                           Memoria disponible: " + (100 - cantidadClientes) + " Registros.");
            System.out.println("");
            System.out.println(" 1. Registrar cliente");
            System.out.println(" 2. Ver lista de clientes ");
            System.out.println(" 3. Editar cliente ");
            System.out.println(" 4. Eliminar cliente ");
            System.out.println(" 5. Salir");
            System.out.println("");
            System.out.println("------------------------------------------------------------*");
            System.out.println("");
            System.out.print("Por favor ingrese una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpia el buffer

            switch (opcion) {
                case 1:
                    // Registrar un cliente:
                    if (cantidadClientes < 100) {
                        System.out.print("Ingrese nombre completo del cliente: ");
                        String nombre = teclado.nextLine();

                        // Guardas para comprobar si el cliente ya existe
                        boolean clienteExiste = false;
                        for (int i = 0; i < cantidadClientes; i++) {
                            if (clientes[i].equalsIgnoreCase(nombre)) {
                                clienteExiste = true;
                                break;
                            }
                        }
                        // Si después de buscar en el ciclo y clienteExiste sigue siendo false, significa que no se encontró ningún cliente con el mismo nombre en el array 'clientes[i]'. Como es false, el programa procede a agregar el nuevo cliente a la siguiente posición disponible en el array.'
                        if (clienteExiste == false) { 
                            clientes[cantidadClientes] = nombre;
                            cantidadClientes++;
                            System.out.println("Registro de cliente exitoso.");
                        } else { // Si clienteExiste es true, se imprime:
                            System.out.println("El cliente ya existe. ");
                        }
                    }
                    break;

                case 2:
                    // Mostrar lista de clientes:
                    System.out.println("Lista de clientes: ");
                    for (int i = 0; i < cantidadClientes; i++) {
                        System.out.println(" " + (i + 1) + ": " + clientes[i]);
                    }
                    System.out.println("");
                    break;

                case 3: // Editar cliente
                    // Solicitar el input del nombre a editar y guardar en nueva variable:
                    System.out.print("Ingrese el nombre del cliente a editar: ");
                    String nombreEditar = teclado.nextLine();

                    
                    int posicionEditar = -1; // Si se mantiene en -1, significa que no se encontró el cliente.
                    // Recorrer array para buscar cliente:
                    for (int i = 0; i < cantidadClientes; i++) {
                        // Se verifica si el nombre del cliente en la posición i del arreglo clientes es igual al nombre que el usuario ingresó en nombreEditar:
                        if (clientes[i].equalsIgnoreCase(nombreEditar)){
                            posicionEditar = i; // Acá está la posición encontrada del cliente a editar.
                            break;
                        }
                    }
                    if (posicionEditar != -1) { // Si posicionEditar no es -1, se solicita al usuario que ingrese el nuevo nombre para el cliente:
                        System.out.print("Ingrese el nuevo nombre: ");
                        String nuevoNombre = teclado.nextLine();
                        clientes[posicionEditar] = nuevoNombre;
                        System.out.println("Edición de cliente exitosa. ");
                        System.out.println("");
                    } else {
                        System.out.println("Cliente no encontrado. ");
                    }
                    break;

                case 4:
                    // Eliminar cliente
                    System.out.print("Ingrese el nombre a eliminar: ");
                    String nombreEliminar = teclado.nextLine();
                    int posicionEliminar = -1;

                    // Buscar el cliente:
                    for (int i = 0; i < cantidadClientes; i++) {
                        if (clientes[i].equalsIgnoreCase(nombreEliminar)) {
                            posicionEliminar = i;
                            break;
                        }
                    }

                    if (posicionEliminar != -1) {
                        for (int i = posicionEliminar; i < cantidadClientes - 1; i++) {
                            clientes[i] = clientes[i + 1];
                        }
                        clientes[cantidadClientes - 1] = null;
                        cantidadClientes--;
                        System.out.println("Cliente eliminado. ");
                        System.out.println("");
                    } else {
                        System.out.println("Cliente no encontrado. ");
                    }
                    break;
                case 5:
                    // Salir del programa
                    System.out.println("Gracias por usar el programa :) ");
                    System.out.println("");
                    salir = true;
                    break;
                
                default:
                    System.out.println("Opción no válida. Try again. ");
            }

        } while (opcion != 5);

    }
    
}