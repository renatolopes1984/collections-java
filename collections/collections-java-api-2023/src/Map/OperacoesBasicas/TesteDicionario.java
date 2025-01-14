package Map.OperacoesBasicas;

public class TesteDicionario {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        //Adicionando palavra e sua definição:
        dicionario.adicionarPalavra("Corinthians", "Maior clube do futebol brasileiro!");
        dicionario.adicionarPalavra("São Paulo", "Cidade mais rica do Brasil!");
        dicionario.adicionarPalavra("Palmeiras", "Maior rival do Corinthians!");
        dicionario.adicionarPalavra("Santos", "Maior clube do litoral!");
        dicionario.adicionarPalavra("Corinthians", "Maior clube do futebol brasileiro!");


        //Exibindo o conjunto de elementos:
        dicionario.exibirPalavras();
        System.out.println("*******************************************************************************");

        //Removendo palavra:
        dicionario.removerPalavra("Santos");

        //Exibindo o conjunto de elementos pós exclusão:
        dicionario.exibirPalavras();
        System.out.println("*******************************************************************************");

        //Pesquisando por palavra e retornando a definição:
        dicionario.pesquisarPorPalavra("Corinthians");
        System.out.println("A definição da palavra pesquisada é: " + dicionario.pesquisarPorPalavra("Corinthians"));






    }

}
