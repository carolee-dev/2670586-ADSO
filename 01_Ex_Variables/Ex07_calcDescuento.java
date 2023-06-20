import java.util.Scanner;

public class Ex07_calcDescuento{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        int precio, dcto, precioFinal;

        System.out.print("-->¿Cuál es el precio del producto? ");
        precio = teclado.nextInt();

        System.out.print("-->¿Cuál es el descuento que le aplica? ");
        dcto = teclado.nextInt();

        precioFinal = precio-(precio*dcto/100);

        System.out.println("-->El precio del producto con el "+dcto+"% de descuento es $"+precioFinal+".");

    }
    
}
