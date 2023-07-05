public class exerciciomedia {

    public static void main(String[] args) {
        /* Vamos criar esse exercicio para testar if, else if e else */

        int nota = 80;
        int media = 65;
        int faltas = 20;
        int maxFaltas = 5;
        /*
         * Lógica do if: se a nota for maior ou igual a média e as
         * faltas for maior que o máximo de falta ele fica de
         * recuperação.
         */
        if (nota >= media && faltas <= maxFaltas) {
            System.out.println("Aluno aprovado");
        } else if (nota >= 40) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        /*
         * Condicional ternária: tem apenas uma condição, ou seja,
         * verdadeiro ou falso.
         */

        String res;
        res = (nota >= media ? "Aprovado" : "Reprovado");
        System.out.println(res);

        /*
         * Switch: Ira avaliar uma variável ou uma constante e dependendo
         * do resultado ele irá executar um caso(bloco) definido pelo
         * programador.
         * Vamos criar um exercicio que aponta a posição de um participante.
         */

        int pos = 0;
        switch (pos) {
            case 1:
                System.out.println("Primeiro Lugar");
                break;

            case 2:
                System.out.println("Segundo lugar");
                break;

            case 3:
                System.out.println("Terceiro lugar");
                break;
            /*
             * O default ocorre quando nenhum dos casos são
             * executados.
             */
            default:
                System.out.println("Não entrou no pódio");
                break;

        }

    }

}
