public abstract class Conta implements ContaInterface{ //ContaInterface é uma classe abstrata e ela só define o contrato de uso, então eu preciso sobrescrever os métodos aqui dentro
    //uma classe abstrata não pode ser instanciada. Outra forma além de sobrescrever seria tornar ela abstrata e.g. public abstract class Conta implements ContaInterface{}

    private static final int AGENCIA_PADRAO = 1; //será somente uma agencia pra cada conta
    private static final int SEQUENCIAL = 1;



    protected int agencia;
    protected int numero; //dexando PROTECTED eu posso acessá-la das classes filhas com o super.atributo
    protected double saldo; //deixando PRIVATE eu só posso acessar daqui de dentro com o this.atributo


    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL;
    }



    @Override //override pois esses métodos foram sobrescritos/implementados da interface Conta
    public void sacar(Double valor) {

    }

    @Override
    public void depositar(Double valor) {

    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {

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
