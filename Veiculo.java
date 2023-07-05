public class Veiculo {
    /*
     * Como essa será a nossa super classe, vou criar variáveis que
     * também serão utilizadas em outra ou outras classes
     */
    private String nome;
    private int tipo;

    /* Vamos criar um construtor que irá receber as 2 variaveis */

    public Veiculo(String nome, int tipo) {
        /*
         * Aqui no construtor, vamos declarar que nome ira receber o nome
         * do veiculo e tipo irá receber o tipo do veiculo, ou seja, agora,
         * temos um construtor na super classe.
         */

        this.nome = nome;
        this.tipo = tipo;
    }

    public void info() {
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Tipo: %d%n", this.tipo);
    }

}