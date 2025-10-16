package Exercicio23;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Novo salário");
            System.out.println("2 - Férias");
            System.out.println("3 - Décimo terceiro");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Salário atual: ");
                    double salario = input.nextDouble();
                    double novo;
                    if (salario <= 1200) {
                        novo = salario * 1.15;
                    } else if (salario <= 2500) {
                        novo = salario * 1.10;
                    } else {
                        novo = salario * 1.05;
                        System.out.println("Novo salário: " + novo);
                    }
                }
                case 2 -> {
                    System.out.print("Salário atual: ");
                    double salario = input.nextDouble();
                    System.out.println("Valor das férias: " + (salario * 2 / 3));
                }
                case 3 -> {
                    System.out.print("Salário atual: ");
                    double salario = input.nextDouble();
                    System.out.print("Meses trabalhados (1 a 12): ");
                    int meses = input.nextInt();
                    System.out.println("13º salário: " + (salario * meses / 12));
                }
                case 4 -> System.out.println("Encerrando o programa!");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        input.close();
    }
}
