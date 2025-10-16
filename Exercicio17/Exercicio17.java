package Exercicio17;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int c4 = 0;
        int c5 = 0;
        int c7 = 0;
        int c12 = 0;
        int totalPessoas = 0;

        System.out.print("Número do canal (0 para encerrar): ");
        int canal = input.nextInt();

        while (canal != 0) {
            System.out.print("Número de pessoas assistindo: ");
            int pessoas = input.nextInt();
            totalPessoas += pessoas;

            switch (canal) {
                case 4 -> c4 += pessoas;
                case 5 -> c5 += pessoas;
                case 7 -> c7 += pessoas;
                case 12 -> c12 += pessoas;
                default -> System.out.println("Canal inválido!");
            }

            System.out.print("Número do canal (0 para encerrar): ");
            canal = input.nextInt();
        }

        if (totalPessoas > 0) {
            System.out.println("Porcentagem de audiência do canal 4: " + (c4 * 100.0 / totalPessoas) + "%");
            System.out.println("Porcentagem de audiência do canal 5: " + (c5 * 100.0 / totalPessoas) + "%");
            System.out.println("Porcentagem de audiência do canal 7: " + (c7 * 100.0 / totalPessoas) + "%");
            System.out.println("Porcentagem de audiência do canal 12: " + (c12 * 100.0 / totalPessoas) + "%");
        } else {
            System.out.println("Nenhuma audiência registrada em algum canal!");
        }

        input.close();
    }
}
