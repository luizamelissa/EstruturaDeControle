package Exercicio25;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valor;
        double totalInvestido = 0;
        double totalJuros = 0;

        System.out.print("Código do cliente (0 ou menor para encerrar): ");
        int codigo = input.nextInt();

        while (codigo > 0) {
            System.out.print("Tipo de investimento (1-Poupança, 2-Plus, 3-Renda Fixa): ");
            int tipo = input.nextInt();
            System.out.print("Valor aplicado: ");
            valor = input.nextDouble();

            double juros = switch (tipo) {
                case 1 -> valor * 0.015;
                case 2 -> valor * 0.02;
                case 3 -> valor * 0.04;
                default -> 0;
            };

            double rendimento = valor + juros;
            System.out.println("Rendimento mensal: " + rendimento);

            totalInvestido += valor;
            totalJuros += juros;

            System.out.print("Código do próximo cliente (0 ou menor para encerrar): ");
            codigo = input.nextInt();
        }

        System.out.println("Total investido: " + totalInvestido);
        System.out.println("Total de juros pagos: " + totalJuros);

        input.close();
    }
}
