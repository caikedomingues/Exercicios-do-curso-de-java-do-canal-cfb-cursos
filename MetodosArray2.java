import java.util.Arrays;

public class MetodosArray2 {

    public static void main(String[] args) {
        int[] num = { 10, 20, 30, 40, 50 };

        int[] num2 = { 9, 2, 7, 1, 8, 5, 3, 4, 0, 6 };

        /*
         * Arraycopy: serve para copiar os valores de um array dentro de
         * outro array, para isso, precisamos indicar os seguintes valores
         * src: Origem
         * srcPos: posição inicial
         * dest: pra onde os valores irão
         * dest pos: ultima posição que será copiada
         * length: tamanho do array
         */

        System.arraycopy(num, 0, num2, 0, 10);

        /* equals: serve para fazer a comparação entre 2 arrays */
        Arrays.equals(num, num2);

        System.out.println("São iguais? " + Arrays.equals(num, num2));
        /*
         * binarySearch: tem a finalidade de apontar se um elemento está
         * ou não dentro de um array, para utiliza-lo é necessário apontar
         * o nome do array que você quer verificar e o valor que você está
         * procurando.
         */
        int p = 3;
        System.out.println("O elemento " + p + " está no array?" + Arrays.binarySearch(num2, p));

    }
}