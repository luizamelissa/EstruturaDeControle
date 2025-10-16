package Exercicio21;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int nulo = 0;
        int branco = 0;
        int total = 0;

        System.out.print("Digite o código do voto (0 para encerrar): ");
        int voto = input.nextInt();

        while (voto != 0) {
            switch (voto) {
                case 1 -> c1++;
                case 2 -> c2++;
                case 3 -> c3++;
                case 4 -> c4++;
                case 5 -> nulo++;
                case 6 -> branco++;
                default -> System.out.println("Código inválido!");
            }
            total++;
            System.out.print("Digite o código do próximo voto (0 para encerrar): ");
            voto = input.nextInt();
        }

        System.out.println("------- RESULTADO DA VOTAÇÃO -------");
        System.out.println("Candidato 1: " + c1 + " votos");
        System.out.println("Candidato 2: " + c2 + " votos");
        System.out.println("Candidato 3: " + c3 + " votos");
        System.out.println("Candidato 4: " + c4 + " votos");
        System.out.println("Votos Nulos: " + nulo);
        System.out.println("Votos Brancos: " + branco);

        if (total > 0) {
            double porcentagemNulos = (nulo * 100.0 / total);
            double porcentagemBrancos = (branco * 100.0 / total);
            System.out.printf("Porcentagem de nulos: %.2f%%\n", porcentagemNulos);
            System.out.printf("Porcentagem de brancos: %.2f%%\n", porcentagemBrancos);
        } else {
            System.out.println("Nenhum voto registrado.");
        }

        input.close();
    }
}
