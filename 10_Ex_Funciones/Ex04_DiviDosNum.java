public class Ex04_DiviDosNum{
    public static void main(String[] args){


    System.out.println(" División = "+dividir(5, 2));

    System.out.println(" División = "+dividir(200, 10));

    double fulano = dividir(4, 15);
    System.out.println(" fulano = "+fulano);

    for(int i = 0; i < dividir(18, 2); i++){
        double resultado = (i * dividir(4, 2) );
        System.out.println(" "+i+" / "+dividir(4, 2)+" = "+resultado);
    }



    }

    public static double dividir(double a, double b){
        double resultado = (a / b);
        return resultado; 
    }


}