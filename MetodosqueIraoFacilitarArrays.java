
/*Antes de utilizar métodos devemos importar o pacote arrays */
import java.util.Arrays;

public class MetodosqueIraoFacilitarArrays {

    public static void main(String[] args) {

        /* Vamos primeiro criar o nosso array */

        int[] num = { 9, 5, 0, 7, 4, 2, 6, 3, 1, 8 };
        int[] num2 = { 9, 5, 0, 7, 4, 2, 6, 3, 1, 8 };
        int[] num3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] num4 = { 9, 5, 0, 7, 4, 2, 6, 3, 1, 8 };
        int[] num5 = { 2, 4, 5, 6, 7, 8, 6, 3, 4, 9 };
        int[] num6 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        /*
         * Vamos primeiro utilizar o sort que serve para ordenar os valores
         * do array.
         */

        Arrays.sort(num);

        /*
         * Método fill: Serve para preencher o array de acordo com o valor
         * indicado
         */
        Arrays.fill(num, 10);

        /*
         * Array copy: serve para copiar os valores de um array em um outro
         * array, esse metodo esta na classe System. Ele trabalha com 4
         * valores, sendo: o array que tera os valores copiado, a posição de
         * origem que iremos copiar, o array de destino que ira receber os
         * valores e o tamanho do array copiado
         */
        System.arraycopy(num, 0, num2, 0, 0);

        /*
         * equals: Compara os valores de 2 arrays, se eles forem iguais
         * ele irá retornar true, se não ele irá retornar false
         */
        System.out.println("num é igual a num2? " + Arrays.equals(num, num2));
        System.out.println("num é igual a num3? " + Arrays.equals(num, num3));
        System.out.println("num é igual a num4? " + Arrays.equals(num, num4));
        System.out.println("num é igual a num5? " + Arrays.equals(num, num4));

        System.out.println("num3 é igual a num6? " + Arrays.equals(num3, num6));

        /*
         * binary search: Serve para pesquisar e verificar se determinado
         * elemento está no array, retornando true ou false, temos que
         * passar 2 parametros o array que vamos pesquisar e o valor
         * pesquisado, vale lembrar que caso verdadeiro ele irá apontar
         * a posição (indice) em formato negativo. é necessário que o
         * array esteja ordenado usando o sort.(requer ajustes).
         */
        Arrays.sort(num2);
        int valor = 2;
        System.out.println("O valor " + valor + " está no array? " + Arrays.binarySearch(num2, valor));
        for (int n : num) {
            System.out.printf("%d - ", n);
        }

    }

}
