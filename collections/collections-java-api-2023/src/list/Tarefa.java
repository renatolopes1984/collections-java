package list;

public class Tarefa {
    //Atributo
    private String descricao;

    //Método construtor

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Get para permitir acesso a atributos privados
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}