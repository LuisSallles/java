import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Variáveis
        float nota;
        String nome;

        // Leitor de Dados
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual e o nome do Aluno? ");
        nome = leitor.nextLine();
        System.out.format("Qual o a sua nota, %s? ", nome);
        nota = leitor.nextFloat();
        
        // Saída de Dados
        System.out.format("A nota de %s e: %.1f ", nome, nota);
    }
}
 