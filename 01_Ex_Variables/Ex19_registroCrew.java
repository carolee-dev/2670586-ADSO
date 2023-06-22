import java.util.Scanner;

public class Ex19_registroCrew{
    public static void main(String[]args){
        Scanner datos = new Scanner(System.in);

        System.out.print("--> Crew member name: ");
        String name = datos.nextLine();

        System.out.print("--> Age: ");
        int age = datos.nextInt();

        System.out.print("--> Weekly rate: ");
        int rate = datos.nextInt();

        System.out.println("--> " +name+ " is " +age+ " years old and has a weekly rate of $" +rate+ " USD.");

    }
}