
/*Importamos a classe Scanner */
import java.util.Scanner;

/*Craição de um programa que irá perguntar o nome do usuário e
 * apresentar uma mensagem.
 */
public class EntradaString {

    public static void main(String[] args) {
        /*
         * Criamos o obejto Scanner que irá ler as informações passadas
         * pelo teclado
         */
        Scanner entra = new Scanner(System.in);
        /*
         * Criação da variável do tipo String que ira´guardar o dado
         * digitado pelo usuário
         */
        String nome;
        /*
         * Elaboração da mensagem que irá perguntar ao usuário o dado
         * que deve ser digitado
         */
        System.out.println("Olá qual o seu nome? ");
        /*
         * Atribuição de valor da variável nome, que irá receber
         * o scanner com as informações digitadas, nextLine é
         * pra imprimir a String na próxima linha.
         */
        nome = entra.nextLine();
        /*
         * Elaboração da resposta, juntando a mensagem com o valor
         * digitado pelo usuário.
         */
        System.out.println("Seja bem-Cvindo " + nome);

    }

}
