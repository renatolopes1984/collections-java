package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributo
    private Map<String, Integer> contatos;

    //Construtor
    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    //Método que Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
    public void adicionarContato(String nome, Integer telefone){
        contatos.put(nome, telefone);
    }

    //Método que Remove um contato da agenda, dado o nome do contato.
    public void removerContato(String nome){
        if(!contatos.isEmpty()){
            contatos.remove(nome); //Conjunto Map trabalha com chaves únicas não precisa percorrer "ForEach" os elementos.
        }
    }

    //Método que Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
    public void exibirContatos(){
        System.out.println(contatos);
    }

    //Método que Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!contatos.isEmpty()){
           numeroPorNome = contatos.get(nome);
        }
        return numeroPorNome;
    }
}
