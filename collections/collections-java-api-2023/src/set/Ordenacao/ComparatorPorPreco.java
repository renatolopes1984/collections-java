package set.Ordenacao;

import java.util.Comparator;

public class ComparatorPorPreco implements Comparator<Produto> {

    //Método compare
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
