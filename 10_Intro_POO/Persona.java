public class Persona {

    // Atributos o Características del tipo de dato a crear. sIdeal que sean private.
    int cedula;
    String nombres;
    private String apellidos;
    int edad;
    private int estatura;
    double peso;

    // Se crea un Getter y un Setter para cada atributo.
    // En este caso van a ser 12 métodos.

    // Métodos (Acciones)
    // -Constructor
    // -Getter
    // -Setter

    // Método Constructor: para inicializar las variables y nunca retorna datos:
    public Persona(int dato1, String dato2, String dato3, int dato4, int dato5, double dato6) {
        cedula = dato1;
        nombres = dato2;
        apellidos = dato3;
        edad = dato4;
        estatura = dato5;
        peso = dato6;
    }

    // Método Getter para extraer los valores. Los métodos GET no reciben
    // parámetros.
    public int getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    // Método Setter para asignar o cambiar los valores de los atributos y recibir el nuevo dato a modificar.
    // Al cambiar el valor de un atributo, no hay que retornar nada. Se usa void.
    public void setCedula(int dato) {
        cedula = dato;
    }

    public void setNombres(String dato) {
        nombres = dato;
    }

    public void setApellidos(String dato) {
        apellidos = dato;
    }

    public void setEdad(int dato) {
        edad = dato;
    }

    public void setEstatura(int dato) {
        estatura = dato;
    }

    public void setPeso(double dato) {
        peso = dato;
    }

    public void imprimirEstado() {
        System.out.println("|-----------------------------|");
        System.out.println("|- Cédula: " + cedula);
        System.out.println("|- Nombres: " + nombres);
        System.out.println("|- Apellidos: " + apellidos);
        System.out.println("|- Edad: " + edad);
        System.out.println("|- Estatura: " + estatura);
        System.out.println("|- Peso: " + peso);
        System.out.println("|-----------------------------|");
    }

    public void actividadFisica(int minutos) {
        peso = peso - ((peso * 0.00005) * minutos);
    }

    public void aumentarPeso(int calorias) {
        peso = peso + (calorias * 0.00005);
    }

}