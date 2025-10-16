package Exercicio4;
import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args) {
        
        int num, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número: ");
        num = input.nextInt();

        System.out.println("");
        System.out.println("TABUADA DO " + num);
        System.out.println("-------------------");

        for (int i = 0; i < 11; i++){

            result = num * i;

            System.out.println(num + " x " + i + " = " + result);

        }

        System.out.println("-------------------");

        input.close();

    }

}
