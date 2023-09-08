
public class Principal {
    public static void main(String[] args) {

        CajeroElectronico cajero_10 = new CajeroElectronico (300000000, 10000000, 100, 50, 20, 70, "Oscar Bank", "adso123", "10101");
        cajero_10.imprimirDetalle();

        CajeroElectronico cajero_20 = new CajeroElectronico (150000000, "Oscar Bank", "Admin_3", "2010");
        cajero_20.imprimirDetalle();

        cajero_20.abastecerCajero(1000, 1000, 500, 500);
        cajero_20.abastecerCajero(1000, 1000, 500, 5000);
        
        cajero_20.imprimirDetalle();

        
        // TarjetaDebito listaTarjetas [] = new TarjetaDebito [5];
        // int indiceTarjetas = 0;
        // listaTarjetas[0] = new TarjetaDebito("Primera Zuluaga", "0001 1234 1234", "Banco Gro", 900000, 890000, "ultimasTransacciones", "1010", "Estado");
        // listaTarjetas[1] = new TarjetaDebito("Segundo Perez", "0002 1234 1234", "Banco Mundo", 800000, 790000, "ultimasTransacciones", "2020", "Estado");
        // listaTarjetas[2] = new TarjetaDebito("Tercero López", "0003 1234 1234", "Banco Mundo", 700000, 690000, "ultimasTransacciones", "3030", "Estado");
        // listaTarjetas[3] = new TarjetaDebito("Cuarto Jaramillo", "0004 1234 1234", "Banco Gro", 600000, 590000, "ultimasTransacciones", "4040", "Estado");
        // listaTarjetas[4] = new TarjetaDebito("Quinto Tobón", "0005 1234 1234", "Banco Mundo", 500000, 490000, "ultimasTransacciones", "5050", "Estado");

        




    }
}