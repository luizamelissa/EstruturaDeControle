package Exercicio14;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int contRegular = 0;
        int contBom = 0;
        int somaIdadeOtimo = 0;
        int contOtimo = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Opinião (1=regular, 2=bom, 3=ótimo): ");
            int opiniao = input.nextInt();

            if (opiniao == 1) {
                contRegular++;
            } else if (opiniao == 2) {
                contBom++;
            } else if (opiniao == 3) {
                somaIdadeOtimo += idade;
                contOtimo++;
            }
        }

        double mediaOtimo = (contOtimo > 0) ? (double) somaIdadeOtimo / contOtimo : 0;
        System.out.println("A média das idades das pessoas que responderam (ótimo): " + mediaOtimo);
        System.out.println("A quantidade de pessoas que responderam 'regular': " + contRegular);
        System.out.println("A porcentagem de pessoas que responderam bom': " + (contBom / 15.0 * 100) + "%");

        input.close();
    }
}
