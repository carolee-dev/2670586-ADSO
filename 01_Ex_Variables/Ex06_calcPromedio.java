import java.util.Scanner;

public class Ex06_calcPromedio{
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, nota5;

        System.out.println("-->Recuerde que las notas de esta materia son de 1 a 5. ");

        System.out.println("-->Ingrese las 5 notas obtenidas: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        nota4 = entrada.nextFloat();
        nota5 = entrada.nextFloat();

        float promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        System.out.println("-->El promedio para esta materia es de: "+promedio);

    }
    
}
