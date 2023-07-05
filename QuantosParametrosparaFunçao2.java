public class QuantosParametrosparaFunçao2 {

    /*
     * Agora vamos criar uma variavel que receba uma quantidade
     * infinida de valores, porém sem utilizar arrays
     */
    public static void main(String[] args) {
        int res;

        res = Soma(10, 10, 10, 10, 10);

        System.out.println("Resultado da soma: " + res);
    }

    public static int Soma(int... n) {

        int res = 0;

        for (int v : n) {
            res += v;
        }
        return res;
    }
}
