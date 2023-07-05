
import java.security.SecureRandom;

public class Matrizes {
    public static void main(String[] args) {
        /*
         * Matrizes trabalha com array de array, ou seja teremos 2 indices
         * para manipular, onde cada posição de um array é criada um novo
         * array.
         * 
         * Trabalha com linhas e colunas, onde o primeiro indice linha
         * manipula as linhas e o segundo indice manipula as colunas
         */

        /* Para iniciar vamos criar uma matriz de 3 linhas e 5 colunas */

        final int linhas = 3;
        final int colunas = 5;

        /* Isso significa que nas 3 linhas eu terei 5 elementos */
        int[][] numeros = new int[linhas][colunas];
        /* Comentei para poder utilizar o for */
        // [0,1,2,3,4,5],
        // [0,1,2,3,4,5],
        // [0,1,2,3,4,5],

        /* O primeiro for é referente as linhas */
        for (int l = 0; l < linhas; l++) {
            /* O segundo for é referente as colunas */

            /*
             * A cada interação do primeiro for, ele executara o segundo
             * for
             */
            for (int c = 0; c < colunas; c++) {
                /*
                 * Aqui dentro vamos representar a matriz e declarar o
                 * SecureRandom
                 */
                System.out.println(numeros[l][c] = new SecureRandom().nextInt(100));
            }
        }

    }

}
