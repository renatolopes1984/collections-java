package list;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {
    //LISTA
    private List<Item> listaCompras;


    public CarrinhoDeCompras () {
        // Inicializa a lista para evitar NullPointerException
        listaCompras = new ArrayList<>();
    }

    //ADICIONAR ITEM A LISTA:
    public void adicionarItem(Item item){
        listaCompras.add(item);
    }

    //GET LISTA
    public List<Item> getListaCompras() {
        return listaCompras;
    }

    //Remover item com base no parametro nome:
    public void removerItem(String nome){
        List<Item> removeItem = new ArrayList<>();

        for (Item item : listaCompras){
            if (item.getNome().equalsIgnoreCase(nome)){
                removeItem.add(item);
            }
        }
        listaCompras.removeAll(removeItem);
    }

    //CALCULAR VALOR TOTAL DE ACORDO COM A QUANTIDADE:
    public double calcularValorTotal(){
        double valorTotal = 0.0;

        for(Item item : listaCompras){
            // Adiciona ao valor total o preço do item multiplicado pela quantidade
            valorTotal += item.getPreco() * item.getQuantidade();
        }

        // Retorna o valor total calculado
        return valorTotal;
    }

    // EXIBIR A LISTA DE ITENS:
    public void exibirItens() {
        System.out.println(listaCompras);
    }

    // QUANTIDADE DE ITENS NO CARRINHO:
    public int quantidadeItens(){
        return listaCompras.size();
    }



}


