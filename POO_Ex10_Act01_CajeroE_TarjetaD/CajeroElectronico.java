import java.util.Date;

public class CajeroElectronico {

    // Atributos:
    int capacidadTotal; // que le cabe al cajero
    int dineroDisponible;
    int billete_10; // cantidad de billetes, no monto
    int billete_20;
    int billete_50;
    int billete_100;
    String nombreBanco;
    String usuarioAdmin;
    String claveAdmin;
    String listaTransacciones[]; // (fecha-tipoTransaccion-monto-estado)

    // Método CONSTRUCTOR para inicializar las variables: ESTE RECIBE 9 DATOS
    public CajeroElectronico(int capacidadTotal, int dineroDisponible, int billete_10, int billete_20, int billete_50, int billete_100, String nombreBanco, String usuarioAdmin, String claveAdmin) {
        this.capacidadTotal = capacidadTotal;
        this.dineroDisponible = dineroDisponible;
        this.billete_10 = billete_10;
        this.billete_20 = billete_20;
        this.billete_50 = billete_50;
        this.billete_100 = billete_100;
        this.nombreBanco = nombreBanco;
        this.usuarioAdmin = usuarioAdmin;
        this.claveAdmin = claveAdmin;

        listaTransacciones = new String[10];
    }

    // Otro método CONSTRUCTOR para inicializar las variables: ESTE RECIBE 4 DATOS
    public CajeroElectronico (int capacidadTotal, String nombreBanco, String usuarioAdmin, String claveAdmin) {
        this.capacidadTotal = capacidadTotal;
        this.nombreBanco = nombreBanco;
        this.usuarioAdmin = usuarioAdmin;
        this.claveAdmin = claveAdmin;

        this.dineroDisponible = 0;
        this.billete_10 = 0;
        this.billete_20 = 0;
        this.billete_50 = 0;
        this.billete_100 = 0;

        listaTransacciones = new String [10];

    }

