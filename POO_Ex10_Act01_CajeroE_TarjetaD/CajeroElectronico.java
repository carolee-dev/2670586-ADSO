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
    String listaTransacciones[]; // (fecha-tipoTransaccion-monto-estado)
    String usuarioAdmin;
    String claveAdmin;

    // Método CONSTRUCTOR para inicializar las variables: ESTE RECIBE 9 DATOS
    public CajeroElectronico (int capacidadTotal, int dineroDisponible, int billete_10, int billete_20, int billete_50, int billete_100, String nombreBanco, String usuarioAdmin, String claveAdmin) {
        this.capacidadTotal = capacidadTotal;
        this.dineroDisponible = dineroDisponible;
        this.billete_10 = billete_10;
        this.billete_20 = billete_20;
        this.billete_50 = billete_50;
        this.billete_100 = billete_100;
        this.nombreBanco = nombreBanco;
        this.usuarioAdmin = usuarioAdmin;
        this.claveAdmin = claveAdmin;

        listaTransacciones = new String [20];
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

        listaTransacciones = new String [20];

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
    public String [] getListaTransacciones() {
        return listaTransacciones;
    }
    public String getUsuarioAdmin () {
        return usuarioAdmin;
    }
    public String getClaveAdmin () {
        return claveAdmin;
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
    public void setListaTransacciones (String[] dato) {
        listaTransacciones = dato;
    }
    public void setUsuarioAdmin (String dato) {
        usuarioAdmin = dato;
    }
    public void setClaveAdmin (String dato) {
        claveAdmin = dato;
    }

    // Otros métodos a crear para la aplicación:
        // abastecerCajero(...) 
        // verHistorialCajero(...)
        // consignarDineroTarjeta(...)
        // retirarDineroTarjeta(...)
        // consultarSaldoTarjeta(...)
        // cambiarClaveTarjeta(...)
        // bloquearCajero(...) --> con boolean

    
    // Para ver que esté imprimiendo bien.
    public void imprimirDetalle () {
        System.out.println("\n------------------------------ ");
        System.out.println(" capacidadTotal = " +capacidadTotal);
        System.out.println(" dineroDisponible = "+dineroDisponible);
        System.out.println(" billete_10 = "+billete_10);
        System.out.println(" billete_20 = "+billete_20) ;
        System.out.println(" billete_50 = "+billete_50);
        System.out.println(" billete_100 = "+billete_100);
        System.out.println(" nombreBanco = "+nombreBanco);
    
        System.out.println(" usuarioAdmin = "+usuarioAdmin);
        System.out.println(" claveAdmin = "+claveAdmin);

        for (int i = 0; i < listaTransacciones.length; i++) {
            System.out.println(" Historial Transacciones = "+listaTransacciones[i]);
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

    public void registrarTransaccion (String tipo, String numeroTarjeta, int monto, String estado) {
        // Construir texto que va dentro de la listaTransacciones
        Date fecha = new Date(); // Objeto Date en JDK. Se instancia.
                   //metodo .toString para 'jalar' la fecha.
        String texto = fecha.toString()" - "+tipo+ " - "+numeroTarjeta+" - "+monto+" - "+estado;

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






}