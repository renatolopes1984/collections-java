package set.OperacoesBasicas;

public class RecepcionarConvidado {
    public static void main(String[] args) {
        //Acessando o conjunto de convidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        //Imprimindo o total assegurando que o conjunto Set está zerado:
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados!");

        //Chamando o método que adiciona convidados ao Set:
        conjuntoConvidados.adicionarConvidado("Renato Lopes",1);
        conjuntoConvidados.adicionarConvidado("Ananda Lopes",2);
        conjuntoConvidados.adicionarConvidado("Maria Luiza Lopes",3);
        conjuntoConvidados.adicionarConvidado("Noah Lopes",4);
        conjuntoConvidados.adicionarConvidado("Roberval Quaresma",5);


        //Consultar convidados do conjunto:
        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados!");

        //Remoção de convidado:
        conjuntoConvidados.removerConvidadoPorCodigoConvite(5);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados!");

        conjuntoConvidados.exibirConvidados();







    }
}
