public class Principal {
    public static void main(String[] args) {

        // Crear arreglo vacío con 10 posiciones:
        Canino perros[] = new Canino[10];

        // Crear instancias de clase 'Canino' y llenar el arreglo:
        perros[0] = new Canino("Max", "Pastor Alemán", "Macho", "Negro", 3, 25.5, "Juan");
        perros[1] = new Canino("Lupe", "Rottweiler", "Hembra", "Negro", 2, 15.8, "Maria");
        perros[2] = new Canino("Momo", "Mastiff", "Macho", "Albaricoque", 1, 28.1, "Jesus");
        perros[3] = new Canino("Chance", "Labrador", "Macho", "Chocolate", 5, 21.7, "Ana");
        perros[4] = new Canino("Pelos", "Chihuahua", "Macho", "Gris", 7, 4.7, "Pedro");
        perros[5] = new Canino("Pepe", "Sabueso", "Macho", "Castaño", 4, 17.3, "Andres");
        perros[6] = new Canino("Aura", "Doberman", "Hembra", "Negro", 3, 23.4, "Oscar");
        perros[7] = new Canino("Mamut", "Bernes", "Macho", "Tricolor", 6, 30.2, "Jose");
        perros[8] = new Canino("Blanca", "Pastor Suizo", "Hembra", "Blanco", 8, 22.9, "Milena");
        perros[9] = new Canino("Dita", "Pug", "Hembra", "Negro", 9, 3.6, "David");

        // Acceder a los elementos del arreglo y utilizar sus métodos o atributos:
        perros[0].imprimirCartilla();
        perros[9].imprimirCartilla();
        perros[7].imprimirCartilla();

        System.out.println(" Atributo nombre: " + perros[2].nombre);
        System.out.println(" Atributo raza: " + perros[2].raza);
        System.out.println(" Método getGenero: " + perros[2].getGenero());
        System.out.println(" Método getPeso: " + perros[2].getPeso());

    }
}