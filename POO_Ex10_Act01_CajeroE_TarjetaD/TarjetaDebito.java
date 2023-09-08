import java.util.Date;

public class TarjetaDebito {

    // Atributos:
    private String nombrePropietario;
    private String numeroTarjeta;
    private String nombreBanco;
    private int montoEnTarjeta;
    private int montoTopeRetiro;
    private String clave;
    private String estado; // ACTIVA - BLOQUEADA - SUSPENDIDA
    private String ultimasTransacciones[]; // (fecha-tipoTransaccion-monto-estado)

    // Método Constructor para inicializar las variables:
    public TarjetaDebito(String nombrePropietario, String numeroTarjeta, String nombreBanco, int montoEnTarjeta, int montoTopeRetiro, String clave) {
        this.nombrePropietario = nombrePropietario;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreBanco = nombreBanco;
        this.montoEnTarjeta = montoEnTarjeta;
        this.montoTopeRetiro = montoTopeRetiro;
        this.clave = clave;
        this.estado = "ACTIVA";
        this.ultimasTransacciones = new String[5];
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
        // verHistorialTarjeta(...) OK


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

        if (montoEnTarjeta > 10000) {
            System.out.println(" Estado: "+estado);
        } else {
            System.out.println(" Estado: Fondos Insuficientes ");
        }

        for (int i = 0; i < ultimasTransacciones.length; i++) {
            System.out.println(" Últimas Transacciones = "+ultimasTransacciones[i]);
        }

        System.out.println(" ------------------------------ ");
        System.out.println("");
    }

    public void registrarTransaccionTarjeta(String tipo, int monto, String estadoTransa) {
        Date fecha = new Date(); 

        String texto = fecha.toString()+" - "+tipo+" - "+monto+" - "+estadoTransa;

        int indice = -1;
        for (int i = 0; i < ultimasTransacciones.length; i++) {
            if (ultimasTransacciones[i] == null) {
                indice = i;
                break; // para que pare el for al encontrar el primer null y muestre los registros en orden
            }
        }
        if (indice != -1) {
            ultimasTransacciones[indice] = texto;
        } else {
            for (int i = 0; i < ultimasTransacciones.length -1; i++) {
                ultimasTransacciones[i] = ultimasTransacciones[i + 1];
            }
            ultimasTransacciones[ultimasTransacciones.length -1] = texto;
        }
    }

    public void verHistorialTarjeta(String password) {
        if(password.equals(clave)) {

            registrarTransaccionTarjeta("HISTORIAL", 0, "OK");

            for (int i = 0; i < ultimasTransacciones.length; i++) {

                if (ultimasTransacciones[i] != null) {
                    System.out.println(" "+ultimasTransacciones[i]);
                }
            }
        }else{
            System.out.println(" ===> ACCESO DENEGADO <===");
            registrarTransaccionTarjeta("HISTORIAL", 0, "ERROR");
        }
    }

    public boolean aumentarSaldo(int monto, String password) {
        if(password.equals(clave)) {
            if (monto > 0) {
                montoEnTarjeta += monto;
                System.out.println("  TRANSACCIÓN EXITOSA  ");
                registrarTransaccionTarjeta("AUMENTO SALDO", monto, "OK");
                return true;
            }else{
                System.out.println(" ERROR EN MONTO INGRESADO ");
                registrarTransaccionTarjeta("AUMENTO SALDO", monto, "ERROR");
                return false;
            }
        }else{
            System.out.println(" ERROR EN PASSWORD, AUMENTO DE SALDO ");
            registrarTransaccionTarjeta("AUMENTO SALDO", monto, "ERROR");
            return false;
        }

    }

    public boolean disminuirSaldo(int monto, String password) {
        if(password.equals(clave) && monto > 0) {
            if (monto > 0 && monto <= montoTopeRetiro) {
                if (monto <= montoEnTarjeta) {
                    montoEnTarjeta -= monto;
                    System.out.println("  TRANSACCIÓN EXITOSA EN TARJETA  ");
                    registrarTransaccionTarjeta("DISMINUCIÓN SALDO", monto, "OK");
                    return true;
                }else{
                    System.out.println(" ERROR EN MONTO INGRESADO, SUPERA MONTO EN TARJETA");
                    registrarTransaccionTarjeta("DISMINUCIÓN SALDO", monto, "ERROR");
                    return false;
                }
            }else{
                System.out.println(" ERROR EN MONTO INGRESADO, FUERA DE RANGO ");
                registrarTransaccionTarjeta("DISMINUCIÓN SALDO", monto, "ERROR");
                return false;
            }
        }else{
            System.out.println(" ERROR EN PASSWROD, DISMINUCIÓN DE SALDO ");
            registrarTransaccionTarjeta("DISMINUCIÓN SALDO", monto, "ERROR");
            return false;
        }

    }

    public int getSaldo(String password){
        if(password.equals(clave)){
            registrarTransaccionTarjeta("CONSULTA SALDO", 0, "OK");
            return montoEnTarjeta;
        }else{
            registrarTransaccionTarjeta("CONSULTA SALDO", 0, "ERROR");
            return -1;
        }
    }

    public boolean validarClave(String password){
        if (password.equals(clave)) { // return password.equals(clave);
            registrarTransaccionTarjeta("VALIDAR CLAVE INTERNA", 0, "OK");
            return true;
        }else{
            registrarTransaccionTarjeta("VALIDAR CLAVE INTERNA", 0, "ERROR");
            return false;
        }
    }

    public boolean validarEstadoActiva(){
        if (estado.equals("ACTIVA")) {
            return true;
        }else{
            return false;
        }
    }

    


}