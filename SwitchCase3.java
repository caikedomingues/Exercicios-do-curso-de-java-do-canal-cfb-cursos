
/*Importação do scanner */
import java.util.Scanner;

public class SwitchCase3 {
    /* Agora vamos criar um switch que irá analisar mais de um valor */
    public static void main(String[] args) {
        int nota;// irá armazenar a nota do usuário
        /* Declaração do scanner */
        String nome;// Ira guardar o nome do aluno
        Scanner entra = new Scanner(System.in);

        System.out.println("Qual o nome do aluno? ");
        nome = entra.nextLine();
        /* Pedido de valor pro usuário */
        System.out.println("Qual a nota do aluno? ");
        /* Ira guardar o scanner com o valor digitado pelo usuário */
        nota = entra.nextInt();

        switch (nota) {
            case 10:
            case 9:
            case 8:
            case 7:
                System.out.println("o Aluno " + nome + " está aprovado");
                break;

            case 6:
            case 5:
                System.out.println("O aluno " + nome + " está de recuperação");
                break;

            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("O aluno " + nome + " reprovou a matéria");
                break;
            default:
                System.out.println("Nota inválida");
                break;

        }

    }

}
