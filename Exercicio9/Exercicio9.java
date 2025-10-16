package Exercicio9;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double somaIdades = 0;
        int contBaixoPesado = 0;
        int contAltos = 0;
        int contJovensAltos = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Digite sua idade: ");
            int idade = input.nextInt();

            System.out.print("Digite seu peso: ");
            double peso = input.nextDouble();

            System.out.print("Digite sua altura: ");
            double altura = input.nextDouble();

            somaIdades += idade;

            if (peso > 90 && altura < 1.5){
                contBaixoPesado++;
            }

            if (altura > 1.9) {
                contAltos++;
                if (idade >= 10 && idade <= 30){
                    contJovensAltos++;
                }
            }
        }

        double idadeMedia = somaIdades / 10;
        double porcentagem = (contAltos > 0) ? (contJovensAltos * 100.0 / contAltos) : 0;

        System.out.print("A média das idades: " + idadeMedia);
        System.out.println("Quantidade de pessoas com peso maior que 90kg e altura menor que 1,50m: " + contBaixoPesado);
        System.out.print("A porcentagem de pessoas entre 10 e 30 anos entre os que medem acima de 1,90m: " + porcentagem);

        input.close();
    }

}
