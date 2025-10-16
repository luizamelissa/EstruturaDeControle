package Exercicio13;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cont1a10 = 0;
        int cont11a20 = 0;
        int cont21a30 = 0;
        int cont31acima = 0;

        double soma1a10 = 0;
        double soma11a20 = 0;
        double soma21a30 = 0;
        double soma31acima = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.println("A idade da pessoa " + i + ": ");
            int idade = input.nextInt();
            System.out.println("O peso em kg da pessoa " + i + ": ");
            double peso = input.nextInt();

            if (idade <= 10) {
                soma1a10 += peso;
                cont1a10++;
            } else if (idade <= 20) {
                soma11a20 += peso;
                cont11a20++;
            } else if (idade <= 30) {
                soma21a30 += peso;
                cont21a30++;
            } else if (idade > 30) {
                soma31acima += peso;
                cont31acima++;
            }
        }

        double media1a10 = (cont1a10 > 0) ? soma1a10 / cont1a10 : 0;
        double media11a20 = (cont11a20 > 0) ? soma11a20 / cont11a20 : 0;
        double media21a30 = (cont21a30 > 0) ? soma21a30 / cont21a30 : 0;
        double media31acima = (cont31acima > 0) ? soma31acima / cont31acima : 0;

        System.out.println("Média de peso (1 a 10 anos): " + media1a10);
        System.out.println("Média de peso (11 a 20 anos): " + media11a20);
        System.out.println("Média de peso (21 a 30 anos): " + media21a30);
        System.out.println("Média de peso (acima de 30 anos): " + media31acima);

        input.close();
    }
}
