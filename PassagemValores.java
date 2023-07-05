public class PassagemValores {

    public static void main(String[] args) {

        /* Primeiro vamos criar um array do tipo inteiro contendo as notas */
        int[] notas = { 10, 85, 62, 45, 98, 78, 88, 60, 67, 82 };
        /*
         * para funcionar, devemos criar mais um array, de 2 posições
         * que irá conter os 2 resultados, tanto aprovado quanto reprovado
         */
        int[] resultado = { 0, 0 };

        conferirNotas(notas, resultado);

        System.out.printf("Aprovados:%d%n", resultado[0]);
        System.out.printf("Reprovados:%d%n", resultado[1]);
    }

    /*
     * Agora vamos criar uma função que irá conferir se o aluno foi ou
     * não aprovado
     */
    public static void conferirNotas(int[] nt, int[] r) {
        for (int n : nt) {
            if (n >= 60) {
                r[0]++;
            } else {
                r[1]++;
            }
        }
    }
}
