public class ComparaçãodeStrings2 {

    public static void main(String[] args) {

        String s1 = "CFB cursos - Curso de Java ";
        String s2 = " youtube.com / cfbcursos";

        /*
         * Startswith e endswith: Verificam se as strings terminam ou
         * iniciam com determinado caractere, são métodos booleanos
         */

        if (s1.startsWith("C")) {
            System.out.println("Começa com C");
        } else {

            System.out.println("Não começa com C");
        }
        /* O oposto */
        if (s1.startsWith("D")) {
            System.out.println("Começa com C");
        } else {

            System.out.println("Não começa com C");
        }

        /* Vamos testar o final da string */
        if (s1.endsWith("a")) {
            System.out.println("Termina com A");
        } else {

            System.out.println("Não termina com A");
        }

        /* O oposto */
        if (s1.endsWith("b")) {
            System.out.println("Termina com A");
        } else {

            System.out.println("Não termina com A");
        }
        /*
         * Observação: Para esses 2 métodos funcionarem eles devem receber
         * o parametro de maneira correta, sendo assim, devemos nos atentar
         * se o parametro é maiusculo ou minusculo, já que esses métodos
         * detectam diferença entre eles.
         */

        /*
         * indexOf: Vai localizar um caractere e retornar a primeira
         * posição ou posição do caractere
         */

        System.out.println("Posição do caractere: " + s1.indexOf("r"));

        /*
         * Caso o caractere ocupe mais de uma posição, temos que indicar pro
         * método qual o indice queremos acessar
         */
        System.out.println("Segunda posição do caractere: " + s1.indexOf("C", 1));

        /*
         * subString: irá retornar parte de uma string, basta informamos
         * o indice inicial e o final que queremos acessar. Se quiser
         * você pode informar só o parametro inicial ou só o parametro
         * final.
         */
        System.out.println("Parte de uma String: " + s1.substring(2, 13));

        /* concat: irá concatenar ou juntar 2 strings */
        System.out.println(s1.concat(s2));
    }

}
