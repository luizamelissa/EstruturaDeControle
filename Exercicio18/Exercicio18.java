package Exercicio18;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cont = 0;
        int mulheres200 = 0;
        double somaSalario = 0;
        double menorSalario = Double.MAX_VALUE;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        char sexoMenorSalario = ' ';
        int idadeMenorSalario = 0;

        System.out.print("Idade (negativa para encerrar): ");
        int idade = input.nextInt();

        while (idade >= 0) {
            System.out.print("Sexo (M/F): ");
            char sexo = input.next().toLowerCase().charAt(0);
            System.out.print("Salário: R$");
            double salario = input.nextDouble();

            somaSalario += salario;
            cont++;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (sexo == 'f' && salario <= 200) {
                mulheres200++;
            }

            if (salario < menorSalario) {
                menorSalario = salario;
                sexoMenorSalario = sexo;
                idadeMenorSalario = idade;
            }

            System.out.print("Idade (negativa para encerrar): ");
            idade = input.nextInt();
        }

        if (cont > 0) {
            System.out.println("Média salarial: " + (somaSalario / cont));
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Mulheres com salário abaixo ou igual a R$200: " + mulheres200);
            System.out
                    .println("Pessoa com menor salário: idade " + idadeMenorSalario + " anos, sexo " + sexoMenorSalario
                            + ", salário R$" + menorSalario);
        } else {
            System.out.println("Nenhum dado foi informado!");
        }

        input.close();
    }
}
