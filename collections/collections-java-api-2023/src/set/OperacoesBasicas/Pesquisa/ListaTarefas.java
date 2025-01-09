package set.OperacoesBasicas.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //Atributo
    private Set <Tarefa> tarefas;

    //Construtor
    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    //****************************MÉTODOS******************************

    // Adicionar uma nova tarefa ao Set.
    public void adicionarTarefa(String descricao, boolean tarefaConcluida){
        tarefas.add(new Tarefa(descricao, tarefaConcluida));
    }

    // Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
    public void removerTarefa(String descricao) {
        Tarefa removeTarefa = null;
        for(Tarefa tarefa : tarefas){
            if(tarefa.getDescricao().equals(tarefa)){
                removeTarefa = tarefa;
                break;
            }
        }
        tarefas.remove(removeTarefa);
    }

    // Exibir todas as tarefas da lista de tarefas.
    public void exibirTarefas(){
        System.out.println(tarefas);
    }

    // Método que faz a conta total de tarefas na lista de tarefas.
    public int contarTarefas(){
        return tarefas.size();
    }

    // Método que Retorna um Set com as tarefas concluídas.
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa tarefa : tarefas){
            if(tarefa.isTarefaConcluida()){
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    // Método que Retorna um Set com as tarefas pendentes.
    public Set <Tarefa> obterTarefasPendentes(){
        Set <Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa tarefa : tarefas){
            if(!tarefa.isTarefaConcluida()){ // Invertendo a expressão booleana de true para false
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    // Método marca uma tarefa como concluída de acordo com a descrição.
    public Tarefa marcarTarefaConcluida (String descricao){
        Tarefa tarefaConcluida = null;
        for(Tarefa tarefa : tarefas){
            if(tarefa.getDescricao().equals(descricao)){
                tarefa.setTarefaConcluida(true);
                tarefaConcluida = tarefa;
                break;
            }
        }
        return tarefaConcluida;
    }

    // Método marca uma tarefa como pendente de acordo com a descrição.
    public Tarefa marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        for(Tarefa tarefa : tarefas){
            if(tarefa.getDescricao().equals(descricao)){
                tarefa.setTarefaConcluida(false);
                tarefaPendente = tarefa;
                break;
            }
        }
        return tarefaPendente;
    }

    // Método que Remove todas as tarefas da lista de tarefas
    public void limparListaTarefas(){
        tarefas.removeAll(tarefas);
    }





}
