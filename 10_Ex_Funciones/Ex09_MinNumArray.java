/* Implementa una función que reciba un arreglo de números y devuelva el valor mínimo. */

public class Ex09_MinNumArray{

    public static void main(String[] argx){
        // 1 Crear arreglo:
        int numeroMinRandom[] = new int [10];
        numeroMinRandom = llenarArreglo( numeroMinRandom );
        imprimirArreglo( numeroMinRandom );
        mostrarValorMinimo( numeroMinRandom );



    }

    // 2 Llenar arreglo:
    public static int[] llenarArreglo(int [] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            int aleatorio = (int) (Math.random()*100);
            arreglo[i] = aleatorio; // En la posición i del arreglo, recíbame los aleatorios
        }
        return arreglo;
    }

    // 3 Encontrar valor mínimo:
    public static int[] mostrarValorMinimo(int [] arreglo){
        int minimo = arreglo[0];
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] < minimo){
                minimo = arreglo[i];
            }
        }
        System.out.println(" El valor mínimo del arreglo es: "+minimo);
        return arreglo;
    }

    // 4 Imprimir resultado:
    public static void imprimirArreglo(int [] arreglo ){ // indicar la dimensión antes del nombre del parámetro
        for( int i = 0; i < arreglo.length; i++){
            System.out.print(" [ "+arreglo[i]+" ] ");
        }
        System.out.println("");
    }

}