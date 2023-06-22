import java.util. Scanner;
public class Ex18_IMC{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("--> ¿Cuál es tu peso en kilos? ");
        float peso = teclado.nextFloat();
        
        System.out.print("--> ¿Cuál es tu altura en metros? ");
        float altura = teclado.nextFloat();

        float imc = (peso/(float)Math.pow(altura,2));

        System.out.println("--> Tu índice de masa corporal (IMC) es: "+imc);

    }
}