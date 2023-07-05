
/*Vamos importar uma classe que trabalha com valores randomicos, ou seja,
 * aleatórios
 */

import java.security.SecureRandom;

public class Matrizes3 {

    public static void main(String[] args) {

        /* Chamada do método */

        /*
         * Para criar uma matriz temos que utilizar 2 indices e assim como
         * os arrays devemos instancia-las, porém temos que informar a
         * quantidade de linhas e de colunas
         */

        /* Nesse caso temos uma matriz de 3 linhas e 5 colunas */
        int[][] numeros = new int[3][5];

        /*
         * Como o array opera com 2 valores devemos criar um for dentro
         * do outro para trablhar os parametros
         */

        // For das linhas
        for (int l = 0; l < 3; l++) {

            // For das colunas
            for (int c = 0; c < 5; c++) {
                /*
                 * Aqui dentro vamos trabalhar os valores que serão
                 * impressos
                 */
                /*
                 * Nesse caso, como estamos trabalhando com numeros
                 * randomicos, ele irá imprimir valores entre 0 a 100
                 * aleatóriamente
                 */
                numeros[3][5] = new SecureRandom().nextInt(100);

            }

        }

        /* Agora temos que criar o mesmo for para impressão do resultado */

        // For das linhas
        for (int linhas = 0; linhas < 3; linhas++) {

            // For das colunas
            for (int colunas = 0; colunas < 5; colunas++) {
                /*
                 * Aqui dentro vamos trabalhar os valores que serão
                 * impressos
                 */
                /*
                 * Nesse caso, como estamos trabalhando com numeros
                 * randomicos, ele irá imprimir valores entre 0 a 100
                 * aleatóriamente
                 */
                System.out.printf("%d - ", numeros[3][5] = new SecureRandom().nextInt(100));

            }

        }
    }

}
