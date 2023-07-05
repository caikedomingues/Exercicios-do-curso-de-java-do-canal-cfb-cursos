public class ComandoDecisao {
    public static void main(String[] args) {
        /*
         * If(se): Realiza ou executa um bloco de código caso uma
         * determinada condição seja satisfeita, ou seja, trabalha
         * com operadores lógicos ou condicionais.
         * 
         * else(senão):Caso contrário do if, é uma segunda alternativa
         * caso a primeira condição seja falsa
         */

        /*
         * Vamos criar nosso primeiro exemplo, onde testaremos se 0
         * é maior que 10.
         */
        if (0 > 10) {
            System.out.print("Maior");
        } else {
            System.out.println("Não é maior");
        }

        /*
         * Vamos criar o clássico exercicio que mostra se aluno passou
         * ou não.
         */
        int nota = 65;
        int media = 60;

        if (nota >= media) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

    }

}
