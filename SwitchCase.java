
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
         * Basicamente vai testar o valor de uma variável e com base nesse
         * valor ele irá executar um determinado bloco
         */

        Scanner entrada = new Scanner(System.in);

        /* Para iniciar o exercicio devemos criar uma vraivael */
        int posicao;

        System.out.println("Qual a posição? ");
        posicao = entrada.nextInt();

        /*
         * Dentro dos parenteses temos que sinalizar a variável ou
         * parametro que devemos analisar.
         */
        switch (posicao) {
            /*
             * Basicamente, o case irá análisar se o valor da variavel é igual
             * a 1, caso seja, ele irá executar o bloco que definimos no caso
             */
            case 1:
                System.out.println("Medalha de ouro");
                /* Agora adicionamos um break para ele parar após a execução */
                break;
            /* Agora vamos ver outros casos */

            case 2:
                System.out.println("Medalha de prata");
                break;

            case 3:
                System.out.println("Medalha de bronze");
                break;
            /*
             * Caso nenhuma das condiçoes acima sejam satisfeitas, devemos
             * executar um default, que tem como função, realizar um bloco
             * alternativo.
             */
            default:
                System.out.println("Não recebeu medalha");
                break;

        }
    }
}