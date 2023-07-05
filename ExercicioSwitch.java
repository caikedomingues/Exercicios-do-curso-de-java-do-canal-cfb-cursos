public class ExercicioSwitch {
    public static void main(String[] args) {
        /* Valor da variável */
        int pos = 0;
        /*
         * Meétodo que irá executar bloco de códigos
         * de acordo com o caso. Ele tera como parâmetro
         * a variável pos.
         */
        switch (pos) {
            /* Casos que irão conter e executar o código */
            case 1:
                System.out.println("Primeiro Lugar");
                /* Irá intterromper a execução */
                break;

            case 2:
                System.out.println("Segundo lugar");
                break;

            case 3:
                System.out.println("Terceiro lugar");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("Prêmio de participação");
                break;
            /*
             * Irá executar outro código caso nenhuma das
             * condições se realizem.
             */
            default:
                System.out.println("Não recebe nada");
                break;
        }

    }
}