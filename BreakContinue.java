public class BreakContinue {
    public static void main(String[] args) {
        /*
         * Vamos criar uma varivael do tipo inteiro e depois utiliza-la
         * dentro de um for
         */

        int cont = 100;
        int i;
        /*
         * Para todo i que começa com 0 e é menor que cont, i recebe + 1
         * na contagem.
         */
        for (i = 0; i < cont; i++) {
            /* Ira imprimir a contagem de 0 a 99 */
            System.out.println("-" + i);

            /*
             * Agora vamos utilizar o break para encerrar a execução assim
             * que a variável i atingir um determinado valor.
             */
            if (i >= 10) {
                /*
                 * Basicamente, estou estabelecendo que, assim que a
                 * variável i alcançar um determinado resultado, ele
                 * irá encerrar a execução
                 */
                break;

            }
            /*
             * O break pode ser utilizado em estruturas do while, while,
             * for, switch.
             */
        }

    }
}
