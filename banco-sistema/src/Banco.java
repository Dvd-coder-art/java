import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(List<Conta> contas) {
        this.contas = contas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }



    public void setContas(List<Conta> contas){
        this.contas = contas;
    }


}
