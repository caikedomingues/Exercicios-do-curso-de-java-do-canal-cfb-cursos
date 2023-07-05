public class ManipularArray {
    public static void main(String[] args) {
        /*
         * Arrays: Coleção de variáveis ou valores, antes de criarmos um
         * array, devemos especificar o tipo dele
         */
        /*
         * Basicamente ao criar o array, temos que instanciar um objeto
         * com o a quantidades de elementos.
         */

        /* Nesse caso temos um array de 5 posições */
        int[] num = new int[5];
        /* Vamos dar valores ao array */
        num[0] = 10;
        num[1] = 3;
        num[2] = 5;
        num[3] = 11;
        num[4] = 13;

        /* Agora vamos colocar o array dentro de um for */
        for (int i = 0; i < num.length; i++) {
            /*
             * Para todo i que começa com zero e é menor que o tamanho do
             * array, ele ira adicionar + 1 na contagem, imprimindo os
             * valores do array
             */
            System.out.println(num[i]);

        }

        /*
         * Também podemos criar um laço especifico para arrays, basta criarmos
         * uma variável que recebe o array
         */

        for (int n : num) {
            System.out.println(n);

        }

        /*
         * Ao imprimir um valor devemos colocar o nome do array, e o indice
         * do valor nos cochetes do array
         */
        System.out.printf("%d", num[3]);

    }
}
