import java.util.Scanner;
public class Ex07_MinCoMultiplo{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("--> Ingrese el primer número: ");
        num1 = lector.nextInt();

        System.out.print("--> Ingrese el segundo número: ");
        num2 = lector.nextInt();

        System.out.print("--> Ingrese el tercer número: ");
        num3 = lector.nextInt();

        //Primero encontrar el mayor de los 3 números ingresados.
        int numMayor = num1;
        if(num2 > numMayor){
            numMayor = num2;
        }
        if(num3 > numMayor){
            numMayor = num3;
        }

        //Con el numMayor asignado a mcm, verifico si es divisible por los números ingresados. Si lo es, ese número es el MCM y se sale del bucle.
        int mcm = numMayor;
        while(numMayor != 0){
            if(mcm % num1 == 0 && mcm % num2 == 0 && mcm % num3 == 0){
                break;
            }
            mcm = mcm + numMayor;
        }
        System.out.println("--> El es MCM es: "+mcm);
    }
}