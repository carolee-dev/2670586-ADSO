import java.util.Scanner;

public class Ex07_calcDescuento{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        int precio, dcto, precionFin;

        System.out.println("Por favor digita el precio del producto: ");
        precio = teclado.nextInt();

        System.out.println("Digita el descuento del producto: ");
        dcto = teclado.nextInt();

        precionFin = precio-(precio*dcto/100);

        System.out.println("El precio del producto con el "+dcto+"% de descuento es: "+precionFin);

    }
    
}
