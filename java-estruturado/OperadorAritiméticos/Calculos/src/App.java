public class App {
    public static void main(String[] args) throws Exception {

        // Calculo da Média
        /* Calculos media = new Calculos();
        int n1 = 5;
        int n2 = 9;
        float m = (n1 + n2) / 2;

        System.out.format("A media de %d e %d e: %.1f ", n1, n2, m); // Fim */
        
        // Operador Unário (contador++)
        Calculos operadorUnario = new Calculos();   
        int numero = 5;
        int valor = 5 + numero++;

        System.out.println(valor);
        


    }
}
