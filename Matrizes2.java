import java.security.SecureRandom;

public class Matrizes2 {

    public static void main(String[] args) {

        int linhas = 3;
        int colunas = 5;

        int[][] numeros = new int[linhas][colunas];

        /* O primeiro for é referente as linhas */
        for (int l = 0; l < linhas; l++) {
            /* O segundo for é referente as colunas */

            for (int c = 0; c < colunas; c++) {
                /*
                 * Aqui dentro vamos representar a matriz e declarar o
                 * SecureRandom
                 */
                System.out.println(numeros[l][c] = new SecureRandom().nextInt(100));

            }
        }

        /* Agora vamos criar um for para imprimir o array */
        for (int[] n : numeros) {
            /* Para cada retorno eu vou pegar o valor de n */
            for (int v : n) {
                System.out.println("Valor de n: " + v);
            }
        }

        /*
         * Como gerar matrizes com elementos criados, vamos criar um
         * elemento de 3 linhas e que conterá 5 elementos
         */
        int[][] num = { { 10, 20, 30, 40, 50 }, { 1, 2, 3, 4, 5 }, { 100, 200, 300, 400, 500 } };
        for (int[] c : num) {
            System.out.println(c);

        }
    }

}
