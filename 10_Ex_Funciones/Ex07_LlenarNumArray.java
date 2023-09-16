/* Implementa una función que reciba un arreglo de números y 
devuelva el arreglo lleno con números aleatorios.*/

public class Ex07_LlenarNumArray{

    public static void main(String[] argx){


        int numeroRandom[] = new int [12];
        numeroRandom = llenarArreglo( numeroRandom );
        imprimirArreglo( numeroRandom );

        int numsRandom[] = new int [5];
        numsRandom = llenarArreglo( numsRandom );
        imprimirArreglo( numsRandom );

        int numerosCualquiera[] = new int [8];
        numerosCualquiera = llenarArreglo( numerosCualquiera );
        imprimirArreglo( numerosCualquiera );


    }



    public static int[] llenarArreglo(int [] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            int aleatorio = (int) (Math.random()*100);
            arreglo[i] = aleatorio; // En la posición i del arreglo, recíbame los aleatorios
        }
        return arreglo;
    }

    public static void imprimirArreglo(int [] arreglo ){ // indicar la dimensión antes del nombre del parámetro
        for( int i = 0; i < arreglo.length; i++){
            System.out.print(" [ "+arreglo[i]+" ] ");
        }
        System.out.println("");
    }


}