public class ParametrosparaPrograma {

    /*
     * Vamos criar novamente uma função soma, porém os parametros serão
     * passados no programa
     */
    public static void main(String[] args) {

        /* Vamos criar uma variável que terá como valor inicial o 0 */
        int soma = 0;

        /*
         * Agora vamos verificar se o valor (ou tamanho) do argumento é
         * menor ou igual a 0
         */

        if (args.length <= 0) {
            /* Se a condição for verdadeira ele irá imprimir essa mensagem */
            System.out.println("Sem valores para soma");
            return;
        }

        /*
         * Agora vamos criar um laço do tipo string que ira receber os args
         * (argumentos) ou valores.
         */

        for (String n : args) {

            /* Agora vamos converter essa string em inteiro */
            int v = Integer.valueOf(n);
            /*
             * Agora vamos dizer que soma incrementa a variável v para
             * realizar a soma dos valores que serão passados.
             */
            soma += v;

        }

        /* Vamos imprimir o resultado */
        System.out.println("Soma dos valores " + soma);

        /*
         * Conclusão: descobrimos que String args é um array que serve para
         * armazenar parametros que serão passados na execução "manual" do
         * programa, por isso ao utilizar valores numéricos, devemos
         * converter o tipo do dado.
         */

    }

}
