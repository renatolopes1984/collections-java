package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //Atributo
    private List<Tarefa> tarefasList;

    public ListaTarefas() {
        this.tarefasList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : tarefasList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas (){
        return tarefasList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        //System.out.println("O n° total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("Tarefa 1: Buscar minha sogra");
        //System.out.println("O n° total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("Tarefa 2: Estudar");
        listaTarefas.adicionarTarefa("Tarefa 2: Estudar");
        System.out.println("O n° total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 2: Estudar");
        System.out.println("O n° total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
