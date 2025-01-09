package set.OperacoesBasicas.Pesquisa;

import java.util.Objects;

public class Tarefa {
    //Atributos
    private String descricao;
    private boolean tarefaConcluida;

    //Construtor
    public Tarefa(String descricao, boolean tarefaConcluida) {
        this.descricao = descricao;
        this.tarefaConcluida = tarefaConcluida;
    }

    //Get
    public String getDescricao() {
        return descricao;
    }

    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }

    //Set para permitir atualizar a tarefa para concluída:
    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Método equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }

    //toString
    @Override
    public String toString() {
        return "Tarefa{" +
                "descrição='" + descricao + '\'' +
                ", tarefaConcluida=" + tarefaConcluida +
                '}';
    }
}
