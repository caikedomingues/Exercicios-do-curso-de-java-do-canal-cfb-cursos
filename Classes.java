public class Classes {
    public static void main(String[] args) {
        /*
         * Basicamente as classes são conjntos de métodos e instruções do
         * programa
         */
        /* Vamos criar um objeto da classe Jogador que criamos ao lado */
        /*
         * Esse processo se chama instanciação, ou seja, criamos um novo
         * objeto da classe jogador, o new no código é o responsável pela
         * instanciação, um fator interessante é que podemos instanciar
         * quantos objetos quisermos.
         */
        int num = 0;
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        Jogador j3 = new Jogador();

        /*
         * Instanciação de outra classe, dessa vez uma que contém
         * argumentos, como coloquei argumentos nos parenteses da classe
         * Jogador2, eu devo atribuir valor na variável n.
         */
        Jogador2 n1 = new Jogador2(1);
        Jogador2 n2 = new Jogador2(2);
        Jogador2 n3 = new Jogador2(3);

    }

}
