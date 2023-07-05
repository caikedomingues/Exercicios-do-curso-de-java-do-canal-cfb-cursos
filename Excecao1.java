
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Excecao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Hashset<String> hash = new Hashset<Sring>();
        ArrayList<String> nomes = new ArrayList<String>();

        try {

            for (int i = 0; i < 10; i++) {

                System.out.println("Informe o " + (i + 1) + "°" + " valor: ");
                nomes.add(entrada.nextLine());

            }
        } catch (Exception e) {

            System.out.println("Valor inválido");
        }
    }
}