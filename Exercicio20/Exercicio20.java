package Exercicio20;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("---- MENU DE MÉDIAS ----");
            System.out.println("1 - Média Aritmética (2 notas)");
            System.out.println("2 - Média Ponderada (3 notas e pesos)");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.print("Nota 1: ");
                double n1 = input.nextDouble();
                System.out.print("Nota 2: ");
                double n2 = input.nextDouble();
                double media = (n1 + n2) / 2;
                System.out.println("Média Aritmética: " + media);
            }

            else if (opcao == 2) {
                System.out.print("Nota 1: ");
                double n1 = input.nextDouble();
                System.out.print("Peso 1: ");
                double p1 = input.nextDouble();
                System.out.print("Nota 2: ");
                double n2 = input.nextDouble();
                System.out.print("Peso 2: ");
                double p2 = input.nextDouble();
                System.out.print("Nota 3: ");
                double n3 = input.nextDouble();
                System.out.print("Peso 3: ");
                double p3 = input.nextDouble();

                double mediaPond = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
                System.out.println("Média Ponderada: " + mediaPond);
            }
            if (opcao == 3) {
                System.out.println("Encerrando o programa!");
            }

            else {
                System.out.println("Opção inválida! Tente novamente.");

            }
        } while (opcao != 3);

        input.close();
    }
}
