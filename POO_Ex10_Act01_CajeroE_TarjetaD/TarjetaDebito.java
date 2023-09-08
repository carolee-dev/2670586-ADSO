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

        ultimasTransacciones = new String[5];
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

    // Para ver que esté imprimiendo bien.
    public void imprimirDetalleTarjeta() {
        System.out.println("\n------------------------------ ");
        System.out.println(" DETALLE TARJETA DÉBITO ");
        System.out.println(" nombrePropietario = " +nombrePropietario);
        System.out.println(" numeroTarjeta = " +numeroTarjeta);
        System.out.println(" nombreBanco = " +nombreBanco);
        System.out.println(" montoEnTarjeta = " +montoEnTarjeta);
        System.out.println(" montoTopeRetiro = " +montoTopeRetiro);
        System.out.println(" clave = " +clave);

        if (montoEnTarjeta > 5000) {
            System.out.println(" Estado: Tarjeta Activa");
        } else {
            System.out.println(" Estado: Fondos Insuficientes");
        }

        for (int i = 0; i < ultimasTransacciones.length; i++) {
            System.out.println(" Últimas Transacciones = "+ultimasTransacciones[i]);
        }

        System.out.println(" ------------------------------ ");
        System.out.println("");
        
    }


}