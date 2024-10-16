package main; // Declara o pacote ao qual esta classe pertence

import utilidades.FuncoesUteis; // Importa a classe FuncoesUteis do pacote utilidades
import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class main {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entradas do teclado
        Scanner scanner = new Scanner(System.in);

        // Testa a função soma
        System.out.println("Digite dois números para somar:");
        int num1 = scanner.nextInt(); // Lê o primeiro número do usuário
        int num2 = scanner.nextInt(); // Lê o segundo número do usuário
        // Chama a função soma da classe FuncoesUteis e imprime o resultado
        System.out.println("Resultado da soma: " + FuncoesUteis.soma(num1, num2));

        // Testa a função triangulo
        System.out.println("Digite a altura do triângulo:");
        int altura = scanner.nextInt(); // Lê a altura desejada do triângulo
        // Chama a função triangulo da classe FuncoesUteis para desenhar o triângulo
        FuncoesUteis.triangulo(altura);

        // Testa a função printArquivo
        System.out.println("Digite o caminho do arquivo para exibir seu conteúdo:");
        scanner.nextLine(); // Consome a quebra de linha pendente após a leitura do número
        String caminhoArquivo = scanner.nextLine(); // Lê o caminho do arquivo fornecido pelo usuário
        // Chama a função printArquivo da classe FuncoesUteis para imprimir o conteúdo do arquivo
        FuncoesUteis.printArquivo(caminhoArquivo);
    }
}