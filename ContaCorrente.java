public class ContaCorrente extends Conta {  //herança
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===EXTRATO DA CONTA CORRENTE===");
        super.imprimirInfosComuns();
    }
}
