import java.util.ArrayList;

public class TratamentodeErros {

    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<>();

        carros.add("Hrv");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Fusion");

        /*
         * Basicamente, trataremos do erro na hora da busca por um elemento
         * através de um indice que não existe no arraylist
         */

        try {
            /*
             * Como o try executa tudo que está dentro dele, em caso
             * de erros ou resultados indesejados ele realiza uma
             * exception, e como o system é o processo que carrega o
             * resultado final do programa, vamos executa-lo dentro do
             * try, dando a possibilidade de tratarmos o erro.
             */
            System.out.println(carros.get(10));

        }
        /*
         * No catch temos que passar o tipo de exception que vamos
         * tratar, nesse caso para o Exception que deve ser utilizados
         * em "situações genéricas", onde não sabemos quando ou o tipo
         * de exception que ocorrerá
         */
        catch (Exception e) {
            /* Aqui vamos tratar o erro detectado */

            /*
             * É sempre interessante apontar pro usuário o erro ou o
             * tipo do erro que está ocorrendo, para isso utilizamos
             * um dos metodos do exception que é a getMessage, que
             * possibilita informar ao usuário o erro em especifico
             */
            System.out.println("Limite de tamanho ultrapassado: " +
                    e.getMessage());

        }
        /*
         * O finally é o ultimo caso do try, só será executado no
         * final do try, independente se houver erro
         */
        finally {
            System.out.println("Fim do try");

        }

    }

}
