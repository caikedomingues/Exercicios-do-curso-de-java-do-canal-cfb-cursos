/*Crie um programa que pergunte 2 valores ao usuário e imprima o maior.Caso sejam iguais, imprimir: IGUAIS. */

/*Primeiro temos que importar a classe Scanner */
import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        /* Após a importação devemos declarar o Scanner. */
        Scanner entrada = new Scanner(System.in);
        int n1;// Irá guardar o primeiro valor digitado
        int n2;// Irá guardar o segundo valor digitado
        /* Vamos pedir o primeiro valor */
        System.out.println("Informe o primeiro valor: ");
        /* Vamos ler o valor e guardar na variável n1 */
        n1 = entrada.nextInt();
        /* Vamos pedir o segundo valor */
        System.out.println("Informe o segundo valor: ");
        /* Vamos ler o valor e guardar na variável n2 */
        n2 = entrada.nextInt();
        /*
         * Agora vamos criar as estruturas condicionais que irão definir os resultados
         */
        /* Se n1 for maior que n2 ele irá imprimir o n1 */
        if (n1 > n2) {
            System.out.println("Maior: " + n1);
        }
        /* Se o n2 for maior que o n1 ele irá imprimir o n2 */
        if (n2 > n1) {
            System.out.println("Maior: " + n2);
        }
        /* Se eles fore iguais, ele irá imprimir a mensagem 'são iguais' */
        if (n1 == n2) {
            System.out.println("São iguais");
        }
    }

}