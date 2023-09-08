
public class Principal {
    public static void main(String[] args) {

        CajeroElectronico cajero_10 = new CajeroElectronico (300000000, 10000000, 100, 50, 20, 70, "Oscar Bank", "adso23456", "23456");
        cajero_10.imprimirDetalle();

        CajeroElectronico cajero_20 = new CajeroElectronico (150000000, "Oscar Bank", "adso54321", "54321");
        cajero_20.imprimirDetalle();

        TarjetaDebito tarjeta_01 = new TarjetaDebito("Primera Zuluaga", "0001 1234 1234", "Oscar Bank", 3900000, 500000, "1010", "Estado", "ultimasTransacciones");
        tarjeta_01.imprimirDetalleTarjeta();
        TarjetaDebito tarjeta_02 = new TarjetaDebito("Segundo Perez", "0002 1234 1234", "Banco Mundo", 8000, 500000, "2020", "Estado", "ultimasTransacciones");
        tarjeta_02.imprimirDetalleTarjeta();
        TarjetaDebito tarjeta_03 = new TarjetaDebito("Tercero López", "0003 1234 1234", "Banco Mundo", 1700000, 500000, "3030", "Estado", "ultimasTransacciones");
        TarjetaDebito tarjeta_04 = new TarjetaDebito("Cuarto Jaramillo", "0004 1234 1234", "Oscar Bank", 6000, 500000, "4040", "Estado", "ultimasTransacciones");
        TarjetaDebito tarjeta_05 = new TarjetaDebito("Quinto Tobón", "0005 1234 1234", "Banco Mundo", 1500000, 500000, "5050", "Estado", "ultimasTransacciones");

        cajero_20.abastecerCajero(1000, 1000, 500, 500);
        cajero_20.abastecerCajero(1000, 1000, 500, 5000);
        
        cajero_20.imprimirDetalle();

        




    }
}