    // Método Getter para extraer los valores:
    public int getCantidadDineroTotal () {
        return capacidadTotal;
    }
    public int getDineroDisponible () {
        return dineroDisponible;
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
    public String getUsuarioAdmin () {
        return usuarioAdmin;
    }
    public String getClaveAdmin () {
        return claveAdmin;
    }
    public String []getListaTransacciones() {
        return listaTransacciones;
    }

    // Método Setter para asignar o cambiar los valores de los 
    // atributos y recibir el nuevo dato a modificar:
    public void setCantidadDineroTotal (int dato) {
        capacidadTotal = dato;
    }
    public void setDineroDisponible (int dato) {
        dineroDisponible = dato;
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
    public void setUsuarioAdmin (String dato) {
        usuarioAdmin = dato;
    }
    public void setClaveAdmin (String dato) {
        claveAdmin = dato;
    }
    public void setListaTransacciones (String[] dato) {
        listaTransacciones = dato;
    }

    // Otros métodos a crear para la aplicación:
        // abastecerCajero(...) OK
        // verHistorialCajero(...) OK
        // consignarDineroTarjeta(...)
        // retirarDineroTarjeta(...)
        // consultarSaldoTarjeta(...) 
        // cambiarClaveTarjeta(...)
        // bloquearCajero(...) --> con boolean

    
    // Para ver que esté imprimiendo bien.
    public void imprimirDetalle(){
        System.out.println("\n------------------------------ ");
        System.out.println(" DETALLE CAJERO ELECTRÓNICO ");
        System.out.println(" capacidadTotal = " +capacidadTotal);
        System.out.println(" dineroDisponible = "+dineroDisponible);
        System.out.println(" billete_10 = "+billete_10);
        System.out.println(" billete_20 = "+billete_20) ;
        System.out.println(" billete_50 = "+billete_50);
        System.out.println(" billete_100 = "+billete_100);
        System.out.println(" nombreBanco = "+nombreBanco);
    
        System.out.println(" usuarioAdmin = "+usuarioAdmin);
        System.out.println(" claveAdmin = "+claveAdmin);

        System.out.println(" HISTORIAL TRANSACCIONES ");
        for (int i = 0; i < listaTransacciones.length; i++) {
            if (listaTransacciones[i] != null) {
                System.out.println("   => "+listaTransacciones[i]);
            }
            
        }

        System.out.println(" ------------------------------ ");
        System.out.println("");
    }

    // abastecerCajero(...)
    public boolean abastecerCajero(int billete_10, int billete_20, int billete_50, int billete_100) {
        // Calcular total abastecido
        int total = (billete_10 * 10000) + (billete_20 * 20000) + (billete_50 * 50000) + (billete_100 * 100000);

        // Validar que no exceda el límite
        if (total <= capacidadTotal) {
            // Si. Almacenar los datos en los atributos y retornar True
            dineroDisponible = total;
            this.billete_10 = billete_10; // atributo billete_10 = parámetro billete_10
            this.billete_20 = billete_20;
            this.billete_50 = billete_50;
            this.billete_100 = billete_100;

            registrarTransaccion("ABASTECER", "0001 0002 0003 0004", total, "OK");
            return true;

        } else {
            // No. Imprimir mensaje y retornar False
            registrarTransaccion("ABASTECER", "0001 0002 0003 0004", total, "ERROR");
            return false;
        }
    }

    public void registrarTransaccion(String tipo, String numeroTarjeta, int monto, String estado) {
        // Construir texto que va dentro de la listaTransacciones
        Date fecha = new Date(); // Objeto Date en JDK. Se instancia.
                   //metodo .toString para 'jalar' la fecha.
        String texto = fecha.toString()+" - "+tipo+ " - "+numeroTarjeta+" - "+monto+" - "+estado;

        // Buscar un índice donde esté vacío y meter
        int indice = -1;
        for (int i = 0; i < listaTransacciones.length; i++) {
            if (listaTransacciones[i] == null) {
                indice = i;
                break; // para que pare el for al encontrar el primer null y muestre los registros en orden
            }
        }
        if (indice != -1) {
            listaTransacciones[indice] = texto;
        } else {
            for (int i = 0; i < listaTransacciones.length -1; i++) {
                listaTransacciones[i] = listaTransacciones[i + 1];
            }
            listaTransacciones[listaTransacciones.length -1] = texto;
        }

    }
        // El método va a recibir dos parametros:
    public void verHistorialCajero(String user, String password) {

        if (user.equals(usuarioAdmin) && password.equals(claveAdmin)) {

            registrarTransaccion("HISTORIAL", "0000 0000 0000 0000", 0, "OK");
            
            System.out.println("--------------------------------");
            System.out.println("* HISTORIAL CAJERO ELECTRÓNICO *");
            System.out.println("--------------------------------");

            for (int i=0; i < listaTransacciones.length; i++) {

                if (listaTransacciones[i] != null) {
                    System.out.println(listaTransacciones[i]);
                }

            }
            
        }else{
            System.out.println(" ===> ACCESO DENEGADO <===");
            registrarTransaccion("HISTORIAL", "0000 0000 0000 0000", 0, "ERROR");
        }
    }

    public void consignarDineroTarjeta(TarjetaDebito tarjeta, String clave, int billete_10, int billete_20, int billete_50, int billete_100) {
        int monto = (10000*billete_10) + (20000*billete_20) + (50000*billete_50) + (100000*billete_100);

        // Validar clave
        if(tarjeta.validarClave(clave)){
            // Validar estado de la tarjeta que sea ACTIVA
            if(tarjeta.validarEstadoActiva()){
                // Validadr que el monto ingresado sea mayor a 0
                if(monto > 0){
                    // Validar que el dinero ingresado no supere el tope del cajero
                    if ((dineroDisponible + monto) <= capacidadTotal) {
                        // Aumentar saldo de la tarjeta
                        tarjeta.aumentarSaldo(monto, clave);

                        // Aumentar el saldo del cajero y cantidades de billetes
                        dineroDisponible += monto;
                        this.billete_10 += billete_10;
                        this.billete_20 += billete_20;
                        this.billete_50 += billete_50;
                        this.billete_100 += billete_100;

                        // Registrar la transacción
                        System.out.println("  TRANSACCIÓN EXITOSA - CONSIGNAR DINERO ");
                        registrarTransaccion("CONSIGNACIÓN", tarjeta.getNumeroTarjeta(), monto, "OK");
                    }else{
                        System.out.println("  ERROR MONTO SUPERIOR - CONSIGNAR DINERO ");
                        registrarTransaccion("CONSIGNACIÓN", tarjeta.getNumeroTarjeta(), monto, "ERROR MONTO SUPERIOR");
                    }
                }else{
                    System.out.println("  ERROR MONTO INFERIOR - CONSIGNAR DINERO ");
                    registrarTransaccion("CONSIGNACIÓN", tarjeta.getNumeroTarjeta(), monto, "ERROR MONTO INFERIOR");
                }
            }else{
                System.out.println("  ERROR ESTADO - CONSIGNAR DINERO ");
                registrarTransaccion("CONSIGNACIÓN", tarjeta.getNumeroTarjeta(), monto, "ERROR ESTADO");
            }
        }else{
            System.out.println("  ERROR PASSWORD - CONSIGNAR DINERO ");
            registrarTransaccion("CONSIGNACIÓN", tarjeta.getNumeroTarjeta(), monto, "ERROR PASSWORD");
        }    
    }

}