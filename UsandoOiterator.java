import java.util.ArrayList;

import java.util.Iterator;

public class UsandoOiterator {

    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<String>();

        carros.add("Hrv");
        carros.add("Polo");
        carros.add("Golf");
        carros.add("City");
        carros.add("Cruze");
        carros.add("Polo");
        carros.add("Polo");

        /* Impressão do ArrayList */
        System.out.println(carros);

        /*
         * Vamos instanciar o iterator, ele deve ser do mesmo tipo do
         * ArrayList
         */

        Iterator<String> it = carros.iterator();

        /*
         * Vamos criar a impressão dentro de um loop utilizando o método
         * hasNext que retorna um boolean e verifica se um próximo valor
         * existe.
         */
        while (it.hasNext()) {
            /*
             * Impressão do ArrayList com iterator de método next que ira
             * imprimir o próximo elemento
             */
            System.out.println("Impressão com while: " + it.next());
        }

        /* Remover um elemento, devemos utilzar um remove */

    }

}
