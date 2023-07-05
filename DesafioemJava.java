import java.util.Scanner;

public class DesafioemJava {
    public static void main(String[] args) {

        Scanner entra = new Scanner(System.in);

        final int numPerguntas = 5;
        int pontoQuestao = 2;

        char[] gabarito = { 'a', 'c', 'b', 'a', 'c' };
        String[] perguntas = {
                "Qual a maoir estrela do nosso sistema solar? ",
                "Qual a primeira letra do nosso alfabeto? ",
                "2 x 10 é igual a? ",
                "O fantástico mundo de _______. (desenho anos 80)",
                "Valor de pi",
        };

        String alternativas[] = {
                "a)Sol | b) Lua | c) Marte ",
                "a) Z | b) C | c) A",
                "a) 10 | b) 20 | c) 12",
                "a) Bob | b) Carl | c) Zec",
                "a) 3.10 | b) 3 | c) 3.14",
        };

        char[] respostas = new char[numPerguntas];
        char resp;
        int nota = 0;
        String aluno;

        System.out.println("Olá, qual o seu nome? ");
        aluno = entra.nextLine();

        for (int i = 0; i < numPerguntas; i++) {
            System.out.printf("Pergunta %d%n", i + 1);
            System.out.printf("%s%n", perguntas[i]);
            System.out.printf("%s%n", alternativas[i]);
            resp = entra.nextLine().charAt(0);
            respostas[i] = resp;
        }

        System.out.printf("%s%n", "Fim da prova, confira o resultado");

        for (int i = 0; i < numPerguntas; i++) {
            if (gabarito[i] == respostas[i]) {
                nota += pontoQuestao;
            }
        }
        System.out.println("A nota do aluno " + aluno + " foi " + nota);

    }
}