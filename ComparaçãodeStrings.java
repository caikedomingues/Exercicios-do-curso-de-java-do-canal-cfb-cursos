public class ComparaçãodeStrings {

    public static void main(String[] args) {

        String s1 = new String("Caike");
        String s2 = "Caike";
        String s3 = "Curso de java";
        String s4 = "cfb cursos";
        String s5 = "cfb cursos";
        String s6 = "Caike";
        String s7 = "caike";
        String s8 = "cfb curos de java";

        /*
         * Vamos ver a diferença entre o método equals e o operador de
         * comparação ==
         */

        /*
         * Nesse caso retorno será diferente, já que apesar do conteudo
         * ser o mesmo, são objetos diferentes, um é instanciado e o
         * outro não.
         */
        if (s1 == s2) {

            System.out.println("s1 é igual a s2");

        } else {
            System.out.println("s1 diferente de s2");
        }

        /*
         * Agora vamos usar o equals que tem como função analisar o
         * objeto como um todo
         */

        if (s1.equals(s2)) {

            System.out.println("s1 é igual a s2 (utilizando equals)");
        } else {
            System.out.println("s1 é diferente de s2 (utilizando o equals)");
        }
        /*
         * Resumindo, sempre que formos comparar strings, devemos utilizar
         * o equals, que analisa todo o conteúdo.
         */

        /*
         * equalsIgnoreCase: tem a finalidade de ignorar caracteres
         * maiusculos e minusculos, ou seja, só analisa a palavra ou
         * a frase da string
         */

        if (s6.equalsIgnoreCase(s7)) {
            System.out.println("s6 é igual a s7");
        } else {
            System.out.println("s6 é diferente de s7");
        }

        /*
         * compareTo: vai fazer a comparação de 2 strings, se elas forem
         * iguais ele irá retornar 0, se a primeira for menor ele retornara
         * um numero negativo, já se a primeira for maior ele retornara um
         * número positivo.
         */

        System.out.println("Comparação com compareTo: " + s1.compareTo(s6));

        System.out.println("Comparação com compareTo: " + s1.compareTo(s3));
        /* Vamos inverter a ordem */
        System.out.println("Comparação com compareTo: " + s3.compareTo(s1));

        /*
         * regionMatches: Irá comparar partes de uma string, sendo assim
         * eu posso informar só parte de uma string que eu tenho interesse
         * de comparar.
         */

        if (s4.regionMatches(true, 0, s5, 0, 3)) {
            System.out.println("s4 é igual a s5");

        } else {

            System.out.println("s4 é diferente de s5");
        }

    }

}
