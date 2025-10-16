package Exercicio12;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        
        int contador = 0;
        int primos = 0;

        Scanner input = new Scanner(System.in);

        while (contador < 10){

            System.out.print("Digite o " + (contador + 1) + "º numero: ");
            int num = input.nextInt();

                boolean isPrime = true;

                for (int i = 2; i <= Math.sqrt(num); i++){

                    if (num % i == 0){

                        isPrime = false;
                        break;
                        
                    }
                }

                if (isPrime){

                    primos++;

            }

            contador++;

        }

        System.out.println("Quantidade de números primos: " + primos);
        input.close();

    }
}