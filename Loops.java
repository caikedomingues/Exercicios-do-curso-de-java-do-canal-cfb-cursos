/*Loops são utilizados para repetir mais de uma vez a chamada de um
 método ou execução de um bloco de código.
*/

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /* for */
        int cont;
        for (cont = 0; cont < 10; cont++) {
            System.out.println("cfb cursos");
        }

        /* while */
        int condicao;
        condicao = 0;
        while (condicao < 5) {
            System.out.println("Olá mundo");
            condicao++;
        }

        /* Agora tentaremos trabalha com Scanners e while */
        /* Primeiro vamos declarar o scanner */
        Scanner entrada = new Scanner(System.in);
        /* Agora vamos declarar as variáveis e seus valores */
        int max;
        int valor;
        valor = 0;
        /* Vamos pedir ao usuário, o valor */
        System.out.println("Informe um numero: ");
        /* Vamos guardar o valor na variável max */
        max = entrada.nextInt();
        /*
         * Enquanto o valor for menor que o max digitado pelo usuário, ele
         * irá imprimir o valor
         */
        while (valor < max) {
            System.out.println(" Caike");
            valor++;
        }

        /*
         * Do while: primeiro executa e depois verifica a condição. Iniciamos
         * a variável fora do loop e incrmentamos dentro dele.
         */
        Scanner entra = new Scanner(System.in);
        int num;
        System.out.println("Informe valor para testar o do: ");
        num = entra.nextInt();
        do {
            System.out.println("Deu certo");
            num++;
        } while (num < 0);

    }
}