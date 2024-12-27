package list;

public class Tarefa {
    //Atributo
    private String descricao;

    //Métodos

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}