public class Vetor {
    public static void main(String args[]) {
        /* Array: conjunto de variáveis de mesmo tipo */
        /* Agora vamos criar um exemplo pra fixar o conceito */
        /*
         * Basicamente crie o objeto array que contera 5 posições(siginifica
         * que poderemos armazenar 5 valores)e é do tipo inteiro.
         */
        int[] num = new int[5];
        /*
         * Agora vamos adicionar elementos no array. para realizar essa
         * ação, precisamos indicar: o nome da variável, o inidice(posição)
         * e o valor que será atribuido.
         */
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        /*
         * Agora para acessar qualquer dado do array, precisamos, indicar
         * o indice no momento da impressão.
         */
        System.out.println(num[3]);

        /*
         * Também temos a opção de criar como os valores atribuidos,
         * para exemplificar melhor, vamos criar um outro vetor que
         * armazena dados do tipo inteiro
         */

        int[] numeros = { 10, 20, 30, 40, 50 };
        /*
         * Para acessar dados, basta realizar o mesmo processo que fizemos
         * antes.
         */
        System.out.println(numeros[0]);

        /*
         * Agora vamos tentar imprimir todos os elementos do array através de
         * um for
         */

        /*
         * Primeiro vamos criar uma variável para servir de parametro
         * pro for
         */
        int i;
        /*
         * Agora vamos inicializar éla com valor 0, enquanto o valor for
         * menor que o tamanho do array, éla incrementara mais 1 na contagem
         */
        for (i = 0; i < numeros.length; i++) {
            /*
             * Agora temos que imprimir os valores, porém, o indice será
             * a variável i
             */
            System.out.println(numeros[i]);

        }
        /*
         * Também podemos criar uma variável constante para indicar o
         * tamanho do array, para isso utilizamos o 'final' na criação
         */
        final int tam = 5;
        int[] arr = new int[tam];
        arr[0] = 36;
        arr[1] = 34;
        arr[2] = 4;
        arr[3] = 3;
        arr[4] = 6;

    }
}
