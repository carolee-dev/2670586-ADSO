public class Principal {
    public static void main(String[] args) {

        System.out.println("Hola Mundo");

        // Creación de la instancia:
        // usuario es un objeto (con atributos y métodos). No es una variable
        // propiamente.
        Persona persona_01 = new Persona(123456, "Carolina", "Lee", 41, 165, 55);
        Persona persona_02 = new Persona(460481, "Daniel", "García", 36, 177, 73);

        persona_01.imprimirEstado();
        persona_02.imprimirEstado();

        persona_01.actividadFisica(80);
        persona_02.actividadFisica(30);

        persona_01.imprimirEstado();
        persona_02.imprimirEstado();

        System.out.println(" Atributo cedula " + persona_01.cedula);
        System.out.println(" Método getCedula " + persona_01.getCedula());
        System.out.println(" Método getNombres " + persona_01.getNombres());

    }
}