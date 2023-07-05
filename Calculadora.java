
/*Antes de iniciarmos, devemos possibilitar que o nosso programa
 * possa ler os valores passados pelo usuário, para isso, temps que importar
 * um scanner
 */

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        /* Agora precisamos declarar o nosso scanner no programa */

        Scanner entrada = new Scanner(System.in);

        /*
         * Agora que ja crimaos o construtor na classe Numero, podemos começar
         * a criar o s valores ou obejtos aqui, todos do tipo Numero
         */
        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();
        String opcao;
        opcao = "s";

        /*
         * Feito o processo, vamos trabalhar o pedido dos valores ao
         * usuário e o scanner. Para atribuir o scanner nas variaveis,
         * devemos chamar o método set valor e informar dentro dos
         * parenteses dele o nosso scanner do tipo inteiro
         */

        /* Vamos colocar essa operação dentro de um loop */

        while (opcao.equals("s") || opcao.equals("S")) {

            System.out.printf("Digite o valor 1: ");
            n1.setValor(entrada.nextInt());

            System.out.printf("Digite o valor 2: ");
            n2.setValor(entrada.nextInt());
            /* Agora vamos realizar o resultado */
            res.setValor(n1.getValor() + n2.getValor());

            /* Impressão da resposta final */
            System.out.printf("A soma dos valores é: " + res.getValor());
            System.out.println("Quer continuar? ");
            opcao = entrada.nextLine();

            /*
             * Não sei pq, mas a opção está com defeito, porém a
             * calculadora está funcionando
             */

        }

    }

}
