public class Jogador {

    /*
     * Método construtor: serve para executar/manipular instanciações de
     * objetos. O construtor não tem retorno, então não é necessário
     * especificar o tipo de dado ou de valor.
     * Ele precisa ter o mesmo nome da classe.
     */
    private int num = 0;
    private int vidas = 1;
    static boolean alerta = false;
    static int qtdJogadores = 0;
    static int PontosJogadores = 1;/*
                                    * Variável que irá contabilizar os pontos
                                    * globais dos jogadores
                                    */

    public Jogador(int num) {
        this.num = num;
        this.vidas = 1;
        System.out.printf("%nJogador criado%n", num);
        /*
         * Assim que criarmos um novo jogador a variável qtdjogadores,
         * irá adicionar mais um jogador na contagem
         */
        qtdJogadores++;

    }

    /* Vamos criar a classe vida para manipular variáveis com o nome vidas */
    public int getVidas() {
        /* Agora vou pedir como retorno o valor da variável vidas */
        return this.vidas;

    }

    /*
     * O método set não retorna nada então ele é void, para utiliza-lo
     * é necessário atribuir o valor que queremos modificar nos parenteses
     * do método.
     */
    public void setVidas(int vidas) {
        /* Sendo assim, eu atribuo a variável vidas como valor de vidas */
        /*
         * Após atribuir os valores, devemos começar a trabalhar a variável
         * nesse caso, vamos estabelecer um limite de quantidade de vidas com
         * o if
         */
        if (vidas > 3) {
            /*
             * Vamos definir que se essa condição for verdadeira this.vidas
             * irá receber 3 que é o valor máximo de vidas e que irá evitar
             * que a quantidade de vidas ultrapasse o limite
             */
            this.vidas = 3;
        } else if (vidas < 0) {
            /* Mesma lógica do if, porém caso seja menor que 0 */
            this.vidas = 0;
        } else {
            /*
             * Caso nenhuma das condições sejam verdadeiras a lógica seguira
             * a mesma.
             */
            this.vidas = vidas;
        }

        /*
         * Também podemos fazer um método para adicionar valores na variável
         * até o valor limite ser atingido, lembrando que como quero adicionar
         * valores o método tem que ser void, ou seja, não retorna valores
         */
        this.vidas = vidas;
    }

    public void addVidas() {
        if (this.vidas < 3) {
            this.vidas++;
        }

    }

    /*
     * Agora vamos trabalhar a varivael PontosJogadores no em um método
     * para atribuir valores e fazer ele adicionar pontos
     */
    static void Pontos() {
        PontosJogadores = +10;

    }

    /*
     * Agora vamos criar um método void que terá a função de passar umas
     * informações sobre os jogadores.
     */

    public void Info() {
        System.out.println("Jogador: " + this.num);
        System.out.println("Vidas: " + this.vidas);
        System.out.printf("Alerta: ", (alerta ? "sim" : "não"));
        System.out.println("Jogadores: " + qtdJogadores);
        System.out.println("Pontos: " + PontosJogadores);
        System.out.println("-------------------------------------");

    }

}
