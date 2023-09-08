public class TarjetaDebito {

    // Atributos:
    String nombrePropietario;
    String numeroTarjeta;
    String nombreBanco;
    int montoEnTarjeta;
    int montoTopeRetiro;
    String clave;
    String estado; // ACTIVA - BLOQUEADA - SUSPENDIDA
    String ultimasTransacciones[]; // (fecha-tipoTransaccion-monto-estado)

    // Método Constructor para inicializar las variables:
    public TarjetaDebito(String nombrePropietario, String numeroTarjeta, String nombreBanco, int montoEnTarjeta, int montoTopeRetiro, String clave, String estado) {
        this.nombrePropietario = nombrePropietario;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreBanco = nombreBanco;
        this.montoEnTarjeta = montoEnTarjeta;
        this.montoTopeRetiro = montoTopeRetiro;
        this.clave = clave;
        this.estado = estado;

        ultimasTransacciones = new String[10];
    }

    // Método Getter para extraer los valores:
    public String getNombrePropietario() {
        return nombrePropietario;
    }
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public String getNombreBanco() {
        return nombreBanco;
    }
    public int getMontoEnTarjeta() {
        return montoEnTarjeta;
    }
    public int getMontoTopeRetiro() {
        return montoTopeRetiro;
    }
    public String getClave() {
        return clave;
    }
    public String getEstado() {
        return estado;
    }
    public String [] getUltimasTransacciones() {
        return ultimasTransacciones;
    }

    // Método Setter para asignar o cambiar los valores de los 
    // atributos y recibir el nuevo dato a modificar:
    public void setNombrePropietario (String dato) {
        nombrePropietario = dato;
    }
    public void setNumeroTarjeta (String dato) {
        numeroTarjeta = dato;
    }
    public void setNombreBanco (String dato) {
        nombreBanco = dato;
    }
    public void setMontoEnTarjeta (int dato) {
        montoEnTarjeta = dato;
    }
    public void setMontoTopeRetiro (int dato) {
        montoTopeRetiro = dato;
    }
    public void setClave (String dato) {
        clave = dato;
    }
    public void setEstado (String dato) {
        estado = dato;
    }
    public void setUltimasTransacciones (String[] dato) {
        ultimasTransacciones = dato;
    }

    // Otros métodos a crear para la aplicación:
        // disminuirSaldo(...)
        // aumentarSaldo(...)


}