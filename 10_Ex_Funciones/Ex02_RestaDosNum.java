public class Ex02_RestaDosNum{
    public static void main(String[] args){


    System.out.println(" Resta = "+restar(5, 2));

    System.out.println(" Resta = "+restar(200, -100));

    int perencejo = restar(4, 15);
    System.out.println(" perencejo = "+perencejo);

    for(int i = 0; i < restar(20, 9); i++){
        int resultado = (i - restar(1, 0) );
        System.out.println(" "+i+" - "+restar(1, 0)+" = "+resultado);
    }




    }

    public static int restar(int a, int b){
        int resultado = (a - b);
        return resultado; 
    }


}