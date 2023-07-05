public class TrabalhandoComString {
    public static void main(String[] args) {

        /*
         * String: são cadeias de char, ou seja, conjunto de caracteres
         * que são dados do tipo texto
         */
        /*
         * Vamos ver algumas formas de trabalhar com Strings, através
         * da instanciação
         */

        char[] letras = { 'c', 'u', 'r', 's', 'o', ' ', 'd', 'e', ' ', 'j', 'a', 'v', 'a' };
        char[] letras2 = new char[10];
        String texto = "Cfb cursos";

        String s1 = new String();
        String s2 = new String(texto);
        /*
         * Temos a possiblidade de colocar um array do tipo char
         * dentro de uma string, já que Strings são arrays de
         * dados do tipo char
         */
        String s3 = new String(letras);
        /*
         * Ainda trabalhando com o array do tipo char dentro de uma string
         * indicando as posições que eu quero acessar, ou seja, não sou
         * obrigado a percorrer o array inteiro, basta eu informar o
         * nome do array, o valor inicial e o valor final que quero acessar
         */

        String s4 = new String(letras, 0, 5);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(letras);
        System.out.println(s4);

        /* Por ser uma classe, ela possui métodos */

        /* Length: irá retornar o tamanho da String */

        /*
         * charAt: Retornar caractere de uma deterinada posição, basta
         * eu passar a posição que quero acessar como parametro e ele retorna
         * o caractere da posição
         */

        /*
         * getChars: irá copiar caracteres de uma String para outra String, basta passar
         * o
         * posição inicial da origem, a posição final e qual que é o array ou
         * string que vai receber o conteudo e a posição inicial.
         */

        System.out.println("Tamanho da string: " + texto.length());

        System.out.println("Posição do caractere: " + texto.charAt(1));

    }

}
