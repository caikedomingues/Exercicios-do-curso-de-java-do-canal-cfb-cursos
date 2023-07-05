
/*Vamos importar o HashMap */
import java.util.HashMap;

public class ChaveValor {
    public static void main(String[] args) {

        /*
         * HashMap: são do tipo chave valor, trabalha com asociações, onde
         * um valor está associado a uma chave ou uma chave está associada
         * a um valor.
         */
        /*
         * Vamos criar o nosso hashmap com uma chave do tipo inteiro e
         * valores do tipo String. Sempre que formos criar um hashmap,
         * devemos primeiro escolher o tipo da chave e depois dos valores
         */
        HashMap<Integer, String> carros = new HashMap<Integer, String>();

        /*
         * Para adicionar elementos no HashMap, devemos utilzar a função
         * put, passando dois valores, o numero da chave e o valor da
         * chave.
         */
        carros.put(1, "polo");
        carros.put(2, "HRV");
        carros.put(3, "Golf");
        carros.put(4, "Camaro");
        carros.put(5, "Mustang");
        carros.put(6, "Cruze");

        /* Impressão do HashMap inteiro */
        System.out.println(carros);
        /*
         * Impressão de um elemento especifico do HashMap com o get, para
         * funcionar basta informar o valor da chave que você quer acessar
         * 
         */
        System.out.println(carros.get(1));

        /*
         * Como a nossa chave é do tipo inteiro, podemos percorrer os
         * elementos em um for
         */

        for (int i = 1; i < carros.size() + 1; i++) {

            System.out.println("Impressão com for: " + carros.get(i));

        }
        /* Caso queira remover um item, chamamos o método remove */
        carros.remove(5);

        /* carros.clear(): Limpa todos os elemntos do hashmap */
        /*
         * Impressão com for each e o metodo values que retorna uma
         * coleção de Strings
         */
        for (String c : carros.values()) {

            System.out.println("Impressão com for each e values: " + c);

        }

    }

}
