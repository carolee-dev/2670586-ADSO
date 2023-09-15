public class Ex03_MultiDosNum{
    public static void main(String[] args){


    System.out.println(" Multiplicación = "+multiplicar(5, 2));

    System.out.println(" Multiplicación = "+multiplicar(200, 10));

    int fulana = multiplicar(4, 15);
    System.out.println(" fulana = "+fulana);

    for(int i = 0; i < multiplicar(2, 9); i++){
        int resultado = (i * multiplicar(1, 2) );
        System.out.println(" "+i+" * "+multiplicar(1, 2)+" = "+resultado);
    }



    }

    public static int multiplicar(int a, int b){
        int resultado = (a * b);
        return resultado; 
    }


}