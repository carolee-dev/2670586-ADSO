public class Canino {

    // Atributos:
    String nombre;
    String raza;
    String genero;
    String color;
    double edad;
    double peso;
    String humano;

    // Método Constructor para inicializar las variables:
    public Canino(String dato1, String dato2, String dato3, String dato4, double dato5, double dato6, String dato7) {
        nombre = dato1;
        raza = dato2;
        genero = dato3;
        color = dato4;
        edad = dato5;
        peso = dato6;
        humano = dato7;
    }

    // Método Getter para extraer los valores:
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getGenero() {
        return genero;
    }

    public String getColor() {
        return color;
    }

    public double getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getHumano() {
        return humano;
    }

    // Método Setter para asignar o cambiar los valores de los atributos y recibir
    // el nuevo dato a modificar.
    public void setNombre(String dato) {
        nombre = dato;
    }

    public void setRaza(String dato) {
        raza = dato;
    }

    public void setGenero(String dato) {
        genero = dato;
    }

    public void setColor(String dato) {
        color = dato;
    }

    public void setEdad(double dato) {
        edad = dato;
    }

    public void setPeso(double dato) {
        peso = dato;
    }

    public void setHumano(String dato) {
        humano = dato;
    }

    public void imprimirCartilla() {
        System.out.println("-----------------------------*");
        System.out.println("|- Nombre: " + nombre);
        System.out.println("|- Raza: " + raza);
        System.out.println("|- Genero: " + genero);
        System.out.println("|- Color: " + color);
        System.out.println("|- Edad: " + edad);
        System.out.println("|- Peso: " + peso);
        System.out.println("|- Humano: " + humano);
        System.out.println("-----------------------------*");
    }

}