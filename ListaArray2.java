
import java.util.ArrayList;

public class ListaArray2 {

    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<>();

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(11);
        numeros.add(22);
        numeros.add(33);

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

        /*
         * Nessa segunda parte, vamos tentar imprimir um elemento
         * especifico do arraylist, em casos assim, temos que utilizar
         * o método get e passar como parametro o indice do elemento
         * buscado
         */

        System.out.println(carros.get(0));

        /* Também podemos utilizar o for tradicional */
        for (int i = 0; i < carros.size(); i++) {

            /*
             * Dessa maneira e com esse for podemos imprimir os valores
             * de um arraylist composto por strings
             */
            System.out.println(carros.get(i));

        }

        /*
         * O método indexOf retornar a primeira posição de um elemento
         * do array
         */

        System.out.println("indexOf: " + carros.indexOf("Hrv"));

        /*
         * Se quisermos remover um elemento, temos que utilizar o método
         * remove, para funcionar temos que informar o elemento ou o
         * indice do elemento
         */

        System.out.println("Valor excluido: " + carros.remove("Camaro"));
        System.out.println("Valor excluido: " + carros.remove(2));

        /*
         * Se for necessário limpar o seu array e excluir todos os elementos
         * temos que utilizar o método clear: nomedoarray.clear();
         */

    }

}
