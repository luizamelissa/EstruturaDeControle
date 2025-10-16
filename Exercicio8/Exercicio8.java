package Exercicio8;
import java.util.Scanner;

public class Exercicio8 {
    
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int sIdade = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Idade: ");
            int idade = e.nextInt();

            System.out.print("Peso (kg): ");
            double peso = e.nextDouble();

            System.out.print("Altura (m): ");
            double altura = e.nextDouble();

            System.out.print("Cor dos Olhos (A, P, V, C): ");
            char olhos = e.next().toUpperCase().charAt(0);

            System.out.print("Cor dos Cabelos (P, C, L, R): ");
            char cabelo = e.next().toUpperCase().charAt(0);
            

            if (idade > 50 && peso < 60) {
                c1++;
            }

            if (altura < 1.50) {
                sIdade += idade;
                c2++;
            }

            if (olhos == 'A') {
                c3++;
            }

            if (cabelo == 'R' && olhos != 'A') {
                c4++;
            }
        }

        double mediaIdades = c2 > 0 ? (double) sIdade / c2 : 0;
        double porcentagemAzuis = (double) c3 * 100 / 6;

        System.out.println("\n--- Resultados ---");
        System.out.println("Idade > 50 e Peso < 60: " + c1);
        System.out.printf("Média de Idades (Altura < 1.50): %.2f\n", mediaIdades);
        System.out.printf("%% de Olhos Azuis: %.2f%%\n", porcentagemAzuis);
        System.out.println("Ruivos (sem Olhos Azuis): " + c4);
        
        e.close();
    }

    }


