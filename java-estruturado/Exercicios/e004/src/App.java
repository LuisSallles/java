import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler saldo com reajuste de 1%

        //Variáveis
        Saldo reajuste = new Saldo();
        Scanner ler = new Scanner(System.in);
        float saldo, aumento, novoSaldo;
        float r = 0.01f;

        //Leitura
        System.out.print("Informe o saldo: ");
        saldo = ler.nextFloat();
        if (saldo > 0){
            aumento = saldo * r;
            novoSaldo = aumento + saldo;
            System.out.println("O reajuste do saldo com 1% e de: " + aumento);
            System.out.println("Seu novo saldo e: " + novoSaldo);
        }
               

    }
}
