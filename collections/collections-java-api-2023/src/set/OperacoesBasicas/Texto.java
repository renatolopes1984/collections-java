package set.OperacoesBasicas;

public class Texto {
    //Atributo
    private String texto;

    //Construtor
    public Texto(String texto) {
        this.texto = texto;
    }

    //Get
    public String getTexto() {
        return texto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Texto textoObj = (Texto) o;
        return texto.equals(textoObj.texto);
    }

    @Override
    public int hashCode() {
        return texto.hashCode();
    }

    //toString para impressão correta, sem apresentar endereço de memória:
    @Override
    public String toString() {
        return texto;
    }
}
