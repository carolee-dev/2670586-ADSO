public class Ex01_SumaDosNum{
    public static void main(String[] args){


    System.out.println(" Suma = "+sumar(5, 2));

    System.out.println(" Suma = "+sumar(200, -100));

    int yoyito = sumar(-4, 15);
    System.out.println(" Yoyito = "+yoyito);

    for(int i = 0; i < sumar(10, 9); i++){
        int resultado = (i + sumar(2, 3) );
        System.out.println(" "+i+" + "+sumar(2, 3)+" = "+resultado);
    }




    }

    public static int sumar(int a, int b){
        int resultado = (a + b);
        return resultado; 
    }


}