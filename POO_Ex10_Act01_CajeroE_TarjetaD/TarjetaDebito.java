public class TarjetaDebito {

    // Atributos:
    String nombrePropietario;
    String numeroTarjeta;
    String nombreBanco;
    int cantidadDineroEnTarjeta;
    int cantidadDineroPermitidoParaRetirar;
    String ultimasTransacciones[]; // (fecha-tipoTransaccion-monto-estado)
    String clave;
    String estado; // ACTIVA - BLOQUEADA - SUSPENDIDA

    // Método Constructor para inicializar las variables:
    public TarjetaDebito (String dato1, String dato2, String dato3, int dato4, int dato5, String dato6, String dato7, String dato8) {
        nombrePropietario = dato1;
        numeroTarjeta = dato2;
        nombreBanco = dato3;
        cantidadDineroEnTarjeta = dato4;
        cantidadDineroPermitidoParaRetirar = dato5;
        ultimasTransacciones[] = dato6;
        clave = dato7;
        estado = dato8;
    }

    // Método Getter para extraer los valores:
    public String getNombrePropietario () {
        return nombrePropietario;
    }
    public String getNumeroTarjeta () {
        return numeroTarjeta;
    }
    public String getNombreBanco () {
        return nombreBanco;
    }
    public int getCantidadDineroEnTarjeta () {
        return cantidadDineroEnTarjeta;
    }
    public int getCantidadDineroPermitidoParaRetirar () {
        return cantidadDineroPermitidoParaRetirar;
    }
    public String getUltimasTransacciones ([]) {
        return ultimasTransacciones[];
    }
    public String getClave () {
        return clave;
    }
    public String getEstado () {
        return estado;
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
    public void setCantidadDineroEnTarjeta (int dato) {
        cantidadDineroEnTarjeta = dato;
    }
    public void setCantidadDineroPermitidoParaRetirar (int dato) {
        cantidadDineroPermitidoParaRetirar = dato;
    }
    public void setUltimasTransacciones (String[] dato) {
        ultimasTransacciones[] = dato;
    }
    public void setClave (String dato) {
        clave = dato;
    }
    public void setEstado (String dato) {
        estado = dato;
    }

    // Otros métodos a crear para la aplicación:
        // disminuirSaldo(...)
        // aumentarSaldo(...)


}