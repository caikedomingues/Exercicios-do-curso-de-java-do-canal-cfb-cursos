
/*Essa classe irá herdar os valores/atributos da classe veiculo */
public class Aviao extends Veiculo {
    /* Vamos criar agora uma variável e um construtor */

    private int categoria;

    /*
     * Agora que criamos o construtor da super classe, sempre chamarmos
     * um super, estaremos acionando o construtor da super classe
     */
    public Aviao(String nome, int categoria) {
        /*
         * Nesse caso, como a variável String nome, esta na super classe,
         * vamos chama-la aqui com o super
         */
        super(nome, 10);
        this.categoria = categoria;

    }

    public void info() {
        /*
         * Já que categoria não faz parte da nossa super classe, temos
         * que criar um método separado para ela, porem temos que adicionar
         * esse info dentro do método info da super classe, ou seja, temos
         * que declarar um super dentro do método
         */
        super.info();
        System.out.printf("Categoria: %s%n", this.categoria);
    }

}
