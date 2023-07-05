
public class ExercicioArray {
    public static void main(String[] args) {
        /*
         * Vamos criar o gabarito de uma prova usando 2 arrays, um para
         * o gabarito outro para as respostas.
         */
        char[] gabarito = { 'a', 'a', 'd', 'b', 'c' };
        char[] respostas = new char[5];
        /*
         * Vamos criar uma variável que irá trabalhar com as notas, e ela
         * tera´como valor de atribuição o 0.
         */
        int nota = 0;
        /* Agora vamos criar os campos de resposta do array */
        respostas[0] = 'a';
        respostas[1] = 'b';
        respostas[2] = 'c';
        respostas[3] = 'b';
        respostas[4] = 'c';
        /*
         * Agora vamos criar um for que irá executar ações de acordo
         * com o tamanho do array respostas
         */
        int i;
        /*
         * Caso a condição do for seja verdadeira, eu preciso que ele
         * faça o teste condicional if
         */
        for (i = 0; i < respostas.length; i++) {
            /*
             * Se os valores de respostas forem iguais aos valores de
             * gabarito, a variável nota incrementara mais na contagem
             */
            if (respostas[i] == gabarito[i]) {
                nota++;
            }
        }

        System.out.println("Nota do aluno: " + nota);
    }
}
