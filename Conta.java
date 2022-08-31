import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Conta implements ContaInterface{ //ContaInterface é uma classe abstrata e ela só define o contrato de uso, então eu preciso sobrescrever os métodos aqui dentro
    //uma classe abstrata não pode ser instanciada. Outra forma além de sobrescrever seria tornar ela abstrata e.g. public abstract class Conta implements ContaInterface{}

    private static final int AGENCIA_PADRAO = 1; //será somente uma agencia pra cada conta
    private static int SEQUENCIAL = 1;



    protected int agencia;
    protected int numero; //deixando PROTECTED eu posso acessá-la das classes filhas com o super.atributo
    protected double saldo; //deixando PRIVATE eu só posso acessar daqui de dentro com o this.atributo
    protected Cliente cliente;


    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular da conta: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        //System.out.println(String.format("lista de Clientes: %s", listaDeClientes()));
    }


    @Override //override pois esses métodos foram sobrescritos/implementados da interface Conta
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo+=valor;
    }

    @Override
    public void transferir(double valor, ContaInterface contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    @Override
    public void listaDeClientes() {
        String nomes =cliente.getNome();
        List<String> nome = new ArrayList<>();
        nome.add(nomes);
        System.out.println("essa é a lista de clientes" +nome);
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
