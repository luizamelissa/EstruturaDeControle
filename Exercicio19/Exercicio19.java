package Exercicio19;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int contLucroMaior1000 = 0;
        int contLucroMenor200 = 0;
        double lucroTotal = 0;

        System.out.print("Tipo da ação (F para finalizar): ");
        char tipo = input.next().toLowerCase().charAt(0);

        while (tipo != 'f') {
            System.out.print("Preço de compra: ");
            double compra = input.nextDouble();
            System.out.print("Preço de venda: ");
            double venda = input.nextDouble();

            double lucro = venda - compra;
            System.out.println("Lucro da ação: " + lucro);
            lucroTotal += lucro;

            if (lucro > 1000)
                contLucroMaior1000++;
            if (lucro < 200)
                contLucroMenor200++;

            System.out.print("Tipo da próxima ação (F para finalizar): ");
            tipo = input.next().toUpperCase().charAt(0);
        }

        System.out.println("Ações com lucro acima de R$1000: " + contLucroMaior1000);
        System.out.println("Ações com lucro abaixo de R$200: " + contLucroMenor200);
        System.out.println("Lucro total: R$" + lucroTotal);

        input.close();
    }
}
