
/*Import que possibilita o funcionamento do HashSet */
import java.util.HashSet;

public class ValoresUnicos {
    public static void main(String[] args) {
        /*
         * HashShet: Basicamente trabalha com valores únicos, ou seja,
         * não armazena valores repetidos.
         */

        /*
         * Vamos instanciar o hashShet informando o tipo de valor que
         * vamos armazenar
         */
        HashSet<String> carros = new HashSet<String>();

        /* Adicionando elementos no HashSet */
        carros.add("Hrv");
        carros.add("Polo");
        carros.add("Golf");
        carros.add("City");
        carros.add("Cruze");

        /* Impressão do HashSet */
        System.out.println(carros);

        /* Vamos testar agora com algun valores repetidos */
        carros.add("Hrv");
        carros.add("Polo");
        carros.add("Golf");
        carros.add("City");
        carros.add("Cruze");
        carros.add("Polo");
        carros.add("Polo");
        /*
         * Ele simplesmente não repetiu os valores iguais, imprimiu só uma
         * vez
         */
        System.out.println("Impressão com valores repetidos" + carros);

        /* Podemos conferir se determinado elemento está na lista */
        System.out.println(carros.contains("camaro"));

        /*
         * Também podemos usar o remove para excluir algum elemento e o clear
         * para apagar todos
         */
        /* Vamos usar o método iterador, que possui vários métodos */
        System.out.println("Impressão com iterator: " + carros.iterator().next());

    }
}