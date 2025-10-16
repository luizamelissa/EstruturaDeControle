package Exercicio22;
import java.util.Scanner;

public class Exercicio22 {
    
    public static void main(String[] args) {

        double sum = 0;
        int contador = 0;

        Scanner input = new Scanner(System.in);


        while(true){

            System.out.print("Digite sua idade: ");
            int age = input.nextInt();

            if (age <= 0){

                break;

            }

            if (age > 50) {
                System.out.print("Digite sua altura: ");
                double height = input.nextDouble();
                sum += height;
                contador++;
            }
        }

        if (contador > 0) {
            double media = sum / contador;
            System.out.println("A altura média das pessoas com mais de 50 anos é: " + media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi inscrita.");
        }

        input.close();

    }
}
