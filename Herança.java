public class Herança {

    /*
     * Pra inicio de conversa iremos criar o objeto carro baseado na classe
     * Carro
     */

    public static void main(String[] args) {
        Carro c1 = new Carro("Golf");
        Carro c2 = new Carro("HRV");
        CarroCombate c3 = new CarroCombate("Leopardo", 100);
        CarroCombate c4 = new CarroCombate("Pantera", 50);
        /*
         * Agora que criei o objeto, vou chamar o método que coleta as
         * informações
         */

        c1.info();
        c2.info();
        c3.info();
        c4.info();

        /* Vamos pegar o c3 e faze-lo atirar 3 vezes */
        c3.Atirar();
        c3.Atirar();
        c3.Atirar();
        /* Agora vamos fazer c4 e c1 sofrer danos */
        c4.sofrerDano(30);
        c1.sofrerDano(5);
        /*
         * Agora vamos chamar o método setLigado para sinalizar que o
         * carro esta ligado.
         */
        c1.setLigado(true);
        /*
         * Para fixarmos melhor o conceito de herança vamos criar um carro
         * de combate que tera as mesmas funções ou atributos da classe
         * carro, porém eu não irei digitar novamente os códigos, eu
         * irei fazer com que a classe CarroCombate herde os valores
         * de Carro
         */

    }

}