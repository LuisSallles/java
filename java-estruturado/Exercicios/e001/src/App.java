public class App {
    public static void main(String[] args) throws Exception {
        //GASTOS TOTAL DE UMA EMPRESA
        //Variáveis
        BalancoTrimestral gastos = new BalancoTrimestral();
        int gastosJaneiro = 35000;  
        int gastosFevereiro = 78000;
        int gastosMarco = 19000;
        int gastosTrimestral = gastosFevereiro + gastosJaneiro + gastosMarco;
        float media = (gastosJaneiro + gastosFevereiro + gastosMarco) / 3;

        System.out.format("O gasto total da Empresa foi %d:\n ", gastosTrimestral);
        System.out.format("A media dos gastos da Empresa foi %.1f ", media);
    }
}
