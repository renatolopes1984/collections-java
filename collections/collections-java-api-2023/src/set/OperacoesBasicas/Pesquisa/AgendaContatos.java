package set.OperacoesBasicas.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributo
    private Set <Contato> conjuntoContatos;

    //Construtor
    public AgendaContatos() {
        this.conjuntoContatos = new HashSet<>();
    }

    //Adicionar contato
    public void adicionarContato(String nome, int numero){
        conjuntoContatos.add(new Contato(nome, numero));
    }

    //Exibir contato:
    public void exibirContatos(){
        System.out.println(conjuntoContatos);
    }

    //Pesquisar pelo nome:
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : conjuntoContatos){
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    //Atualiza número do contato:
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : conjuntoContatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;

    }

}
