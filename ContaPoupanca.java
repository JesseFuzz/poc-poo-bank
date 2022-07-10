public class ContaPoupanca extends Conta{ //herança
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===EXTRATO DA CONTA POUPANÇA===");
        super.imprimirInfosComuns();
    }
}
