import java.util.ArrayList;

public class Cliente {

    public String nome;


    public ArrayList<String> getAllClientes(){
        ArrayList<String> nomesContas = new ArrayList<>();
        nomesContas.add(this.getNome());
        return nomesContas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
