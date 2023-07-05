/*Programa que pede respostas ao usuário e verifica se estão corretas
 * de acordo com um gabarito.
 */

/*Para realização da leitura devemos importar a classe scanner */
import java.util.Scanner;

public class ExercicioArray2 {
    public static void main(String[] args) {
        /*
         * Depois de importar, devemos declarar o scanner
         * e criar o objeto
         */
        Scanner entrada = new Scanner(System.in);
        /* Vamos criar o array que conterá as respostas corretas */
        char[] gabarito = { 'a', 'a', 'd', 'b', 'c' };
        /*
         * Criação do array de 5 posições que conterá as
         * respostas digitadas.
         */
        char[] respostas = new char[5];
        /*
         * Criação da variável nota que tera como valor inicial
         * o 0.
         */
        int nota;
        nota = 0;
        /* aqui ele armazenara as mesmas respostas que o gabarito */
        respostas[0] = 'a';
        respostas[1] = 'a';
        respostas[2] = 'd';
        respostas[3] = 'b';
        respostas[4] = 'c';
        /* Variável que será parametro para o for. */
        int i;
        /*
         * enquanto a variável i for menor que o tamanho do
         * array respostas, ele adicionara mais um na contagem.
         */
        for (i = 0; i < respostas.length; i++) {
            /* Vamos pedir as respostas pro usuário */
            System.out.println("Informe a resposta: " + i);
            /* Vamos ler o valor e guardar na variável respostas */
            respostas[i] = entrada.nextLine().charAt(0);
        }
        /* Aqui será realizado o teste para verificar as respostas. */
        /*
         * Enquanto o i for menor que o tamanho do array respostas
         * ele fará a verificação e se as respostas forem corretas,
         * ele adicionara + 1 na nota
         */
        for (i = 0; i < respostas.length; i++) {
            /*
             * Se os valores da resposta forem igual aos valores do gabarito,
             * será adicionado + 1 na contagem.
             */
            if (respostas[i] == gabarito[i]) {
                nota++;
            }
        }
        System.out.println("Nota do aluno: " + nota);

    }

}
