public class Example02{

    public static void main(String[] args){


       int listado[] = new int [10];

       imprimirArreglo( listado );
       listado = llenarArreglo( listado );
       imprimirArreglo( listado );
       

       String listadoPersonas [] = new String[5];

       imprimirArregloTexto(listadoPersonas);
       listadoPersonas = restablecerArreglo( listadoPersonas );
       imprimirArregloTexto( listadoPersonas);


    }

    // función con array de enteros:
    public static void imprimirArreglo(int [] arreglo ){ // indicar la dimensión antes del nombre del parámetro
        for( int i = 0; i < arreglo.length; i++){
            System.out.print(" [ "+arreglo[i]+" ] ");
        }
        System.out.println("");
    }

    public static int[] llenarArreglo(int [] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            int aleatorio = (int) (Math.random()*100);
            arreglo[i] = aleatorio; // En la posición i del arreglo, recíbame los aleatorios
        }
        return arreglo;
    }

    // función con array de String:
    public static String[] restablecerArreglo( String [] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = "Llenito";
        }
        return arreglo;
    }

    public static void imprimirArregloTexto(String [] arreglo ){ // indicar la dimensión antes del nombre del parámetro
        for( int i = 0; i < arreglo.length; i++){
            System.out.print(" [ "+arreglo[i]+" ] ");
        }
        System.out.println("");
    }



}