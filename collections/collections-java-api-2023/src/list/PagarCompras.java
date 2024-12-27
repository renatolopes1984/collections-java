package list;

import java.util.List;

public class PagarCompras {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionar itens ao carrinho
        carrinho.adicionarItem(new Item("Caneta",10.0, 5));
        carrinho.adicionarItem(new Item("Carrinho",10.0, 1));
        carrinho.adicionarItem(new Item("Boneca",10.0, 1));

        // Criando item repetido para testar método de remoção.
        carrinho.adicionarItem(new Item("Carrinho",10.0, 1));



        System.out.println("A quantidade de itens no carrinho é: " + carrinho.quantidadeItens());

        // Remover item:
        carrinho.removerItem("Carrinho");
        System.out.println("A quantidade de itens no carrinho é: " + carrinho.quantidadeItens());


        //Calcular e exibe o valor total:
        /*double valorTotal = carrinho.calcularValorTotal();
        System.out.println("O valor total das compras é: R$ " + valorTotal);*/

        //Exibir lista de compras:
        carrinho.exibirItens();
    }
}
