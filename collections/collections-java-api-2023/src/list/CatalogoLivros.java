package list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Criando Lista como atributo
    private List<Livro> listLivro;

    //Construtor
    public CatalogoLivros() {
        this.listLivro = new ArrayList<>();
    }

    //Métodos
    //Adicionar Livros
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listLivro.add(new Livro(titulo, autor, anoPublicacao));
    }

    //Pesquisar por autor:
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!listLivro.isEmpty()) { //Se existir livro na lista, segue para o foreach
            for(Livro livro : listLivro){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }
    //Pesquisa de livros por um determinado período
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!listLivro.isEmpty()){ //validando se lista está vazia
            for(Livro livro : listLivro){
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    // Pesquisa livros por título, retornando o primeiro localizado
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!listLivro.isEmpty()){ //validando se a lista está vazia
            for(Livro livro : listLivro){
                if(livro.getTítulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break; // Parando pois é apenas o primeiro livro encontrado
                }
            }
        }
        return livroPorTitulo;
    }
}
