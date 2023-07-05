/*Crie um programa que receba os 3 lados de triângulo e imprima se ele é equilátero (3 lados iguais) ou não. */

/*Primeiro precisamos importar o pacote scanner */
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        /* Após a importação, devemos declarar o scanner */
        Scanner entrada = new Scanner(System.in);
        int lado1;// Ira guardar o primeiro valor digitado
        int lado2;// Ira guardar o Segundo valor digitado
        int lado3;// Ira guardar o terceiro valor digitado
        /* Vamos pedir o primeiro valor */
        System.out.println("Informe o primeiro lado do triângulo: ");
        /* Vamos ler o valor e guardar na variável lado1 */
        lado1 = entrada.nextInt();
        /* Vamos pedir o segundo valor */
        System.out.println("Informe o segundo lado do triângulo: ");
        /* Vamos ler o valor e guardar na variável lado2 */
        lado2 = entrada.nextInt();
        /* Vamos pedir o terceiro valor */
        System.out.println("Informe o terceiro lado do triângulo");
        /* Vamos ler o valor e guardar na variável lado3 */
        lado3 = entrada.nextInt();
        /*
         * Se lado 1 for igual ao lado 2 e ao lado 3, temos um triângulo equilatero,
         * caso contrário, não o temos o triâgulo equilatero.
         */
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("É um triângulo equilatero");
        } else {
            System.out.println("Não é um triângulo equilatero");
        }

    }

}
