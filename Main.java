public class Main {
    public static void main(String[] args) {

        Cliente Jesse = new Cliente();
        Jesse.setNome("Jessé");
        Conta conta1 = new ContaPoupanca(Jesse);
        ContaInterface conta2 = new ContaCorrente(Jesse);


        conta1.depositar(1000d);
        conta1.depositar(50d);
        conta1.transferir(1000d, conta2);
        conta2.imprimirExtrato();
        conta1.imprimirExtrato();
    }
}
