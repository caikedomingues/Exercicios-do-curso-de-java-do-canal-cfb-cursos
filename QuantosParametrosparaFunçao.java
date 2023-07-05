public class QuantosParametrosparaFunçao {

    public static void main(String[] args) {

        /*
         * A variável res terácomo valor a chamada do método, vale lembrar
         * que devemos passar os parametros que ficaram guardados na
         * variável
         * 
         */
        int res = Soma(10, 5);

        /*
         * Vamos criar um array que ira conter os numeros que queremos
         * somar
         */
        int[] valores = { 10, 5, 2, 3 };
        /*
         * Vamos criar variavel res2 que irá ter como valor a chamada da
         * função Soma2(), e terá como parametro o array valores que tera
         * todos os valores que deverão ser somados
         */

        int res2 = Soma2(valores);

        System.out.println("Resultado da soma: " + res);
        System.out.println("Resultado da soma: " + res2);

    }

    /*
     * Vamos criar uma função para realizar soma, como ele deve retornar
     * o valor de uma operação matemática, devemos criar uma função do
     * tipo int
     */
    public static int Soma(int n1, int n2) {

        /* A função tera como retorno a soma das 2 variáveis */
        return n1 + n2;
    }

    /*
     * Vamos criar uma função que não tenha obstaculos em relação a
     * quantidade de parametros ou valores que devem ser somados
     */
    public static int Soma2(int[] n) {
        int res = 0;

        for (int v : n) {
            res += v;
        }

        return res;

    }
}
