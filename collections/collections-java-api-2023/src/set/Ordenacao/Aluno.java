package set.Ordenacao;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    //Atributos
    private String nome;
    private long matricula;
    private double nota;

    //Construtor
    public Aluno(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    //Get
    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    //Método equals e hashCode (Diferenciar aluno pela matricula)
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMatricula());
    }

    //toString para não imprimir endereço de memória
    @Override
    public String toString() {
        return "Alunos:" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}';
    }

    //Método compareTo que faz a comparação de alunos
    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }
}
