
/*Essa classe vai ser uma interface */
public interface SerVivo {
    /*
     * Agora vamos criar as especificações que irão ditar a implementação
     * de outras classes. Vale lembrar que interfaces não podem ter
     * variáveis private, apenas public.
     */

    /*
     * Agora vamos criar um método que compõem um ser vivo, vale
     * lembrar que cada ser vivo irá implementar a sua maneira de
     * se movimentar, comer etc.
     */

    public void Mover();

    /* Comer terá um parametro inteiro de massa */
    public void Comer(int massa);

    /* Método para imprimir as informações */
    public void info();

    public boolean vivo = true;

}
