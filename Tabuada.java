/*Leia um número e imprima sua tabuada. */

/*Primeiro devemos importar a classe scanner */
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        /* Após a importação devemos declarar o método */
        Scanner entrada = new Scanner(System.in);
        int valor;// Irá guardar o valor digitado
        int contador;// Irá realizar a contagem dos números
        int res;// Irá realizar a multiplicação
        /* Vamos pedir um número */
        System.out.println("Digite um número: ");
        /* Vamos ler o valor e guardar na variável valor */
        valor = entrada.nextInt();
        /*
         * O contador começará com 1 e enquanto ele for menor ou igual a 10, ele irá
         * adicionar +1 na contagem, feito isso o res irá realizar a multiplicação.
         */
        for (contador = 1; contador <= 10; contador = contador + 1) {
            res = valor * contador;
            /* Impressão da tabuada. */
            System.out.println(valor + " " + "x " + contador + " = " + res);
        }

    }

}
