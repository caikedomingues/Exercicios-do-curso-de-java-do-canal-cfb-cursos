/*Crie um programa que receba o número do mês e imprima o nome desse mês. Exemplo: mês  */

/*Primeiro devemos importar o scanner */
import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        /* Após a importação devemos declarar um scanner */
        Scanner entrada = new Scanner(System.in);
        /* Variável que irá guardar o valor digitado pelo usuário */
        int mes;
        /* Vamos pedir ao usuário um valor */
        System.out.println("Digite o número do mês: ");
        /* Vamos ler o valor e guardar na variável mes */
        mes = entrada.nextInt();
        /*
         * Agora vamos criar as estruturas condicionais que nos darão
         * os respectivos resultados
         */
        /* Se o valor digitado for igual a 1 ele imprimira Janeiro */
        if (mes == 1) {
            System.out.println("Janeiro");
        }
        /* Se o valor digitado for igual a 2 ele imprimira Fevereiro */
        if (mes == 2) {
            System.out.println("Fevereiro");
        }
        /* Se o valor digitado for igual a 3 ele imprimira março */
        if (mes == 3) {
            System.out.println("Março");
        }
        /* Se o valor digitado for igual a 4 ele imprimira Abril */
        if (mes == 4) {
            System.out.println("Abril");
        }
        /* Se o valor digitado for igual a 5 ele imprimira Maio */
        if (mes == 5) {
            System.out.println("Maio");
        }
        /* Se o valor digitado for igual a 6 ele imprimira Junho */
        if (mes == 6) {
            System.out.println("Junho");
        }
        /* Se o valor digitado for igual a 7 ele imprimira Julho */
        if (mes == 7) {
            System.out.println("Julho");
        }
        /* Se o valor digitado for igual a 8 ele imprimira Agosto */
        if (mes == 8) {
            System.out.println("Agosto");
        }
        /* Se o valor digitado for igual a 9 ele imprimira Setembro */
        if (mes == 9) {
            System.out.println("Setembro");
        }
        /* Se o valor digitado for igual a 10 ele imprimira Outubro */
        if (mes == 10) {
            System.out.println("Outubro");
        }
        /* Se o valor digitado for igual a 11 ele imprimira Novembro */
        if (mes == 11) {
            System.out.println("Novembro");
        }
        /* Se o valor digitado for igual a 12 ele imprimira Dezembro */
        if (mes == 12) {
            System.out.println("Dezembro");
        }
        /* Se o valor digitado for maior que 12, será mes inválido */
        if (mes > 12) {
            System.out.println("Mês Inválido");
        }

    }

}
