/* Crea una función que tome tres números y 
retorne el valor máximo entre ellos. */

public class Ex06_MaxTresNum{

    public static void main(String[] mayor){

        System.out.println(" Mayor de Tres = "+mayorDeTres(5, 2, 9));
        System.out.println(" Mayor de Tres = "+mayorDeTres(4, 111, 90));
        System.out.println(" Mayor de Tres = "+mayorDeTres(3, 2, 1));

    }


    public static int mayorDeTres(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            return num1;
        }else if(num2 > num1 && num2 > num3){
            return num2;
        }else{
            return num3;
        }
    }


}


