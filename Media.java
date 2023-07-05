
/*
 Criação de um programa que calcula a média de um aluno
 */
/*
 Primeiro devemos importar a classe Scanner
 */
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        /*
         * Primeiro vamos criar as variáveis
         * do tipo int e do tipo String
         */
        int n1, n2, n3, n4, media;
        String nome;
        int status;
        /*
         * Vamos criar o objeto scanner que irá
         * receber informações do teclado
         */
        Scanner entrada = new Scanner(System.in);
        /*
         * Vamos pedir ao usuário a primeira nota
         */
        System.out.println("Digite o nome do aluno: ");
        /*
         * Vamos atribuir a variavel nome o scanner que irá
         * receber o valor digitado pelo usuário
         */
        nome = entrada.nextLine();
        /*
         * Vamos pedir a primeira nota
         */
        System.out.println("Digite a primeira nota: ");
        /*
         * Vamos ler o valor e armazenar na variável n1 que
         * receberá o scanner com o valor digitado.
         */
        n1 = entrada.nextInt();
        /* Vamos pedir a segunda nota */
        System.out.println("Digite a segunda nota: ");
        /*
         * Vamos ler o valor e armazenar na variável n2 que
         * receberá o scanner com o valor digitado.
         */
        n2 = entrada.nextInt();
        /* Vamos pedir a terceira nota */
        System.out.println("Digite a terceira nota: ");
        /*
         * Vamos ler o valor e armazenar na variável n3 que
         * receberá o scanner com o valor digitado.
         */
        n3 = entrada.nextInt();
        /* Vamos pedir a quarta nota */
        System.out.println("Digite a quarta nota: ");
        /*
         * Vamos ler o valor e armazenar na variável n4 que
         * receberá o scanner com o valor digitado.
         */
        n4 = entrada.nextInt();
        /*
         * A variável media irá pegar os valores digitados
         * e depois realizara o calculo da média.
         */
        media = (n1 + n2 + n3 + n4) / 4;

        /* Impressão da resposta com os dados coletados. */
        System.out.println("A média do aluno " + nome + " " + "é: " + media);
        /*
         * Agora vamos criar as condições que definirão
         * se o usuário foi aprovado ou reprovado.
         */
        /*
         * Vamos atribuir valor a variável status, que
         * irá receber o cálculo da média
         */
        status = media;
        /*
         * se o valor do status for maior ou igual a 6,
         * o aluno será aprovado, senão ele será reprovado
         */
        if (status >= 6) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }

    }
}
