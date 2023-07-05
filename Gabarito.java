/*Realização do exercicio sobre gabatritos */

/*Primeiro devemos importar a classe scanner  */
import java.util.Scanner;

public class Gabarito {
    public static void main(String[] args) {
        /* Após importar a classe, devemos declarar o scanner */
        Scanner entrada = new Scanner(System.in);
        /* Feito isso, vamos criar nossos arrays que terão 5 posições */
        /* Array do gabarito que irá conter os valores corretos */
        char[] gabarito = new char[5];
        /*
         * Array de respostas que irá guardar o que foi digitado
         * pelo usuário
         */
        char[] resposta = { 'a', 'b', 'c', 'd', 'e' };
        /* Atribuição de valores do array gabarito */
        gabarito[0] = 'a';
        gabarito[1] = 'b';
        gabarito[2] = 'c';
        gabarito[3] = 'd';
        gabarito[4] = 'e';
        /*
         * Criação da variável i que servira de parametro para a
         * estrutura for
         */
        int i;
        /*
         * Enquanto i que recebe 0 for menor que o tamanho do array resposta,
         * a variável adicionara mais 1 na contagem e realizara a pergunta
         */
        for (i = 0; i < resposta.length; i++) {
            /* Elaboração do texto que ira pedir valores a o usuário */
            System.out.println("Digite a resposta");
            /* Scanner que guardara as respostas digitadas. */
            resposta[i] = entrada.nextLine().charAt(0);
        }
        /* Criação da variável que guardara a nota do aluno. */
        int nota;
        /* Tera como valor inicial o 0 */
        nota = 0;
        /*
         * Enquanto i que recebe 0 for menor que o tamanho do array resposta,
         * a variável adicionara mais 1 na contagem e irá verificar se os valores
         * de respost são iguais ao do gabarito, caso o resultado seja verdadeiro a
         * variável nota adicionara 1 ponto na nota do aluno.
         */
        for (i = 0; i < resposta.length; i++) {
            /* irá verificar se os valores são iguais */
            if (resposta[i] == gabarito[i]) {
                /* Ira adicionar pontos na nota */
                nota++;
            }
        }
        /* Imprimira o resultado */
        System.out.println("Nota do aluno: " + nota);

    }
}
