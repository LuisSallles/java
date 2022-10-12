import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
         */

         // Variáveis
        Scanner leitor = new Scanner(System.in);
        String nome;
        int idade = 23;
        //Calculos
        int idadeEmDias = idade * 365;
        int idadeEmMeses = idade * 30;
        int total = idadeEmDias + idadeEmMeses;

        //Pincipal
        System.out.print("Digite seu nome: ");
        nome = leitor.nextLine();
        System.out.print("Quantos anos voce tem? ");
        idade = leitor.nextInt();
        System.out.format("IDADE DE LUIS: %d Anos, %d Meses e %d Dias = %d dias", idade, idadeEmMeses, idadeEmDias, total);

    }

    
}
