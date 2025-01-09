package set.OperacoesBasicas.Pesquisa;

public class TestarAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        //Exibindo agenda
        agenda.exibirContatos();

        //Adicionando contatos
        agenda.adicionarContato("Renato Lopes", 943845455);
        agenda.adicionarContato("Renato Pitanga", 32165478);
        agenda.adicionarContato("Renato Jordano", 789456123);
        agenda.adicionarContato("Renato", 1225515);
        agenda.adicionarContato("Ananda Lopes", 943826080);
        agenda.adicionarContato("Cida Lopes", 912345689);
        agenda.adicionarContato("Lala Lopes", 94259655);
        agenda.adicionarContato("Noah Lopes", 123456);
        agenda.adicionarContato("Maria Lopes", 12345678);
        agenda.adicionarContato("Renato Lopes", 0);


        //Exibindo agenda após inserção de contatos
        agenda.exibirContatos();

        //Pesquisando o conjunto de objetos pelo nome:
        System.out.println(agenda.pesquisarPorNome("Renato"));

        //Atualizando n° telefone:
        System.out.println("Contato atualizado: " + agenda.atualizarNumeroContato("Noah Lopes", 99885522));

        //Exibindo agenda
        agenda.exibirContatos();


    }
}
