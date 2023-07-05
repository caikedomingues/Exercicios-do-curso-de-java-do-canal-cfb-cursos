/*Programa que pede 3 números ao usuário e realiza a soma */

/*Para realização da leitura dos valores passados pelo usuário,
 devemos importar o pacote Scanner.
 */
import java.util.Scanner;

public class SomaDosValores {
    public static void main(String[] args) {
        /* Criação das variáveis */
        int n1;// Irá guardar o primeiro valor digitado
        int n2;// Irá guardar o segundo valor digitado
        int n3;// Irá guardar o terceiro valor digitado
        int soma;// Irá guardar o rsultado da soma
        /* Declaração do Scanner que irá ler as informações passadas pelo usuário */
        Scanner entrada = new Scanner(System.in);
        /* Vamos pedir o primeiro valor */
        System.out.println("Informe o primeiro valor: ");
        /* Vamos ler o valor e guardar na variável n1 */
        n1 = entrada.nextInt();
        /* Vamos pedir o segundo valor */
        System.out.println("Informe o segundo número: ");
        /* Vamos ler e guardar o valor na variável n2 */
        n2 = entrada.nextInt();
        /* Vamos pedir o terceiro valor */
        System.out.println("Informe o terceiro número: ");
        /* Vamos ler o valor e guardar na variável n3 */
        n3 = entrada.nextInt();
        /* Variável que irá realizar a soma. */
        soma = n1 + n2 + n3;
        /* Impressão do resultado */
        System.out.println("Total: " + soma);
    }
}
