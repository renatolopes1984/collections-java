package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    // Conjunto Set como atributo
    private Set<Aluno> alunos;

    //Construtor iniciando o hashSet
    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    //Método que Adiciona um aluno ao conjunto.
    public void adicionarAluno(String nome, Long matricula, double media){
        alunos.add(new Aluno(nome, matricula, media));
    }

    //Método que Remove um aluno ao conjunto a partir da matricula, se estiver presente.
    public void removerAluno(long matricula){
        Aluno removeAluno = null;
        for(Aluno aluno : alunos){
            if(aluno.getMatricula() == matricula){
                removeAluno = aluno;
                break;
            }
        }
        if(removeAluno != null){
            alunos.remove(removeAluno);
        }
    }

    //Método que Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        return alunosPorNome;
    }

    //Método Exibe todos os alunos do conjunto em ordem crescente de nota.
    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunos);
        return alunosPorNota;
    }


    //Método exibe todos alunos do conjunto:
    public void exibirAlunos(){
        System.out.println(alunos);
    }
}
