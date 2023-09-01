public class CajeroElectronico {

    // Atributos:
    private int cantidadDineroTotal;
    private int cantidadDineroDisponible;
    int billete_10;
    int billete_20;
    int billete_50;
    int billete_100;
    String nombreBanco;
    String listaTransacciones[]; // (fecha-tipoTransaccion-monto-estado)
    private String usuarioAdmin;
    private String claveAdmin;

    // Método Constructor para inicializar las variables:
    public CajeroElectronico (int dato1, int dato2, int dato3, int dato4, int dato5, int dato6, String dato7, String dato8, String dato9, String dato10,) {
        cantidadDineroTotal = dato1;
        cantidadDineroDisponible = dato2;
        billete_10 = dato3;
        billete_20 = dato4;
        billete_50 = dato5;
        billete_100 = dato6;
        nombreBanco = dato7;
        listaTransacciones[] = dato8;
        usuarioAdmin = dato9;
        claveAdmin = dato10;

    }

    // Método Getter para extraer los valores:
    public int getCantidadDineroTotal () {
        return cantidadDineroTotal;
    }
    public int getCantidadDineroDisponible () {
        return cantidadDineroDisponible;
    }
    public int getBillete_10 () {
        return billete_10;
    }
    public int getBillete_20 () {
        return billete_20;
    }
    public int getBillete_50 () {
        return billete_50;
    }
    public int getBillete_100 () {
        return billete_100;
    }
    public String getNombreBanco () {
        return nombreBanco;
    }
    public String getListaTransacciones([]) {
        return listaTransacciones[];
    };
    public String getUsuarioAdmin () {
        return usuarioAdmin;
    }
    public String getClaveAdmin () {
        return claveAdmin;
    }

    // Método Setter para asignar o cambiar los valores de los 
    // atributos y recibir el nuevo dato a modificar:
    public void setCantidadDineroTotal (int dato) {
        cantidadDineroTotal = dato;
    }
    public void setCantidadDineroDisponible (int dato) {
        cantidadDineroDisponible = dato;
    }
    public void setBillete_10 (int dato) {
        billete_10 = dato;
    }
    public void setBillete_20 (int dato) {
        billete_20 = dato;
    }
    public void setBillete_50 (int dato) {
        billete_50 = dato;
    }
    public void setBillete_100 (int dato) {
        billete_100 = dato;
    }
    public void setNombreBanco (String dato) {
        nombreBanco = dato;
    }
    public void setListaTransacciones (String[] dato) {
        listaTransacciones[] = dato;
    }
    public void setUsuarioAdmin () {
        usuarioAdmin = dato;
    }
    public void setClaveAdmin () {
        claveAdmin = dato;
    }

    // Otros métodos a crear para la aplicación:
        // abastecerCajero(...)
        // bloquearCajero(...)
        // verHistorialCajero(...)
        // consignarDineroTarjeta(...)
        // retirarDineroTarjeta(...)
        // consultarSaldoTarjeta(...)
        // cambiarClave(...)






}