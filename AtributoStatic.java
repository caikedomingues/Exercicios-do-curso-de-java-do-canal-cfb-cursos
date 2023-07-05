public class AtributoStatic {
    public static void main(String[] args) {
        /*
         * Static: significa que um elemento(método) ele tera a mesma opção
         * para todas as classes e objetos
         */
        int num = 0;
        /* Vamos acessar o dado alerta criado na classe Jogador */
        System.out.printf("Alerta: ", Jogador.alerta ? " sim" : "não");
        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);

        /*
         * Agora vamos chamar o método info criado em outra classe aciona-lo
         * nas variáveis dos jogadores
         */

        Jogador.alerta = true;

        /* Agora vou chamar o método pontos para adicionar mais 10 na contagem */
        Jogador.Pontos();
        Jogador.Pontos();
        Jogador.Pontos();
        j1.Info();
        j2.Info();
        j3.Info();
    }

}
