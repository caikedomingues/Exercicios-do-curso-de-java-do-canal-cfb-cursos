public class ClasseMath {

    public static void main(String[] args) {
        /*
         * Classe math: possui vários métodos que possibilitam trabalhar
         * com calculos matemáticos
         */

        /* Math.min: irá passar o valor minimo entre 2 valores */
        System.out.println("menor valor: " + Math.min(15, 5));

        /* Math.max: Imprimi o maior valor entre 2 numeros */

        int n1 = 15;
        int n2 = 5;
        int res = Math.max(n1, n2);
        System.out.println("Maior valor: " + res);

        /*
         * Math.sqrt: Retorna a raiz quadrada de um valor e retorna um
         * double
         */
        double valor1 = 4;
        System.out.println("Raiz quadrada: " + Math.sqrt(valor1));

        /*
         * Math.abs: é do tipo double e também pode trabalhar com valores
         * negativos. Retorna o valor absoluto de uma variavel
         */
        double numero = -64;
        System.out.println("Valor absoluto: " + Math.abs(numero));

        /*
         * Math.random: Não recebe parametros e retorna um double, ou seja,
         * retorna um numero aleatório entre 0 e 1, se quisermos aumentar esse
         * limite, basta multiplicar pelo maior valor que você quer atingir,
         * lembrando que se você quiser que o maior valor entre na contagem,
         * você deve estabelecer como limite, um valor a mais do que o esperado
         */
        System.out.println("Valor aleatório entre 0 e 10: " + Math.random() * 10);

        /* Pow: retorna a potência */
    }
}
