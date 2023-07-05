public class ArrayPersonalizado {

    public static void main(String[] args) {

        /*
         * Pra iniciar vamos definir a classe carro como um array, também
         * vamos criar uma constante que contera o tamanho do array
         */

        final int numCarros = 5;
        Carro[] carros = new Carro[numCarros];
        /*
         * Vale lembrar que como o nosso array é uma classe, devemos
         * instanciar na hora de passar valores ao array.
         */
        carros[0] = new Carro("HRV");
        carros[1] = new Carro("Camaro");
        carros[2] = new Carro("Bmw");
        carros[3] = new Carro("Corsa");
        carros[4] = new Carro("Voyage");

        /* Agora vamo colocar o nosso array em um laço */

        for (int i = 0; i < carros.length; i++) {
            /*
             * Como na classe Carros temos o método info, que
             * contém as informações dos carros, devemos chama-la
             * junto com o array
             */
            carros[i].info();
        }

    }
}
