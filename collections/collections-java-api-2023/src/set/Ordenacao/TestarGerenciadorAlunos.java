package set.Ordenacao;

public class TestarGerenciadorAlunos {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        //Exibindo lista vazia
        gerenciadorAlunos.exibirAlunos();

        System.out.println("***********************************************************************");

        //Adicionar Alunos
        gerenciadorAlunos.adicionarAluno("Renato Lopes", 10l, 10);
        gerenciadorAlunos.adicionarAluno("Ananda Lopes", 11l, 8);
        gerenciadorAlunos.adicionarAluno("Noah Lopes", 13l, 7);
        gerenciadorAlunos.adicionarAluno("Maria Lopes", 12l, 9);


        //Exibindo lista cadastrada
        gerenciadorAlunos.exibirAlunos();

        System.out.println("***********************************************************************");

        //Testando remoção do Aluno Renato Lopes
        //gerenciadorAlunos.removerAluno(10);

        //Exibindo lista atualizada
        gerenciadorAlunos.exibirAlunos();

        System.out.println("***********************************************************************");

        // Testando impressão em order alfabética por nome:
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println("***********************************************************************");

        //Testando impressão em ordem crescente de notas:
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        System.out.println("***********************************************************************");


    }
}
