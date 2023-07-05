
/*Leia 5 valores e imprima a soma deles. */
/*Primeiro devemos importar a classe Scanner */
import java.util.Scanner;

public class SomaDos5Valores {
    public static void main(String[] args) {
        /* Após a importação, devemos declarar o scanner */
        Scanner entrada = new Scanner(System.in);
        int n1;// Ira guardar o primeiro valor digitado
        int n2;// Irá guardar o segundo valor digitado
        int n3;// Irá guardar o terceiro valor digitado
        int n4;// Irá guardar o quarto valor digitado
        int n5;// Irá guardar o quinto valor digitado
        int soma;// Ira guardar o resultado da soma

        /* Vamos pedir o primeiro valor. */
        System.out.println("Informe o primeiro valor: ");
        /* Vamos ler o valor e guardar na variável n1 */
        n1 = entrada.nextInt();

        /* Vamos pedir o segundo valor. */
        System.out.println("Informe o segundo valor: ");
        /* Vamos ler o valor e guardar na variável n2 */
        n2 = entrada.nextInt();

        /* Vamos pedir o terceiro valor. */
        System.out.println("Informe o terceiro valor: ");
        /* Vamos ler o valor e guardar na variável n3 */
        n3 = entrada.nextInt();

        /* Vamos pedir o quarto valor. */
        System.out.println("Informe o quarto valor: ");
        /* Vamos ler o valor e guardar na variável n4 */
        n4 = entrada.nextInt();

        /* Vamos pedir o quinto valor. */
        System.out.println("Informe o quinto valor: ");
        /* Vamos ler o valor e guardar na variável n5 */
        n5 = entrada.nextInt();

        /* Irá realizar a soma */
        soma = n1 + n2 + n3 + n4 + n5;
        /* Irá imprimir a soma. */
        System.out.println("A soma dos valores digitados é: " + soma);

    }
}
