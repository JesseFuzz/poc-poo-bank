public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Cliente Jesse = new Cliente();
        Jesse.setNome("Jessé");

        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");

        Conta cont1 = new ContaPoupanca(pedro);
        ContaInterface cont2 = new ContaCorrente(pedro);

        Conta conta1 = new ContaPoupanca(Jesse);
        ContaInterface conta2 = new ContaCorrente(Jesse);

        //cont1.depositar(1000d);
        //cont2.depositar(50d);

        //conta1.depositar(1000d);
        //conta1.depositar(50d);
        //conta1.transferir(1000d, conta2);


        conta2.imprimirExtrato();
        conta1.imprimirExtrato();
        cont2.imprimirExtrato();
        cont1.imprimirExtrato();

        System.out.println(cliente.getAllClientes());

    }
}
