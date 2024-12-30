package list;

public class PesquisarLivros {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivro = new CatalogoLivros();

        //Cenário de testes

        //Criando livros, testando método de adição de livros
        catalogoLivro.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivro.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivro.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivro.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivro.adicionarLivro("Livro 4", "Autor 4", 1984);
        catalogoLivro.adicionarLivro("Livro 5", "Autor 4", 1955);

        //Executando teste do método pesquisarPorAutor:
        System.out.println("PESQUISA DE LIVROS POR AUTOR");
        System.out.println(catalogoLivro.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivro.pesquisarPorAutor("Autor 4"));

        System.out.println("**********************************************************************************************************");

        //Executando teste do método pesquisarPorTitulo:
        System.out.println("PESQUISA DE LIVROS POR DETERMINADO PERÍODO");
        System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(1940,1985));
        System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(1940,2025));

        System.out.println("**********************************************************************************************************");

        System.out.println("PESQUISA DE LIVROS POR TÍTULO");
        System.out.println(catalogoLivro.pesquisarPorTitulo("Livro 1"));







    }
}
