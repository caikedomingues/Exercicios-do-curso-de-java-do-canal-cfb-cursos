
import java.util.Arrays;

public class MetodosArray {
    public static void main(String[] args) {
        int[] num = { 10, 20, 30, 40, 50 };

        /*
         * Para começar, vamos realizar um exercicio simples com um for
         * que terá o objetivo de imprimir os valores do vetor
         */

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        /*
         * Agora vamos realizar um for especifico para arrays, para
         * funcionar, basta eu criar uma variável e associa-la ao meu vetor
         * Esse for é especificamente para ler os valores do array.
         */
        for (int n : num) {
            System.out.println(n);
        }
        /* também podemos ordenar os elementos de um array */
        int[] num2 = { 9, 2, 7, 1, 8, 5, 3, 4, 0, 6 };
        /* Vamos importar o método sort */
        Arrays.sort(num2);
        System.out.println(num2);

        /*
         * Agora vamos criar o um novo vetor com a utilização do final,
         * que basicamente é uma variável que carrega o tamanho do array
         */
        final int tam = 10;
        int[] numeros = new int[tam];
        /*
         * Agora vamos utilizar o método Arrays fill que serve para
         * preencher arrays. Para funcionar é preciso indicar o vetor e
         * os valores que vão preencher o array
         */
        Arrays.fill(numeros, 10);
        /* Vamos criar uma estrutura de repetição pra imprimir o valor */
        for (int c : numeros) {
            System.out.println(c);
        }

        /*
         * Arraycopy: serve para copiar os valores de um array dentro de
         * outro array, para isso, precisamos indicar os seguintes valores
         * src: Origem
         * srcPos: posição inicial
         * dest: pra onde os valores irão
         * dest pos: ultima posição que será copiada
         * length: tamanho do array
         */
        System.arraycopy(num, 0, numeros, 0, tam);

        /* equals: serve para fazer a comparação entre 2 arrays */
        Arrays.equals(num, numeros);

    }

}
