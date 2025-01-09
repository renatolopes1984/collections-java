package set.OperacoesBasicas.Pesquisa;

public class TestarListaTarefas {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // ********************************** TESTANDO MÉTODOS **********************************

        // Exibindo a lista vazia
        listaTarefas.exibirTarefas();

        System.out.println("***************************************************************************************");

        //Adicionando tarefas:
        listaTarefas.adicionarTarefa("Tomar whey protein", false);
        listaTarefas.adicionarTarefa("Trocar fralda do Noah", true);
        listaTarefas.adicionarTarefa("Trocar fralda da Malu", false);
        listaTarefas.adicionarTarefa("Levar filhos para a creche", false);

        // Exibindo a lista com as tarefas:
        listaTarefas.exibirTarefas();

        System.out.println("***************************************************************************************");

        // Testando método de contagem das tarefas:
        System.out.println("No conjunto de tarefas existem: " + listaTarefas.contarTarefas() + " tarefas em andamento.");

        System.out.println("***************************************************************************************");

        // Testando método que retorna um conjunto Set de tarefas concluídas:
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());

        System.out.println("***************************************************************************************");

        // Testando método que retorna um conjunto Set de tarefas pendentes:
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        System.out.println("***************************************************************************************");

        // Testar método que atualiza uma tarefa para concluído com base na descrição:
        listaTarefas.marcarTarefaConcluida("Tomar whey protein");
        // Exibindo a lista para testar se a tarefa foi concluída:
        listaTarefas.exibirTarefas();

        System.out.println("***************************************************************************************");

        // Testar método que atualiza uma tarefa para pendente com base na descrição:
        listaTarefas.marcarTarefaPendente("Tomar whey protein");
        // Exibindo a lista para testar se a tarefa foi concluída:
        listaTarefas.exibirTarefas();

        System.out.println("***************************************************************************************");

        // Testando método que apaga todas as tarefas do conjunto Set:
        listaTarefas.limparListaTarefas();
        // Exibindo a lista para testar se a tarefas foram excluídas:
        listaTarefas.exibirTarefas();
    }
}
