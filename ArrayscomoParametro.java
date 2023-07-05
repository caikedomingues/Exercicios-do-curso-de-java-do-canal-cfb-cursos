public class ArrayscomoParametro {
    public static void main(String[] args) {

        /* Vamos começar criando um array de inteiros */

        int[] numeros = { 10, 5, 15, 20, 100, 25, 14, 8, 3, 98, 75, 62 };
        /* Agora que ja criamos a função devemeo chama-la */

        parImpar(numeros);
    }

    /*
     * Vamos criar uma função que ira imprimir se os valores do array
     * são pares ou impar, como a nossa classe principal é static,
     * o nosso método também é static, ja que vamos chamar ele na classe
     * principal.
     */

    public static void parImpar(int[] num) {

        String res;
        for (int n : num) {
            if (n % 2 == 0) {
                res = "par";
            } else {
                res = "impar";
            }

            System.out.printf("%d:%s%n", n, res);
        }

    }

}
