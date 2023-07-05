
import java.util.Scanner;

public class Estrutura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        int vezes;
        int valor;
        int positivo;
        valor = 0;
        positivo = 0;

        System.out.println("Quantos numeros vamos trabalhar");
        vezes = entrada.nextInt();

        for (i = 0; i < vezes; i++) {
            System.out.println("Informe o valor: ");
            valor = entrada.nextInt();
        }

        for (i = 0; i < vezes; i++) {
            if (valor > 0) {
                positivo++;
            }
        }
        System.out.println("Numeros positivos: " + positivo);
    }

}
