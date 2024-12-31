package list.ordenacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class OrdenacaoPessoas {
    // Lista de pessoas como atributo
    private List<Pessoa> listaPessoas;

    // Construtor para inicialização da lista
    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    // Método que Adiciona uma pessoa à lista
    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome,idade,altura));
    }

    // Método para Ordenar as pessoas da lista por idade usando uma interface comparável.
    /*
    OUTRA FORMA DE ORDENAR, INCLUSIVE DEIXANDO MELHOR A VISUALIZAÇÃO:

    public void ordenarPorIdade(){
        //Ordenando a lista pela idade
        Collections.sort(listaPessoas, Comparator.comparingInt(Pessoa::getIdade));
        //Percorrendo a lista para exibi-la:
        for (Pessoa pessoa : listaPessoas){
            System.out.println(pessoa.getNome() + ": " + pessoa.getIdade() + " anos e " + pessoa.getAltura() + " de altura");
        }

    }*/
    // Método para Ordenar as pessoas da lista por idade usando uma interface comparável (Implementando a Comparable).
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    // Método que Ordene as pessoas da lista por altura usando um Comparador personalizado
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura , new ComparatorPorAltura());
        return pessoasPorAltura;
    }
}
