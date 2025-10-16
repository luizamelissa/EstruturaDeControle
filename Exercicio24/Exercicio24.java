package Exercicio24;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.print("Digite um número (0 para encerrar): ");
        int num = input.nextInt();

        while (num != 0) {
            if (num > 0) {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            } else {
                System.out.println("Número negativo ignorado!");
            }

            System.out.print("Digite outro número (0 para encerrar): ");
            num = input.nextInt();
        }

        if (maior != Integer.MIN_VALUE) {
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        } else {
            System.out.println("Nenhum número válido informado.");
        }

        input.close();
    }
}