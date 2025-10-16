package Exercicio1;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            double[] grupo = new double[4];

            for (int j = 0; j < 4; j++) {
                System.out.println("Digite o valor " + (j + 1) + " do grupo " + i + ": ");
                grupo[j] = input.nextDouble();
            }

            System.out.println("");

            System.out.println("Grupo " + i + ": ");
            System.out.print("Ordem lida: ");
            exibirArray(grupo);

            double[] crescente = grupo.clone();
            Arrays.sort(crescente);
            System.out.print("Ordem crescente: ");
            exibirArray(crescente);

            double[] decrescente = grupo.clone();
            Arrays.sort(decrescente);
            inverterArray(decrescente);
            System.out.print("Ordem decrescente: ");
            exibirArray(decrescente);

            System.out.println("");
        }

        input.close();
    }

    public static void inverterArray(double[] array) {

        int inicio = 0;
        int fim = array.length - 1;

        while (inicio < fim) {
            double temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;
            inicio++;
            fim--;
        }

    }

    public static void exibirArray(double[] array) {

        for (double valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

}