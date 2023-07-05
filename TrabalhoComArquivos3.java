
/*Import que possibilita trabalhar com arquivos e pastas */
import java.nio.file.*;

public class TrabalhoComArquivos3 {

    public static void main(String[] args) {
        /* O intuito é modificar o conteudo interno do arquivo */

        /*
         * Vamos criar um try e um catch para trabalhar com essas operações
         * já que elas são sensiveis.
         */

        /*
         * Criação do pat com o método arquivo que contera o caminho
         * da pasta que escolhemos trabalhar, lembrando que temos que
         * substituir as barras invertidas pelas barras normais.
         */
        Path logoNova = Paths.get("C:/Users/caike/Documents/Estudos/javacfb/logonova.png");
        Path logoAntigo = Paths.get("C:/Users/caike/Documents/Estudos/javacfb/logoantigo.jpg");

        try {

            /* Aqui dentro vamos iniciar a operação critica */
            /*
             * Esse array ira conter um método que le todos os bytes e
             * retorna um array de bytes.
             */
            byte[] LogoNova = Files.readAllBytes(logoNova);
            /*
             * Agora vamos pegar esse array de bytes e colocar no outro
             * arquivo, usando um write que pede como um dos valores
             * o nome do arquivo que vai receber os bytes e da onde os
             * bytes virão
             */

            Files.write(logoAntigo, LogoNova);
            /*
             * Ao executar e abrir os arquivos, ambos estarão com o mesmo
             * conteudo, já que passamos a imagem de um arquivo para o outro
             */

        } catch (Exception e) {
            System.out.println("Erro");
        }

    }

}
