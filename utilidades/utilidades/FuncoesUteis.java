package utilidades; // Declara o pacote ao qual essa classe pertence

import java.io.File; // Importa a classe File para manipulação de arquivos
import java.io.FileNotFoundException; // Importa a exceção para tratamento de erro quando o arquivo não for encontrado
import java.util.Scanner; // Importa a classe Scanner para leitura de dados, seja do arquivo ou do usuário

public class FuncoesUteis {

    // Método para somar dois números inteiros
    public static int soma(int a, int b) {
        // Retorna a soma de 'a' e 'b'
        return a + b;
    }

    // Método para desenhar um triângulo de altura 'altura'
    public static void triangulo(int altura) {
        // Laço externo controla a quantidade de linhas (altura)
        for (int i = 1; i <= altura; i++) {
            // Laço interno controla quantos 'x' serão impressos por linha
            for (int j = 0; j < i; j++) {
                System.out.print("x"); // Imprime 'x' na mesma linha
            }
            System.out.println(); // Pula para a próxima linha após imprimir todos os 'x' da linha atual
        }
    }

    // Método para ler um arquivo de texto e imprimir seu conteúdo no console
    public static void printArquivo(String caminhoArquivo) {
        // Cria um objeto File para o caminho do arquivo fornecido
        File arquivo = new File(caminhoArquivo);
        try {
            // Tenta abrir o arquivo usando Scanner
            Scanner leitor = new Scanner(arquivo);
            // Enquanto houver linhas no arquivo, lê e imprime cada uma
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine(); // Lê uma linha do arquivo
                System.out.println(linha); // Imprime a linha no console
            }
            leitor.close(); // Fecha o Scanner após leitura
        } catch (FileNotFoundException e) {
            // Caso o arquivo não seja encontrado, exibe esta mensagem de erro
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }
    }
}
