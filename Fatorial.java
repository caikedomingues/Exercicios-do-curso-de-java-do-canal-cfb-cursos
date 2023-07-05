
/*Leia um número e imprima seu fatorial. */
/*Primeiro temos que importar a classe Scanner */
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        /* Após a importação devemos declarar o scanner */
        Scanner entra = new Scanner(System.in);
        int numero;// Irá guardar o valor digitado
        int contador;// Irá realizar a contagem dos números
        int fatorial;// Irá calcular o fatorial

        /* Vamos pedir um número */
        System.out.println("Digite um número: ");
        /* Vamos ler o valor e guardar na variável numero */
        numero = entra.nextInt();

        /* O contador irá receber o número como valor inicial */
        contador = numero;
        /* O fatorial tera como valor inicial o 1 */
        fatorial = 1;

        /*
         * O contador que tem como valor 0, irá executar o bloco enquanto o valor for
         * maior que 1,
         * obrigando o contador a diminuir a contagem
         */
        for (contador = numero; contador > 1; contador = contador - 1) {
            /* Cálculo do fatorial */
            fatorial = fatorial * contador;

        }
        /* Impressão da resposta */
        System.out.println("O fatorial do numero é " + numero + " é igual a " + fatorial);

    }

}
