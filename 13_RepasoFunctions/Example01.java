public class Example01{

    public static void main(String[] whatever){

        int listado[] = new int [10];
        imprimirArreglo( listado );
        listado = llenarArreglo( listado );
        imprimirArreglo( listado );

        String listadoPersonas [] = new String[5];
        imprimirArregloTexto(listadoPersonas);
        listadoPersonas = restablecerArreglo( listadoPersonas );
        imprimirArregloTexto( listadoPersonas);


        /*
        System.out.println("\n----- PROBANDO FUNCIONES -----");
        System.out.println(" Suma = "+sumar(5, 3));
        System.out.println(" Suma = "+sumar(3, 2));
        System.out.println(" Suma = "+sumar(-3, 20));
        System.out.println(" Suma = "+sumar(100, -50));


        System.out.println("\n----- PROBANDO FUNCIONES -----");
        System.out.println(" Dividir = "+dividir(5, 3));
        System.out.println(" Dividir = "+dividir(3, 2));
        System.out.println(" Dividir = "+dividir(-3, 20));
        System.out.println(" Dividir = "+dividir(100, -50));


        int yoyito = sumar(4, 4);
        System.out.println(" Yoyito = "+yoyito);

        if(sumar(-5, 12) >= 0){
            System.out.println(" El número es mayor a cero.");
        }else{
            System.out.println(" El número es menor a cero.");
        }

        saludar(); 
        saludarEnLoop(5);

        imprimirTabla(5, 10);
        */
    }
    
    public static int sumar(int a, int b){
        int resultado = (a + b);
        return resultado; 
    }

    public static float dividir(float c, float d){
        float resultado = (c / d);
        return resultado;   
    }

    public static void saludar(){
        System.out.println(" \n--- HOLA MUNDO --- \n");
    }

    public static void saludarEnLoop(int veces){
        for(int i = 0; i < veces; i++){
            System.out.println(" \n--- HOLA MUNDO "+i+"--- \n");    
        }
    }

    public static void imprimirTabla(int tabla, int multiplo){
        for(int i = 0; i <= multiplo; i++){
            int resultado = (tabla * i);
            System.out.println(" "+tabla+" x "+i+" = "+resultado);
        }
    }

    public static void imprimirArreglo(int [] arreglo ){ // indicar la dimensión antes del nombre del parámetro
        for( int i = 0; i < arreglo.length; i++){
            System.out.print(" [ "+arreglo[i]+" ] ");
        }
        System.out.println("");
    }

    public static int[] llenarArreglo(int [] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            int aleatorio = (int) (Math.random()*100);
            arreglo[i] = aleatorio; // En la posición del arreglo, recíbame los aleatorios
        }
        return arreglo;
    }


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