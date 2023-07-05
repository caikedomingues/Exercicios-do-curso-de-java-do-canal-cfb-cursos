
/*Crie um programa que pergunte a idade de uma pessoa. A partir da idade informada imprima se ele não pode votar (idade inferior a 16), se o voto é facultativo 
(idade igual a 16, 17 ou maior do que 70), ou ainda se o voto é obrigatório para idades de 18 a 70. */
/*Primeiro devemos importar a classe Scanner */
import java.util.Scanner;

public class Eleitor {

    public static void main(String[] args) {
        /* Após a importação, devemos declarar o scanner */
        Scanner entrada = new Scanner(System.in);
        int idade;// Ira guardar a idade digitada
        String nome;// Irá guardar o nome digitado
        /* Vamos pedir o nome do usuário */
        System.out.println("Qual o seu nome: ");
        /* Vamos ler o valor e guardar na variável nome. */
        nome = entrada.nextLine();
        /* Vamos pedir a idade do usuário */
        System.out.println("Prazer " + nome + " por favor, Informe a sua idade: ");
        /* Vamos ler o valor e guardar na variável idade */
        idade = entrada.nextInt();
        /* Estruturas condicionais que irão elaborar a resposta */
        /* Se a idade for menor que 16, ele/ela não pode votar */
        if (idade < 16) {
            System.out.println("Não pode votar");

        }
        /* Se a idade for maior ou igual a 16 e menor que 17, o voto será facultativo */
        if (idade >= 16 && idade < 18) {
            System.out.println("Voto facultativo");
        }
        /*
         * Se a idade for maior ou igual a 18 e maior igual a 70, o voto é obrigatório
         */
        if (idade >= 18 && idade <= 70) {
            System.out.println("Voto Obrigatório");
        }
        /* Se a idade for maior que 70, o voto será facultativo. */
        if (idade > 70) {
            System.out.println("Voto facultativo");
        }
    }

}
