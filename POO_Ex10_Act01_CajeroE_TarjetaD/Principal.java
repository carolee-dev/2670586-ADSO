import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Scanner entrada_numero = new Scanner(System.in);
        // Scanner entrada_texto = new Scanner(System.in);

        CajeroElectronico cajero_10 = new CajeroElectronico (30000000, 10000000, 100, 50, 20, 70, "Oscar Bank", "adso123", "1010");
        cajero_10.imprimirDetalle();

        CajeroElectronico cajero_20 = new CajeroElectronico (150000000, "Oscar Bank", "Admin_3", "2010");
        cajero_20.imprimirDetalle();

        cajero_20.abastecerCajero(1000, 1000, 500, 500);
        cajero_20.abastecerCajero(1000, 1000, 500, 5000);
        cajero_20.imprimirDetalle();



        CajeroElectronico listaCajeros [] = new CajeroElectronico [2];
        int indiceCajeros = 0;
        listaCajeros[0] = new CajeroElectronico(50000000, 50000000, 10000000, 10000000, 10000000, 20000000, "Oscar Bank", "admin Carlos", "5050");
        listaCajeros[1] = new CajeroElectronico(50000000, 50000000, 10000000, 10000000, 10000000, 20000000, "Oscar Bank", "admin Carlos", "4040");
        
        // TarjetaDebito listaTarjetas [] = new TarjetaDebito [5];
        // int indiceTarjetas = 0;
        // listaTarjetas[0] = new TarjetaDebito("Primera Zuluaga", "0001 1234 1234", "Banco Gro", 900000, 890000, "ultimasTransacciones", "1010", "Estado");
        // listaTarjetas[1] = new TarjetaDebito("Segundo Perez", "0002 1234 1234", "Banco Mundo", 800000, 790000, "ultimasTransacciones", "2020", "Estado");
        // listaTarjetas[2] = new TarjetaDebito("Tercero López", "0003 1234 1234", "Banco Mundo", 700000, 690000, "ultimasTransacciones", "3030", "Estado");
        // listaTarjetas[3] = new TarjetaDebito("Cuarto Jaramillo", "0004 1234 1234", "Banco Gro", 600000, 590000, "ultimasTransacciones", "4040", "Estado");
        // listaTarjetas[4] = new TarjetaDebito("Quinto Tobón", "0005 1234 1234", "Banco Mundo", 500000, 490000, "ultimasTransacciones", "5050", "Estado");

        




    }
}