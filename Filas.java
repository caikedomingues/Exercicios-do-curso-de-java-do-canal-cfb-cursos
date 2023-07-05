
/*Import que possibilita trabalhar com filas */
import java.util.Queue;
/*Import do LinkedList */
import java.util.LinkedList;

public class Filas {

    public static void main(String[] args) {

        /*
         * Fila: first in, first out, ou seja, o primeiro a entrar é o
         * primeiro a sair
         */
        /* Estanciação da lista com um "metodo" chamado LinkedList */
        Queue<String> carros = new LinkedList<>();

        /* Vamos adicionar itens na lista com o método add */
        carros.add("HRV");
        carros.add("Golf");
        carros.add("Polo");
        carros.add("Camaro");
        carros.add("Tiggo 3x");

        /* Impressão da fila */
        System.out.println(carros);
        /*
         * Método empty que retornara o topo da fila, sem remove-lo da lista
         * 
         */
        System.out.println("Topo da fila: " + carros.peek());

        /*
         * Retorna o topo da fila e remove da lista
         */
        System.out.println("topo da fila removido " + carros.poll());
        /*
         * Vamos usar o método isEmpty que retorna se a pilha esta vazia
         * ou não
         */
        if (carros.isEmpty() == true) {
            System.out.println("A fila esta vázia");
        } else {
            System.out.println("A fila contém elementos");
        }

    }

}
