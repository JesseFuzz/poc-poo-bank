import java.util.List;

public interface ContaInterface { //interface é uma classe abstrata com todos os métodos abstratos

    void sacar(double valor); //todos os métodos de interfaces já são públicos e não possuem corpo.
    void depositar(double valor);
    void transferir(double valor, ContaInterface contaDestino);

    void imprimirExtrato();

    void listaDeClientes();
}
