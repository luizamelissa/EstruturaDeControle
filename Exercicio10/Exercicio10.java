package Exercicio10;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        int somaPares = 0;
        int somaPrimos = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++){

            System.out.print("Digite o " + (i + 1) + "º número: ");
            int num = input.nextInt();

            if (num % 2 == 0){

                somaPares += num;

        }

            boolean isPrime = true;

            if (num <= 1){

                isPrime = false;

            }

            for (int n = 2; n <= Math.sqrt(num); n++){

                if (num % n == 0){

                    isPrime = false;
                    break;
                        
                }
            }

            if (isPrime){

                somaPrimos += num;

            }


        }

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números primos: " + somaPrimos);

        input.close();

    }

}