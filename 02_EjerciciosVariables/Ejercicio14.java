import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        float not1, not2, not3, pond;
        int cred1, cred2, cred3, sumCred;

        System.out.println("De 1 a 10, ingrese primera nota: ");
        not1 = teclado.nextFloat();
        System.out.println("De 1 a 10, ingrese segunda nota: ");
        not2 = teclado.nextFloat();
        System.out.println("De 1 a 10, ingrese tercera nota: ");
        not3 = teclado.nextFloat();

        System.out.println("De 1 a 5, ingrese créditos de la materia 1: ");
        cred1 = teclado.nextInt();
        System.out.println("De 1 a 5, ingrese créditos de la materia 2: ");
        cred2 = teclado.nextInt();
        System.out.println("De 1 a 5, ingrese créditos de la materia 3: ");
        cred3 = teclado.nextInt();
    
        sumCred = cred1 + cred2 + cred3;

        pond = ((not1*cred1)+(not2*cred2)+(not3*cred3))/sumCred;

        System.out.println("El promedio ponderado del estudiante es: "+pond);

    }
    
}
