public class MétodosStrings2 {

    public static void main(String[] args) {

        String s1 = "CFB Cursos - Curso de Java - ";
        String s2 = " youtube.com/cfbcursos";
        String s3 = s1.concat(s2);
        String s4 = "OLÁ MUNDO!";
        String s5 = "olá mundo!";
        String s6 = "           Curso de informática";
        System.out.println(s3);

        /* Replace: vai substituir determinado caractere de uma string */
        System.out.println("Substituição de C por A: " + s1.replace("C", "A"));

        /* toLowerCase: Converte strings para minusculo */
        System.out.println("Minusculo: " + s4.toLowerCase());

        /* toUpperCase: Converte strings para maiusculo */
        System.out.println("Maiusculo: " + s5.toUpperCase());

        /*
         * trim: Irá remover os espaços que estão no inicio ou no final
         * da string.
         */
        System.out.println("Espaços removidos: " + s6.trim());
        /* toCharArray: Irá converter a string em um array de caracteres */
        char[] c = s3.toCharArray();
        System.out.println("String convertida pra array: " + c[0]);

        /*
         * split: Vai separar a string e retornar em um array com os
         * caracteres separados, basta eu indicar o elemento que deve
         * ser separado
         */

        String[] s7 = s3.split(" - ");
        for (String s : s7) {
            System.out.println("Split: " + s);
        }

    }

}
