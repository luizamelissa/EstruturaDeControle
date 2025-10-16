package Exercicio15;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int contSim = 0;
        int contNao = 0;
        int contMulheresSim = 0;
        int contHomens = 0;
        int contHomensNao = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Entrevistado " + i + ":");
            System.out.print("Sexo (M/F): ");
            char sexo = input.next().toUpperCase().charAt(0);
            System.out.print("Resposta (S/N): ");
            char resposta = input.next().toUpperCase().charAt(0);

            if (resposta == 'S')
                contSim++;
            else if (resposta == 'N')
                contNao++;

            if (sexo == 'F' && resposta == 'S') {
                contMulheresSim++;
            }

            if (sexo == 'M') {
                contHomens++;
                if (resposta == 'N')
                    contHomensNao++;
            }
        }

        double porcentagemHomensNao = (contHomens > 0) ? (contHomensNao * 100.0 / contHomens) : 0;

        System.out.println("Total de 'Sim': " + contSim);
        System.out.println("Total de 'Não': " + contNao);
        System.out.println("Mulheres que responderam 'Sim': " + contMulheresSim);
        System.out.println("Porcentagem de homens que disseram 'Não': " + porcentagemHomensNao + "%");

        input.close();
    }
}
