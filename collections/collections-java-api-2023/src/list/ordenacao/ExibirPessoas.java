package list.ordenacao;

public class ExibirPessoas {
    public static void main(String[] args) {
        // Instanciando a lista
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        // Adicionando pessoas a lista:
        ordenacaoPessoas.adicionarPessoa("Rafael", 43, 1.90);
        ordenacaoPessoas.adicionarPessoa("Renato", 41, 1.80);
        ordenacaoPessoas.adicionarPessoa("Laercio", 60, 1.79);
        ordenacaoPessoas.adicionarPessoa("Cida", 65, 1.60);
        ordenacaoPessoas.adicionarPessoa("Ravi", 8, 1.50);
        ordenacaoPessoas.adicionarPessoa("Ryan", 20, 1.78);
        ordenacaoPessoas.adicionarPessoa("Cristina", 41, 1.65);
        ordenacaoPessoas.adicionarPessoa("Ananda", 36, 1.70);
        ordenacaoPessoas.adicionarPessoa("Noah", 2, 0.90);
        ordenacaoPessoas.adicionarPessoa("Maria Luiza", 2, 0.85);

        // Exibir a lista ordenando pela idade:
        System.out.println("As pessoas cadastradas ordenadas pela idade são: " + ordenacaoPessoas.ordenarPorIdade());

        // Exibir a lista ordenando pela altura:
        System.out.println("As pessoas cadastradas ordenadas pela idade são: " + ordenacaoPessoas.ordenarPorAltura());


    }
}
