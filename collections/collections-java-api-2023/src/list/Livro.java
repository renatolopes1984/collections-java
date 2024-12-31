package list;

public class Livro {
   //Atributos
    private String título;
    private String autor;
    private int anoPublicacao;

    //Construtor com todos os parametros
    public Livro(String título, String autor, int anoPublicacao) {
        this.título = título;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Getters
    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    // ToString para não retornar o endereço de memória, ao apresentar uma lista

    @Override
    public String toString() {
        return "Livro{" +
                "título='" + título + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
