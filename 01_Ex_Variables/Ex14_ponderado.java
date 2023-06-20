import java.util.Scanner;

public class Ex14_ponderado{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        float nota1, nota2, nota3, ponderado;
        int cred1, cred2, cred3, sumaCred;

        System.out.println("-->Ingrese las tres notas logradas: ");
        nota1 = teclado.nextFloat();
        nota2 = teclado.nextFloat();
        nota3 = teclado.nextFloat();

        System.out.print("-->De 1 a 5, ingrese créditos de la materia 1: ");
        cred1 = teclado.nextInt();
        System.out.print("-->De 1 a 5, ingrese créditos de la materia 2: ");
        cred2 = teclado.nextInt();
        System.out.print("-->De 1 a 5, ingrese créditos de la materia 3: ");
        cred3 = teclado.nextInt();
    
        sumaCred = cred1 + cred2 + cred3;

        ponderado = ((nota1*cred1)+(nota2*cred2)+(nota3*cred3))/sumaCred;

        System.out.println("-->El promedio ponderado del estudiante es: "+ponderado);

    }
    
}
