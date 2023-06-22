import java.util.Scanner;

public class Ex17_conversorCOP{
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);

        System.out.print("--> Ingrese una cantidad en COP a convertir: ");
        int cop = tecla.nextInt();

        float usd = cop * 0.00024f;
        float eur = cop * 0.00022f;
        float jpy = cop * 0.034f;
        float gbp = cop * 0.00019f;

        System.out.println("--> COP $ "+cop+" equivalen a USD $ "+usd);
        System.out.println("--> COP $ "+cop+" equivalen a EUR $ "+eur);
        System.out.println("--> COP $ "+cop+" equivalen a JPY $ "+jpy);
        System.out.println("--> COP $ "+cop+" equivalen a GBP $ "+gbp);

    }

}