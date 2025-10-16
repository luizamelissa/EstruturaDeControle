package Exercicio5;
public class Exercicio5 {
    
    public static void main(String[] args) {
        
        int num, result;

        for (int i = 1; i < 11; i++){

            System.out.println("");
            System.out.println("-------------------");
            System.out.println("TABUADA DO " + i);
            System.out.println("");

            for (num = 0; num < 11; num ++){

                result = num * i;
                System.out.println(i + " x " + num + " = " + result);

            }

        }

    }


}
