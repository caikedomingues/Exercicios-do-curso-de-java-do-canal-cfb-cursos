
/*Antes de tudo, é necessário importar a classe que permite trabalhar
 * com arquivos
 */
import java.io.IOException;
import java.nio.file.*;
/*Para realizar a leitura do arquivo devemos importar a classe list */
import java.util.List;

public class TrabalhoComArquivos2 {

    /* O throws IOException irá bloquear o erro do código */
    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("C:/Users/caike/Documents/Estudos/javacfb/testedearquivo.txt");

        /* Vamos abrir o conteudo desse arquivo no console */
        /*
         * pra isso temos que criar uma lista do tipo String que lerá
         * todas as linhas do arquivo
         */
        List<String> linhas = Files.readAllLines(arquivo);

        for (String linha : linhas) {
            System.out.println(linha);
        }

        /*
         * Agora, mesmo que seja necessário adicionar ou alterar o arquivo
         * ele executara os conteudos adicionais ou as alterações.
         */

    }

}
