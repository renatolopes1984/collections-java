package set.Ordenacao;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //Conjunto Set de produto como atributo
    Set<Produto> produtos;

    //Construtor
    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    //Método que Adiciona um produto ao cadastro.
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtos.add(new Produto(codigo, nome, preco, quantidade));

    }

    //Método que Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;
    }

    //Método que Exibe todos os produtos do cadastro em ordem crescente de preço.
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtos);
        return produtoPorPreco;
    }
}
