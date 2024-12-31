package list;

public class Numero {
    //Atributo
    private int numero;

    //Construtor
    public Numero(int numero) {
        this.numero = numero;
    }

    //Getter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // ToString para não retornar o endereço de memória, ao apresentar uma lista
    @Override
    public String toString() {
        return "Numero{" +
                "numero=" + numero +
                '}';
    }
}
