
/*Vá lendo valores inteiros até que o número 0 seja digitado. */

/*Primeiro devemos importar a classe Scanner */
import java.util.Scanner;

public class LeiaAte0 {
    public static void main(String[] args) {
        /* Após a importação devemos declarar o scanner. */
        Scanner entra = new Scanner(System.in);

        /* Variável que irá guardar o valor digitado */
        int valor;

        /* Tera como valor inicial o 1 */
        valor = 1;

        /* enquanto valor for diferente de zero ele executará o bloco de código */
        while (valor != 0) {
            /* Vamos pedir o valor ao usuário */
            System.out.println("Informe um valor: ");
            /* vamos ler o valor e guardar na variável valor */
            valor = entra.nextInt();

            /* Se o valor for igual a 0, ele imprimira a mensagem */
            if (valor == 0) {
                System.out.println("Programa encerrado");
            }
        }

    }
}
