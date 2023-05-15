import java.util.Scanner;

public class Ejercicio06{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        int vals, i, x, suma=0; 
        double promedio;

        System.out.println("Del 1 al 10, ¿cuántos valores desea ingresar?");
        vals=entrada.nextInt();

        for(i=1;i<=vals; i++){
            System.out.println("Valor["+i+"]= ");
            x=entrada.nextInt();
            suma=suma+x;
        }

        promedio=suma/vals;

        System.out.println("El promedio de los valores es: "+promedio);

    }
    
}
