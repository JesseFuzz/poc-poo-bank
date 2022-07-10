public interface ContaInterface { //interface é uma classe abstrata com todos os métodos abstratos

    void sacar(Double valor); //todos os métodos de interfaces já são públicos e não possuem corpo.
    void depositar(Double valor);
    void transferir(Double valor, Conta contaDestino);
}
