import java.util.Scanner;

public class Ex08_gridPrimosB{
    public static void main(String[]args){

        Scanner lectura = new Scanner(System.in);

        System.out.print("--> Ingrese un número par: ");
        int numero = lectura.nextInt();

        if(numero % 2 == 0){

            int contador = 2; // En par arranca en X y en impar arranca en Y
            int aleatorio;

            for(int i = 1; i <= numero; i++){
                for (int j=1; j <= numero; j++){

                    if(contador % 2 == 0){

                        int contGenerado = 0;
                        while(contGenerado < 1){
                            aleatorio = (int)(Math.random()*1000);

                            int divisores = 0;
                            for (int h = 1; h < aleatorio; h++){
                                if(aleatorio % h == 1) {
                                    divisores = divisores + 1;
                                }
                            }
                            if(divisores == 2){
                                System.out.print("["+aleatorio+"]");
                                contGenerado = contGenerado + 1;
                            }
                        }

                    }else{
                        int contGenerado = 0;
                        while(contGenerado < 1){
                            aleatorio = (int)(Math.random()*1000);
                        }
                    }
                    contador = contador + 1;
                }
                System.out.println("");
            }

        }else{
            System.out.println("--> Número no válido.");
        }

    }
}