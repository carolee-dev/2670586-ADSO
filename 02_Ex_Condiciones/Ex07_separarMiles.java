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

        /* if (nums >= 1000000000 && nums <= 2147483647){
            System.out.println("Moneda: $ "+miles1+"."+miles2+"."+miles3+"."+miles4);
        }

        if (nums >= 1000000 && nums <= 1000000000){
            System.out.println("Moneda: $ "+miles1+"."+miles2+"."+miles3);
        }

        if (nums > 1000 && nums <= 1000000){
            System.out.println("Moneda: $ "+miles1+"."+miles2);
        }

        if (nums >= 100  && nums <= 1000){
            System.out.println("Moneda: $ "+miles1+".");
        }
        */

        if (nums >= 0 && nums <= 2147483647){
            
            int cientos = nums % 1000;
            int miles = (nums / 1000) % 1000;
            int millones = (nums / 1000000) % 1000;
            int miles_millones = nums / 1000000000;

            System.out.print("Moneda: $ ");

            // Algoritmo to print miles_millones
            if(miles_millones != 0){
                System.out.print(miles_millones+".");
            }else{
                System.out.print("");
            }

            // Algoritmo to print millones
            if(millones == 0){
                if(miles_millones!=0){
                    System.out.print("000.");
                }else{
                    System.out.print("");
                }
            }else{ // Sea X
                if(millones >= 1 && millones <= 9){
                    if(miles_millones != 0){
                        System.out.print("00"+millones+".");
                    }else{
                        System.out.print(millones+".");
                    }   
                } // Sea XX 
                if(millones >= 10 && millones <= 99){
                    if(miles_millones != 0){
                        System.out.print("0"+millones+".");
                    }else{
                        System.out.print(millones+".");
                    }
                } // Sea xxx
                if(millones >= 100 && millones <= 999){
                    System.out.print(millones+".");
                }
            }

            // Algoritmo to print miles
            if(miles == 0){
                if(miles_millones != 0 || millones != 0){
                    System.out.print("000.");
                }else{
                    System.out.print("");
                }
            }else{ // Sea X
                if(miles >= 1 && miles <= 9){
                    if(miles_millones != 0 || millones != 0){
                        System.out.print("00"+miles+".");
                    }else{
                        System.out.print(miles+".");
                    }
                } // Sea XX
                if(miles >= 10 && miles <= 99){
                    if(miles_millones != 0 || millones != 0){
                        System.out.print("0"+miles+".");
                    }else{
                        System.out.print(miles+".");
                    }
                } // Sea xxx    
                if(miles >= 100 && miles <= 999){
                    System.out.print(miles+".");
                }     
            }

            // Algoritmo to print cientos
            if(cientos == 0){
                if(miles_millones != 0 || millones != 0 || miles != 0){
                    System.out.print("000");
                }else{
                    System.out.print("0");
                }
            }else{
                if(cientos >= 1 && cientos <= 9){
                    if(miles_millones != 0 || millones != 0 || miles != 0){
                        System.out.print("00"+cientos);
                    }else{
                        System.out.print(cientos);
                    }
                }
                if(cientos >= 10 && cientos <= 99){
                    if(miles_millones != 0 || millones != 0 || miles != 0){
                        System.out.print("0"+cientos);
                    }else{
                        System.out.print(cientos);
                    }
                }
                if(cientos >= 100 && cientos <= 999){
                    System.out.print(cientos);
                }
            }
           
        }else{
            System.out.println("Ingrese un número válido. ");
        }
        
    }
    
}