package Exercicio11;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do carro: ");
        double valor = input.nextDouble();

        System.out.printf("Compra à vista (20% de desconto): R$ %.2f%n", valor * 0.8);
        System.out.println("Tabela de Parcelas:");
        System.out.println("");
        System.out.println("Parcelas\tAcréscimo\tPreço Final\tValor da Parcela");

        int[] parcelas = { 6, 12, 18, 24, 30, 36, 42, 48, 54, 60 };
        double[] acrescimos = { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 };

        for (int i = 0; i < parcelas.length; i++) {

            double precoFinal = valor * (1 + acrescimos[i] / 100);
            double valorParcela = precoFinal / parcelas[i];
            System.out.printf("%d\t\t%.0f%%\t\tR$ %.2f\tR$ %.2f%n",
                    parcelas[i], acrescimos[i], precoFinal, valorParcela);
                    
        }

        input.close();
    }
}

