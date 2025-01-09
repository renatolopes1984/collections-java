package set.OperacoesBasicas;

public class ExecutarPalavrasUnicas {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        //Verificando a lista completa:
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        //Adicionando palavras:
        conjuntoPalavrasUnicas.adicionarPalavra("Maça");
        conjuntoPalavrasUnicas.adicionarPalavra("Banana");
        conjuntoPalavrasUnicas.adicionarPalavra("Laranja");



        //Verificando a lista completa após inserção de dados:
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        //Testando método para remoção de palavra:
        //conjuntoPalavrasUnicas.removerPalavra("Palavra 4");

        //Exibindo pós remoção
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        //Pesquisar palavra
        if (conjuntoPalavrasUnicas.verificarPalavra("Melão")){
            System.out.println("Existe a palavra Melão");
        } else {
            System.out.println("Não existe a palavra Melão");
        }

    }
}
