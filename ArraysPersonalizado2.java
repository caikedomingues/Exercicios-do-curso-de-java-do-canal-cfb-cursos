public class ArraysPersonalizado2 {

    /* Vamos agora tentar criar um array que preenchera outro array */

    final int numCarros = 5;
    Carro[] carros = new Carro[numCarros];

    /* Dessa vez, vamos inicializar dentro da própria variável */
    String[] modelosCarros = {"HRV", "Camaro", "Bmw", "Corsa", "Voyage"};

    /* Agora temos que jogar o array dentro de um laço */

    for(
    int i = 0;i<carros.length;i++)
    {
        /*
         * Agora vamos instanciar novamente a classe carro junto com
         * o array modelosCarros
         */
        carros[i] = new Carro(modelosCarros[i]);
    }

}
