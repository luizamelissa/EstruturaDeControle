package Exercicio2;
public class Exercicio2 {

    public static void main(String[] args) {

        double valorIngresso = 5.0;
        double desconto = 0.5;
        int ingressosIniciais = 120;
        int aumentoDesconto = 26;
        int despFixas = 200;
        double lucroMaior = 0;
        double precoMaior = 0;
        int qntMaior = 0;

        System.out.println("Tabela de Lucros do Teatro");
        System.out.println("---------------------------------");
        System.out.println("Preço\t\tIngressos\tLucro (R$)");
        System.out.println("---------------------------------");

        int quantidadeIngressos = ingressosIniciais;

        while (valorIngresso >= 1.0) {

            double valor = valorIngresso * quantidadeIngressos;
            double lucroFinal = valor - despFixas;

            System.out.printf("%.2f\t\t%d\t\t%.2f%n", valorIngresso, quantidadeIngressos, lucroFinal);
            System.out.println("---------------------------------");

            if (lucroFinal > lucroMaior) {

                lucroMaior = lucroFinal;
                precoMaior = valorIngresso;
                qntMaior = quantidadeIngressos;
            }

            valorIngresso -= desconto;
            quantidadeIngressos += aumentoDesconto;
        }

        System.out.println("Lucro máximo obtido: R$ " + lucroMaior);
        System.out.println("Preço do ingresso: R$ " + precoMaior);
        System.out.println("Quantidade vendida: " + qntMaior);
    }
}
