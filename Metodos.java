
public class Metodos {
    public static void main(String[] args) {
        /* O main é como se fosse o nosso método principal */
        /* Chamada do método */
        Canal();
        /* Também podemos colocar métodos dentro de um for */
        for (int i = 0; i < 6; i++) {
            Canal();
        }
        /* Chamada do método */
        msg("Entrada do método");
        msg("Caike");
        msg("Soulfly");

        /* Chamada do método */
        Num(10);

        /* Chamada do método Soma() */
        System.out.println(Soma(10, 5));

        /* Chamada do método */
        System.out.println(Soma2(10, 20, 30, 40));

    }

    /*
     * métodos do tipo public significa que posso ter acesso a esse
     * método fora da classe. Quando ele é private eu só uso dentro da
     * classe. Como o nosso método main é static, os outros métodos
     * também devem ser static.Dentro dos pareenteses do método,
     * escrevemos argumentos (essa ação é opcional).
     */
    public static void Canal() {
        System.out.println("cfb cursos");
        /*
         * para fazer o método funcionar, devemos ir no método principal
         * e realizar a chamada do método.
         */
    }

    /*
     * Também podemos elaborar entradas para os nossos métodos, para fazer
     * isso, devemos colocar uma variável como argumento, e ao realizar a
     * chamada devemos atribuir um valor nos parenteses, e esse valor será
     * o da variável
     */
    public static void msg(String m) {
        System.out.println(m);
    }

    /*
     * Nesse exemplo vamos receber dados do tipo inteiro e de acordo
     * com o numero digitado na chamada o for irá imprimir a mensagem
     * enquanto i for menor que l (variável que irá receber o valor
     * digitado na chamada)
     */
    public static void Num(int l) {
        for (int i = 0; i < l; i++) {
            System.out.println("Ola " + l);
        }
    }

    /* Agora vamos criar um método para soma */
    public static int Soma(int a, int b) {
        int res = a + b;
        return res;

    }

    /*
     * Agora vamos tentar criar um método que realize a soma de quantos
     * números o usuário quiser. Vale lembrar que o argumento é uma
     * espécie array, sendo assim, podemos utilizar o for especifico
     * para arrays
     */
    public static int Soma2(int... numeros) {
        int res;
        res = 0;
        for (int n : numeros) {
            res += n;
        }
        return res;

    }

    /*
     * Sobrecargas de métodos: quando tenho métodos com o mesmo nome,
     * porém, com funcionalidades e valores diferentes.
     */

}
