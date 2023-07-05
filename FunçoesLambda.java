
/*Import que possibilita trabalhar com listas */
import java.util.ArrayList;

import java.util.function.Consumer;

public class FunçoesLambda {

    public static void main(String[] args) {
        /*
         * Lambda: recebe valores de entrada, opera eles e retorna uma
         * saida
         */
        /* Criação do arraylist */
        ArrayList<Integer> valores = new ArrayList<Integer>();
        ArrayList<Integer> dobro = new ArrayList<Integer>();
        ArrayList<Integer> par = new ArrayList<Integer>();
        ArrayList<Integer> impar = new ArrayList<Integer>();

        /* Vamos adicionar valores a variável valores */
        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        valores.add(6);

        /*
         * Eu quero que dobro receba os valores dobrados da variável valores,
         * para isso irei utilizar um labda que ira receber: A varivael que
         * quero percorrer, ou seja, irei criar um lambda dentro de um
         * for each que ira percorrer a variavel valores
         */
        /*
         * Dentro do for each, vamos criar uma variavel v e adicionar
         * no list dobro v * 2 e imprimir no final
         */
        valores.forEach((v) -> {
            dobro.add(v * 2);
            if (v % 2 == 0) {
                par.add(v);
            } else {
                impar.add(v);
            }
        });

        /* Impressão dos arrayslist */
        System.out.println(valores);
        System.out.println(dobro);
        System.out.println(par);
        System.out.println(impar);
    }

}
