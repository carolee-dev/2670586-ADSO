import java.util.Scanner;

public class Ex06_menuDigitos {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Ingresa un número máximo de 6 dígitos: ");
        numero = entrada.nextInt();
        
        int digito1 = (numero % 10);
        int digito2 = (numero % 100)/10;
        int digito3 = (numero % 1000)/100;
        int digito4 = (numero % 10000)/1000;
        int digito5 = (numero % 100000)/10000;
        int digito6 = (numero % 1000000)/100000;


        System.out.println("// -------------------------------------------------------------- //");
        System.out.println("   Menú: ");
        System.out.println("   1. Primer Dígito. "+digito1+   "  2. Segundo Dígito. "+digito2+   "  3. Tercer Dígito. "+digito3);
        System.out.println("   4. Cuarto Dígito. "+digito4+   "  5. Quinto Dígito. "+digito5+    "  6. Sexto Dígito. "+digito6);
        System.out.println("// -------------------------------------------------------------- //");

        int opcion;

        System.out.print("Ingrese una opción: ");
        opcion = entrada.nextInt();

        if(opcion == 6){
            System.out.println("El sexto dígito es: "+digito6);
        }else if(opcion == 5){
            System.out.println("El quinto dígito es: "+digito5);
        }

        if(opcion == 4){
            System.out.println("El cuarto dígito es: "+digito4);
        }else if(opcion == 3){
            System.out.println("El tercer dígito es: "+digito3);
        }

        if(opcion == 2){
            System.out.println("El segundo dígito es: "+digito2);
        }else if(opcion == 1){
            System.out.println("El primer dígito es: "+digito1);
        }

    }
    
}
