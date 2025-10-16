package Exercicio6;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Double total = 0.0;
        Double vista = 0.0;
        Double prazo = 0.0;

        for (int i = 1; i <= 15; i++) {

            System.out.println("A transação " + i + ", foi à vista (V) ou a prazo (P)?");
            char r = input.next().toLowerCase().charAt(0);

            if (r == 'v') {

                System.out.println("O valor da compra à vista: ");
                Double valor = input.nextDouble();
                vista += valor;
                total += valor;

            } else if (r == 'p') {

                System.out.println("O valor da compra a prazo: ");
                Double valor = input.nextDouble();
                prazo += valor;
                total += valor;

            } else {
                System.out.println("Opção de pagamento inválida! Tente novamente.");
                i--;
            }
        }

        Double primeiraParcelaPrazo = prazo / 3;

        System.out.println("----- RESUMO DAS TRANSAÇÕES -----");
        System.out.print("Total das compras à vista: R$ " + vista);
        System.out.print("Total das compras a prazo: R$ " + prazo);
        System.out.print("Valor total das compras: R$ " + total);
        System.out.print("Valor da primeira prestação (1/3 das compras a prazo): R$ " + primeiraParcelaPrazo);

        input.close();
    }
}
