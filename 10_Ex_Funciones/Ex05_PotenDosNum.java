public class Ex05_PotenDosNum{

    public static void main(String[] args){

        System.out.println(" Potencia = "+potenciar(5, 3));

        System.out.println(" Potencia = "+potenciar(2, 5));

        double fulanito = potenciar(4, 4);
        System.out.println(" fulanito = "+fulanito);

    }


    public static double potenciar(double a, double b){
        double resultado = Math.pow(a, b); // <<< Operación para potenciar
        return resultado; 
    }

    /* Escribe una función que tome dos números como entrada y 
    calcule el primero elevado a la potencia del segundo. */



}