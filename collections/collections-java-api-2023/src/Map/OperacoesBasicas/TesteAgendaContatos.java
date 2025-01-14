package Map.OperacoesBasicas;

public class TesteAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //Adicionando contatos na agenda?
        agendaContatos.adicionarContato("Renato", 943845455);
        agendaContatos.adicionarContato("Renato", 964985455);
        agendaContatos.adicionarContato("Renato Lopes", 999995455);
        agendaContatos.adicionarContato("Renato Maurício", 155455);
        agendaContatos.adicionarContato("Ananda Lopes", 155455);
        agendaContatos.adicionarContato("Renato", 44444);

        //Exibindo contatos
        agendaContatos.exibirContatos();
        System.out.println("********************************************************************************");

        //Remover contato contatos
        agendaContatos.removerContato("Ananda Lopes");
        //Exibindo contatos pós exclusão
        agendaContatos.exibirContatos();
        System.out.println("********************************************************************************");

        //Pesquisar contato:
        System.out.println("O telefone do contato pesquisado é: " + agendaContatos.pesquisarPorNome("Renato Lopes"));


    }
}
