package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //Atributo
    private Map<String, String> palavras;

    //Construtor
    public Dicionario() {
        this.palavras = new HashMap<>();
    }

    /*
    Método que Adiciona uma palavra e sua definição ao dicionário,
    associando a palavra à sua definição correspondente./*
    */
    public void adicionarPalavra(String palavra, String definicao){
        palavras.put(palavra, definicao);
    }

    //Método que Remove uma palavra do dicionário, dado o termo a ser removido.
    public void removerPalavra(String palavra){
        if(!palavras.isEmpty()){
            palavras.remove(palavra);//Conjunto Map trabalha com chaves únicas não precisa percorrer "ForEach" em busca do elemento.
        }
    }

    //Método que Exibe todas as palavras e suas definições do dicionário,
    public void exibirPalavras(){
        System.out.println(palavras);
    }

    //Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
    public String pesquisarPorPalavra(String palavra){
        String definicaoPorPalavra = null;
        if(!palavras.isEmpty()){
            definicaoPorPalavra = palavras.get(palavra);
        }
        return definicaoPorPalavra;
    }


}
