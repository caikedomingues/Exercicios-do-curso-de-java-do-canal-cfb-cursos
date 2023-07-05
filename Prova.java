import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nota;
        int i;
        String resp0;
        String resp1;
        String resp2;
        String resp3;
        String resp4;

        nota = 0;

        String[] gabarito = { "a", "c", "b", "a", "c" };
        String[] resposta = { "a", "c", "b", "a", "c" };

        if (resposta[0] == gabarito[0]) {
            nota++;
        }

        if (resposta[1] == gabarito[1]) {
            nota++;
        }

        if (resposta[2] == gabarito[2]) {
            nota++;
        }

        if (resposta[3] == gabarito[3]) {
            nota++;
        }

        if (resposta[4] == gabarito[4]) {
            nota++;
        }

        System.out.println("Qual a maoir estrela do nosso sistema solar? ");
        System.out.println("a)Sol | b) Lua | c) Marte ");
        resposta[0] = entrada.nextLine();

        System.out.println("Qual a primeira letra do nosso alfabeto? ");
        System.out.println("a) Z | b) C | c) A");
        resposta[1] = entrada.nextLine();

        System.out.println("2 x 10 é igual a? ");
        System.out.println("a) 10 | b) 20 | c) 12");
        resposta[2] = entrada.nextLine();

        System.out.println("O fantástico mundo de _______. (desenho anos 80)");
        System.out.println("a) Bob | b) Carl | c) Zec");
        resposta[3] = entrada.nextLine();

        System.out.println("Valor de pi");
        System.out.println("a) 3.10 | b) 3 | c) 3.14");
        resposta[4] = entrada.nextLine();

        System.out.println("A sua nota foi " + nota);

    }

}
