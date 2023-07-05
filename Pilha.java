
/*Import que nos possibilita trabalhar com pilhas */
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        /*
         * Pilha: first in out last, ou seja, o primeiro a entrar é o
         * ultimo a sair
         */
        /* Estanciação da classe Stack */
        Stack<String> carros = new Stack<>();
        /* Método que irá adicionar valores na pilha */
        carros.push("HRV");
        carros.push("Golf");
        carros.push("Polo");
        carros.push("Camaro");
        carros.push("Tiggo");

        /* Vamos imprimir os valores da pilha usando um for each */
        for (String c : carros) {

            System.out.println(c);
        }

        /*
         * Vamos utilizar o peek que irá retornar o elemento que esta
         * no topo da pilha
         */
        System.out.println("Topo da pilha: " + carros.peek());

        /* O método pop retorna o topo da pilha e retira ele da pilha */
        System.out.println("Metodo pop: " + carros.pop());

        /*
         * Se quisermos limpar a pilha, temos que utilizar o método
         * clear
         */
        // carros.clear();

        /*
         * Também podemos utilizar o empty, que é um método do tipo
         * boolean e retorna se a pilha esta vazia ou não.
         */
        if (carros.empty() == true) {
            System.out.println("A pilha esta vázia ");
        } else {
            System.out.println("A pilha não esta vazia");
        }
    }
}
