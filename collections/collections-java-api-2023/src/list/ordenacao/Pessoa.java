package list.ordenacao;

public class Pessoa implements Comparable<Pessoa>{
   // Atributos privados da pessoa
   private String nome;
   private int idade;
   private double altura;

   // Construtor com atributos
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Get para acessar atributos da pessoa
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    // toString para não exibir endereço de memória
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
    // Através do método compareTo faço a comparação das idades que retornarão na lista.
    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(idade, pessoa.getIdade());
    }
}
