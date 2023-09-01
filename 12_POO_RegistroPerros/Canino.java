public class Canino {

    // Atributos:
    int numeroID;
    String nombre;
    String raza;
    String genero;
    String color;
    double edad;
    double peso;

    // Método Constructor para inicializar las variables:
    public Canino(int dato1, String dato2, String dato3, String dato4, String dato5, double dato6, double dato7) {
        numeroID = dato1;
        nombre = dato2;
        raza = dato3;
        genero = dato4;
        color = dato5;
        edad = dato6;
        peso = dato7;
    }

    // Método Getter para extraer los valores:
    public int getNumeroID() {
        return numeroID;
    }
    
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

    // Método Setter para asignar o cambiar los valores de los atributos y recibir
    // el nuevo dato a modificar.
    public void setNumeroID(int dato) {
        numeroID = dato;
    }
    
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

    public void imprimirCartilla() {
        System.out.println("-----------------------------*");
        System.out.println("|- # ID: " + numeroID);
        System.out.println("|- Nombre: " + nombre);
        System.out.println("|- Raza: " + raza);
        System.out.println("|- Genero: " + genero);
        System.out.println("|- Color: " + color);
        System.out.println("|- Edad: " + edad);
        System.out.println("|- Peso: " + peso);
        System.out.println("-----------------------------*");
    }

    public String getInfoOneLine() {
        String texto = numeroID+" - "+nombre+" - "+raza+" - "+genero+" - "+color+" - "+edad+" anios - "+peso+" kg.";
        return  texto;
    }

    

}
