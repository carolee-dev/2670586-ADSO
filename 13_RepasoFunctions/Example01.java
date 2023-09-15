public class Example01{

    public static void main(String[] whatever){


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
        


    }
    
    // función con int:
    public static int sumar(int a, int b){
        int resultado = (a + b);
        return resultado; 
    }

    // función con float:
    public static float dividir(float c, float d){
        float resultado = (c / d);
        return resultado;   
    }

    // función sin retorno, solo se ejecuta cuando se le invoca en el public static void main de arriba:
    // void es para función que no tiene return
    public static void saludar(){
        System.out.println(" \n--- HOLA MUNDO --- \n");
    }

    // función sin retorno, solo se ejecuta cuando se le invoca en el public static void main de arriba:
    public static void saludarEnLoop(int veces){
        for(int i = 0; i < veces; i++){
            System.out.println(" \n--- HOLA MUNDO "+i+"--- \n");    
        }
    }

    // función sin retorno, solo se ejecuta cuando se le invoca en el public static void main de arriba:
    public static void imprimirTabla(int tabla, int multiplo){
        for(int i = 0; i <= multiplo; i++){
            int resultado = (tabla * i);
            System.out.println(" "+tabla+" x "+i+" = "+resultado);
        }
    }





}