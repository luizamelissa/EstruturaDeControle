package Exercicio3;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int f1 = 0;
        int f5 = 0;

        double porcentagemFaixa1;
        double porcentagemFaixa5;

        for (int i = 1; i <= 8; i++) {

            System.out.println("Digite a idade da " + i + ": ");
            int idade = input.nextInt();

            if (idade <= 15) {
                f1++;
            } else if (idade > 60) {
                f5++;
            }
        }

        porcentagemFaixa1 = ((f1 / 8.0) * 100);
        porcentagemFaixa5 = ((f5 / 8.0) * 100);

        System.out.println("A porcentagem de pessoas na primeira faixa etária (até 15 anos) é: " + porcentagemFaixa1 + " %");
        System.out.println("A porcentagem de pessoas na última faixa etária (acima de 60 anos) é: " + porcentagemFaixa5 + " %");

        input.close();
    }
}
