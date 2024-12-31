package list;

public class CalculadoraNumeros {
    public static void main(String[] args) {
        // Instanciei o objeto que é a lista de números
        SomaNumeros somaNumeros = new SomaNumeros();

        //Adicionando números a lista:
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(70);
        somaNumeros.adicionarNumero(10000);
        somaNumeros.adicionarNumero(21);
        somaNumeros.adicionarNumero(-2);

        // Testando o método de somar todos os valores:
        int soma = somaNumeros.calcularSoma();
        System.out.println("A soma dos números é: " + soma);

        System.out.println("**********************************************************************************************");


        // Testando o método que apresenta o maior valor da lista:
        System.out.println("O maior número da lista é o: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("**********************************************************************************************");

        // Testando o método que apresenta o menor valor da lista:
        System.out.println("O menor número da lista é o: " + somaNumeros.encontrarMenorNumero());

        System.out.println("**********************************************************************************************");

        // Testando o método que exibe a lista completa de números:
        somaNumeros.exibirNumeros();

    }
}
