public class GetEset {
    public static void main(String[] args) {

        /* Get: serve para pegar valores de outras classes */

        /* Set: serve para atribuir valores as variáveis private. */

        /* Variável que será parametro para contagem */
        int num = 0;

        /* Classe criada em outro arquivo */
        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);
        /*
         * Agora que ja criamos um método em outra classe para manipular a
         * a variável vidas, vamos imprimir com nome do jogador.o nome do
         * método
         */
        System.out.println("Vidas do jogador 1: " + j1.getVidas());
        System.out.println("Vidas do jogador 2: " + j2.getVidas());
        System.out.println("Vidas do jogador 3: " + j3.getVidas());

        /* Agora vamos chamar o método addVidas que esta em outra classe */
        j1.addVidas();
        j2.addVidas();
        j3.addVidas();
        System.out.println("Vida do jogador 1: " + j1.getVidas());
        System.out.println("Vidas do jogador 2: " + j2.getVidas());
        System.out.println("Vidas do jogador 3: " + j3.getVidas());

    }

}
