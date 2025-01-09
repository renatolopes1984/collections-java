package set.OperacoesBasicas.Pesquisa;

import java.util.Objects;

public class Contato {
    //Atributos
    private String nome;
    private int numeroTelefone;

    //Construtor
    public Contato(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    //Get
    public String getNome() {
        return nome;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    //Set do numero para o método de atualização de telefone funcionar.
    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    //Método hashCode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    //toString para a correta impressão, e não endereço de memória
    @Override
    public String toString() {
        return nome + "," + numeroTelefone;
    }
}
