import java.util.Scanner;

public class Ex03_cartesiano {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int ejeX, ejeY;

        System.out.println("Hola, ingresa un valor entero para el eje X: ");
        ejeX = input.nextInt();

        System.out.println("Ingresa otro valor entero para el eje Y: ");
        ejeY = input.nextInt();

        if(ejeX >= 1 && ejeY >= 1){
            System.out.println("Estás en el Cuadrante 1.");
        }else{
            if(ejeX <= -1 && ejeY >= 1){
                System.out.println("Estás en el Cuadrante 2. ");
            }else if(ejeX <= -1 && ejeY <= -1){
                System.out.println("Estás en el Cuadrante 3.");
            }
        }

        if(ejeX >= 1 && ejeY <= -1){
            System.out.println("Estás en el Cuadrante 4.");
        }else if(ejeX == 0 && ejeY == 0){
            System.out.println("Estás en el Origen o Punto Cero. ");
        }

    }
    
}
