
import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        /* Nessa sequência, vamos trabalhar com mais variáveis */
        /*
         * A ideia é criar uma calculadora com switchcase que realiza uma
         * operação de acordo com o sinal que esta na variável operação
         */

        Scanner entra = new Scanner(System.in);
        /* Criação das variáveis */
        int n1;// Ira guardar o primeiro valor
        int n2;// irá guardar o segundo valor
        int soma;// Ira guardar o valor da soma
        int subtracao;// Ira guardar o valor da subtracao
        int mult;// Irá guardar o valor da subtração
        int divisao;// Ira guardar o valor da divisão
        /* Ira pedir os valores ao usuário */
        System.out.println("Insira o primeiro valor: ");
        n1 = entra.nextInt();

        System.out.println("Insira o segundo valor");
        n2 = entra.nextInt();
        /* Irá realizar as operações */
        soma = n1 + n2;
        subtracao = n1 - n2;
        mult = n1 * n2;
        divisao = n1 / n2;
        /*
         * Agora vamos criar o switch que irá analisar a variável operação
         * e colocar como valor as operações matematicas
         */

        /*
         * Tabela de operações
         * +: ira realizar a soma.
         * -: ira realizar a subtração
         * : ira realizar a multiplicação
         * /: ira realizar a divisão
         */

        String operacao = "/";// ira guardar o sinal que será analisado pelo switch

        switch (operacao) {
            case "+":
                System.out.println("O resultado da soma entre " + n1 + " e " + n2 + " é igual a " + soma);
                break;

            case "-":
                System.out.println("O resultado da subtração entre " + n1 + " e " + n2 + " é igual a " + subtracao);
                break;
            case "*":
                System.out.println("O resultado da multiplicação entre " + n1 + " e " + n2 + " é igual a " + mult);
                break;

            case "/":
                System.out.println("O resultado da divisão entre " + n1 + " e " + n2 + " é igual " + divisao);
                break;

            default:
                System.out.println("Operação inválida");
                break;

        }

    }
}