/*Leia 5 valores e imprima quantos deles são negativos */

/*Primeiro, precisamos importar importar a classe Scanner */
import java.util.Scanner;

public class Negativo {
    public static void main(String[] args) {
        /* Após a importação, devemos declarar o scanner */
        Scanner entrada = new Scanner(System.in);
        int valor;// Irá guardar o valor digitado
        int contador;// Ira servir como parametro pra realização da contagem
        int negativo;// irá realizar a contagem dos negativos

        /* A variável negativo terá como valor inicial o 0 */
        negativo = 0;

        /*
         * O contador tem como valor 0 e enquanto ele for menor ou igual a 5, ele irá
         * adicionar + 1 na contagem
         */
        for (contador = 0; contador <= 5; contador = contador + 1) {
            /* Vamos pedir o valor */
            System.out.println("Digite o valor: ");
            /* Vamos ler o valor e guardar na variável valor */
            valor = entrada.nextInt();

            /*
             * Se o valor for menor que 0, a variável negativo irá adicionar +1
             * na contagem
             */
            if (valor < 0) {
                negativo = negativo + 1;
            }
        }
        /* Impressão do resultado. */
        System.out.println("Total de negativos: " + negativo);

    }

}
