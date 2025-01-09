package set.Ordenacao;

public class TesteCadastroProdutos {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        //Adicionando elementos ao conjunto:
        cadastroProdutos.adicionarProduto(1l, "Camiseta", 15d, 5);
        cadastroProdutos.adicionarProduto(2l, "Bermuda", 20d, 10);
        cadastroProdutos.adicionarProduto(1l, "Calça", 30d, 2);
        cadastroProdutos.adicionarProduto(9l, "Meias", 2d, 2);

        //Exibindo os produtos
        System.out.println(cadastroProdutos.produtos);

        System.out.println("**********************************************************************");

        //Exibindo por nome:
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println("**********************************************************************");

        //Exibindo produtos pelo preço:
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());


    }
}
