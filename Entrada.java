
/*Para utilizar o Scanner, devemos importar esse
 * método para o nosso programa.
 */

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        /*
         * Criação do objeto Scanner, o System.in é o nosso teclado, até
         * onde entendi, criamos um scanner que acessa o nosso teclado
         */
        Scanner scan = new Scanner(System.in);
        /*
         * Criação das variáveis do tipo String e inteiro
         */
        int n1 = 0, n2 = 0, res = 0;
        String nome;
        System.out.println("Olá qual o seu nome ? ");
        nome = scan.nextLine();
        /* Elaboração da mensagem que irá pedir um numero ao usuário */
        System.out.println(" prazer " + nome + " Digite um numeral: ");
        /*
         * A variável n1 irá receber um scanner que irá ler valores
         * do tipo inteiro
         */
        n1 = scan.nextInt();
        /* Vamos repetir o processo acima, porém com a variável n2 */
        System.out.println("Digite outro númeral: ");
        n2 = scan.nextInt();
        /*
         * Agora vamos realizar a soma de n1 e n2, e depois
         * iremos imprimir o resultado na tela.
         */
        res = n1 + n2;
        System.out.println("O resultado da soma entre " + n1 + " e " + n2 + " é igual a " + res);

    }
}
