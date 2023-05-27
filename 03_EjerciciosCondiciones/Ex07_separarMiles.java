import java.util.Scanner;
public class Ex07_separarMiles {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        int nums = 0;

        System.out.println("Ingresa un número máximo de 10 dígitos inferior a 2.147.483.647: ");
        nums = input.nextInt();

        System.out.println("// ---------- FORMATO DE MONEDA ----------- //");

        /*
        int miles1 = (nums % 1000000000) / 1000000;
        int miles2 = (nums % 1000000) / 1000;
        int miles3 = (nums % 1000) / 1;
        int miles4 = (nums % 10);
        */

        if (nums >= 0 && nums <= 2147483647){
            
            int cientos = nums % 1000;
            int miles = (nums / 1000) % 1000;
            int millones = (nums / 1000000) % 1000;
            int miles_millones = numero / 1000000000;

            System.out.println("Moneda: "+miles_millones+"."+millones+"."+miles+"."+cientos);

            // Algoritmo print miles_millones
            if(miles_millones != 0){
                System.out.println(+miles_millones+".");
            }else{
                System.out.println("");
            }

            // Algoritmo print millones
            if(millones == 0){
                if(miles_millones !=0){
                    System.out.print("000.");
                }else{
                    System.out.print("");
                }
            }else{
                // Sea X
                if(millones >=1 && millones <= 9){
                    if(miles_millones != 0){
                        System.out.print("00"+millones+".");
                    }else{
                        System.out.print("");
                    }
                    
                }
                if(millones >=10 && millones <= 99){

                }
                if(millones >=100 && millones <= 999){

                }

            }

            // Algoritmo print miles




            
        }else{
            System.out.println("Ingrese un número válido. ");
        }








        /* if (nums >= 1000000000 && nums <= 2147483647){
            System.out.println("Moneda: $ "+miles1+"."+miles2+"."+miles3+"."+miles4);
        }

        if (nums >= 1000000 && nums <= 1000000000){
            System.out.println("Moneda: $ "+miles1+"."+miles2+"."+miles3);
        }

        if (nums > 1000 && nums <= 1000000){
            System.out.println("Moneda: $ "+miles1+"."+miles2);
        }

        if (nums >= 0  && nums <= 1000){
            System.out.println("Moneda: $ "+miles1+"."+miles2);
        }
        
    }
    
}
