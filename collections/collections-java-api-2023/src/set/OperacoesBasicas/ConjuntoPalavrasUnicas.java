package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //Atributo
    private Set<Texto> palavrasUnicas;

    //Construtor
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    //Método para adicionar palavra:
    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(new Texto(palavra));
    }

    //Método para remoção de palavras:
    public void removerPalavra(String palavra){
        Texto removePalavra = null;
        for(Texto texto : palavrasUnicas){
            if(texto.getTexto().equals(palavra)){
                removePalavra = texto;
                break;
            }
        }
        palavrasUnicas.remove(removePalavra);
    }

    //Método para verificar se existe uma palavra no cojunto:
    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(new Texto(palavra));
    }

    //Método que exibe todas as palavras do conjunto:
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas);
    }

}
