
/*Agora para informar que eu quero realizar a herança usarei um extends
 * na declaração da classe
 */
public class CarroCombate extends Carro {
    /*
     * Lembre-se que para funcionar é necessário a criação de um construtor
     * mas antes, vamos realizar umas alterações na variável armamento
     * (presente na classe Carro)
     */

    private final int MAX_ARMAMENTO = 100;// final significa constante
    private final int MIN_ARMAMENTO = 0;
    private int qtdArmamento;

    /*
     * Agora vamos criar um construtor que irá trabalhar as variáveis da
     * outra classe
     */
    public CarroCombate(String nome, int blindagem) {
        /*
         * Para funcionar precisamos criar o super que ira chamar a
         * classe pai ou classe base, e o super deve receber o parametro
         * (string nesse caso em especifico)
         */
        super(nome);
        /*
         * Agora vamos habilitar o armamento, e como essa variável é do
         * tipo boolean, vamos passar como parametro o valor verdadeiro,
         * lembrando que o set serve para pegar os valores private
         */
        super.setArmamento(true);
        /* Agora vamos habilitar a blindagem */
        super.setBlindagem(blindagem);
        this.qtdArmamento = 100;
    }

    /* Agora irei criar os métodos especificos dessa classe */
    public void setQtdArmamento(int qtdArmamento) {
        this.qtdArmamento += qtdArmamento;
        /*
         * Agora temos que verificar se a quantidade de armamento
         * ultrapassa o limite, caso isso ocorra a variável continuara
         * recebendo apenas o valor máximo que foi atribuido a ela
         */
        if (this.qtdArmamento > MAX_ARMAMENTO) {
            this.qtdArmamento = MAX_ARMAMENTO;
        }

        /*
         * Caso a quantidade de armamento seja menor que o minimo,
         * a lógica continuara a mesma
         */
        if (this.qtdArmamento < 0) {
            this.qtdArmamento = MIN_ARMAMENTO;
        }

    }

    public int getqtdArmamento() {
        return this.qtdArmamento;
    }

    /* Agora vamos criar um método que será responsável por atirar */
    public void Atirar() {
        /*
         * Se o valor da quantidade de armamento for maior que a
         * quantidade minima ele poderá atirar
         */
        if (this.qtdArmamento > MIN_ARMAMENTO) {
            /* ao atirar o valor da quantidade de armamento irá diminuir */
            setQtdArmamento(-1);
        } else {
            System.out.println("Sem munição");
        }

    }

    public void info() {
        /*
         * Aqui eu vou chamar o método info da classe Carro e irei apenas
         * adicionar um valor/informação adicional
         */
        super.info();
        System.out.printf("Quantidade de armamento: %s%n", this.qtdArmamento);
    }

}
