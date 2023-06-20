import java.util.Scanner;
public class Ex16_interesComp{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);


        System.out.println("¿Cuánto es su capital inicial? ");
        int capital1 = teclado.nextInt();

        System.out.println("¿Con qué tasa de interés anual quiere calcular la inversión? ");
        int iTasa = teclado.nextInt();
 
        /* 
        System.out.println("¿A cuántos años va a invertir el capital? ");
        int tiempo = teclado.nextInt();
        */

        int interes1 = capital1 * iTasa / 100;
        int periodo1 = interes1 + capital1;
        
        int interes2 = periodo1 * iTasa / 100;
        int periodo2 = interes2 + periodo1;

        int interes3 = periodo2 * iTasa / 100;
        int periodo3 = interes3 + periodo2;

        int interes4 = periodo3 * iTasa / 100;
        int periodo4 = interes4 + periodo3;

        int interes5 = periodo4 * iTasa / 100;
        int periodo5 = interes5 + periodo4;

        System.out.println("Vea a continuación una proyección anual de su inversión al "+iTasa+"%: ");
        System.out.println("Total periodo 1: "+periodo1+"  Monto generado por los intereses: "+interes1);
        System.out.println("Total periodo 2: "+periodo2+"  Monto generado por los intereses: "+interes2);
        System.out.println("Total periodo 3: "+periodo3+"  Monto generado por los intereses: "+interes3);
        System.out.println("Total periodo 4: "+periodo4+"  Monto generado por los intereses: "+interes4);
        System.out.println("Total periodo 5: "+periodo5+"  Monto generado por los intereses: "+interes5);
        System.out.println("---------------------------------------------------------------");
        
        /* 
        int capitalFinal = capital1*(1+iTasa/100)^(tiempo);
        int inteCompuesto = capitalFinal-capital1;

        System.out.println("En "+tiempo+" años, el monto generado por los intereses será de: "+inteCompuesto);
        System.out.println("Y el capital final será de: "+capitalFinal);
        */        

    }
    
}
