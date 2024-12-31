package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SomaNumeros {
    //Atributo lista
    private List<Numero> listaNumeros;

    //Construtor
    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    // Método para Adiciona um número à lista de números
    public void adicionarNumero(int numero){
        listaNumeros.add(new Numero(numero));
    }

    // Método Calcula a soma de todos os números na lista e retorna o resultado.
    public int calcularSoma(){
        int soma = 0;
        if(!listaNumeros.isEmpty()){ // Validando se lista está vazia
        for(Numero numero : listaNumeros){
            soma += numero.getNumero();
        }
      }
    return soma;
    }

    // Método que retorna o maior valor da lista de números.
    public int encontrarMaiorNumero(){
        return Collections.max(listaNumeros, (a, b) -> Integer.compare(a.getNumero(), b.getNumero())).getNumero();
    }

    // Método que retorna o maior valor da lista de números.
    public int encontrarMenorNumero(){
        return Collections.min(listaNumeros, (a, b) -> Integer.compare(a.getNumero(), b.getNumero())).getNumero();
    }

    // Método que Retorna uma lista contendo todos os números presentes na lista.
    public void exibirNumeros() {
        System.out.println(listaNumeros);;
    }
}


