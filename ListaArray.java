
import java.util.ArrayList;

public class ListaArray {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        ArrayList<String> carros = new ArrayList<>();

        /*
         * Agora vamos adicionar valores ao arraylist com o método add,
         * que possui 2 formas de atribuir valor
         */

        numeros.add(11);
        numeros.add(22);
        numeros.add(33);

        /*
         * Agora para percorrer o arraylist, devemos usar o for especifico
         * para arrays, lembrando que, para utiliza-lo, devemos criar dentro
         * do for uma variável que irá receber o array e a variável tem que
         * ser do mesmo tipo do array
         */

        for (int e : numeros) {
            /*
             * Feito isso, basta imprimir a variável do for, e os valores
             * serão apresentados
             */
            System.out.println(e);
        }

        carros.add("Corsa");
        carros.add("Camaro");
        carros.add("Hrv");
        carros.add("Polo");
        carros.add("Cruze");
        /*
         * Vamos supor que necessitamos adicionar um carro em uma posição
         * especifica, no caso na posição 1, para fazer isso, basta
         * indicar a posição que você quer que o dado ocupe
         */
        carros.add(1, "Argo");

        for (String c : carros) {

            System.out.println(c);
        }

    }
}
