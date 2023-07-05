
import java.nio.file.*;

public class TrabalhoComArquivos {

    public static void main(String[] args) {

        /*
         * Vale lembrar que é necessário alterar as barras que estão
         * invertidas
         */
        Path diretorio = Paths.get("C:/Users/caike/Documents/Estudos/javacfb");

        /*
         * Agora vamos verificar se esse path de fato é um diretório
         * usando o método isDirectory(esse método retorna valores
         * booleanos ) e pertence a classe files. Esse método nos
         * se esse caminho é um diretório (pasta), ou seja, supondo
         * que esse caminho seja de um arquivo, ele retornara falso
         * mesmo com o arquivo existindo.
         */

        if (Files.isDirectory(diretorio)) {

            System.out.println("É um diretório");

        } else {

            System.out.println("Não é um diretório");
        }

        /* Vamos trabalhar com arquivos */
        /* A lógica das barras é a mesma */
        Path arquivo = Paths.get("C:/Users/caike/Documents/Estudos/javacfb/TrabalhoComArquivos.java");

        /*
         * Vamos verificar a existência do arquivo com o método
         * exists que também retorna um boolean e pertence a classe
         * files.
         */
        if (Files.exists(arquivo)) {

            System.out.println("O arquivo existe");
        } else {
            System.out.println("O arquivo não existe");
        }
    }

}