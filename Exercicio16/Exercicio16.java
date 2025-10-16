package Exercicio16;
import java.util.Scanner;

public class Exercicio16 {
    
    public static void main(String[] args) {
        
        int contador = 0;
        int idade;
        int soma = 0;


        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = input.nextInt();

        while (idade != 0 ){

            soma += idade;
            contador++;
            System.out.println("Digite 0 para parar: ");
            idade = input.nextInt();

        }

        if (contador > 0){

            double media = (double) soma / contador;
            System.out.println("Média das idades: " + media);

        } else {

            System.out.println("Nenhuma idade inserida");

        }

        input.close();

    }

}
