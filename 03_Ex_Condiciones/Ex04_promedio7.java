import java.util.Scanner;

public class Ex04_promedio7{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float nota1, nota2, nota3, promedio;

        System.out.println("--> Hola, recuerda que la calificación es de 1 a 10. ");

        System.out.println("--> Digita la primera nota: ");
        nota1 = teclado.nextFloat();

        System.out.println("--> Digita la segunda nota: ");
        nota2 = teclado.nextFloat();

        System.out.println("--> Digita la tercera nota: ");
        nota3 = teclado.nextFloat();

        promedio = (nota1 + nota2 + nota3) / 3;

        if( promedio >= 7){
            System.out.println("--> Aprobado, su promedio es igual o mayor a 7. ");
        }else{
            System.out.println("--> Reprobado, su promedio es menor a 7. ");
        }

    }
}