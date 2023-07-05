public class BreakContinue2 {
    public static void main(String[] args) {

        /*
         * Agora vamos utilizar o continue que basicamente, ele pula um passo
         * da execução para o próximo.
         */

        int cont = 50;
        int a;
        for (a = 0; a < cont; a++) {
            /*
             * Basicamente estamos verificando se o valor de a é igual a 10
             * caso essa condição seja verdadeira, ele ira pular o 10 e
             * continuar a contagem
             */
            if (a == 10) {

                continue;
            }

            System.out.println("-" + a);
        }
    }

}
