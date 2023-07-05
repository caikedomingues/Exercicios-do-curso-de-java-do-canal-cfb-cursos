public class ComandoImpressao {

    public static void main(String[] args) { /* Método público principal */
        /* O void não tem nehum retorno */
        /*
         * Comandos de impressão
         * print ln: executa quebra de linha
         * print: não executa quebra de linha
         * printf: Permite fazer impressões com configurações de
         * formato
         * Todos eles fazem parte do pacote System.out
         */

        /*
         * Vamos criar uma variável do tipo inteiro e depois iremos
         * imprimir com o método printf
         */
        int num = 100;
        String nome = "Caike";

        /* Agora vamos realizar a soma de 3 variáveis do tipo inteiro */
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int res = n1 + n2 + n3;

        System.out.println("Cfb cursos");
        System.out.print("Curso de java");
        System.out.printf("Canal:%s%nAno:%d", "CFB Cursos", 2021);
        System.out.println(" ");
        System.out.printf("Valor da variável num:%d", num);
        System.out.println(" ");
        System.out.print(nome);
        System.out.println(" ");
        System.out.print("O valor da soma é: " + res);
        /*
         * O sinal de + tem como uma de suas funções concatenar(juntar)
         * respotas.
         */

    }
}