package Exercicio7;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double somaAltura = 0;
        int pessoas = 5;
        int contIdade = 0;
        int contPeso = 0;
        double mediaAltura = 0;
        int contIdade10a20 = 0;
        double porcentagem = 0;

        for (int i = 1; i <= pessoas; i++){

            System.out.print("Digite sua idade: ");
            int idade = input.nextInt();

            System.out.print("Digite sua altura: ");
            double altura = input.nextDouble();

            System.out.print("Digite seu peso: ");
            double peso = input.nextDouble();

            if (idade > 50){

                contIdade++;

            }

            if (idade >= 10 && idade <= 20){

                somaAltura += altura;
                contIdade10a20++;

            }

            if (peso < 40){

                contPeso++;

            }

        }

        if (contIdade10a20 > 0){

                mediaAltura = somaAltura / contIdade10a20;

            }

            porcentagem = ((double)contPeso / pessoas) * 100;

        System.out.println("Pessoas com idade superior a 50 anos: " + contIdade);
        System.out.println("A média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAltura + " metros");
        System.out.println("A porcentagem de pessoas com peso inferior a 40 kg: " + porcentagem + " %");

        input.close();

    }

}