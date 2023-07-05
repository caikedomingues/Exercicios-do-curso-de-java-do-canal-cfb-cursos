public class ManipularArray2 {
    /* Agora utilizaremos o for para imprimir o array em ordem decrescente */
    public static void main(String[] args) {

        int[] valores = new int[5];

        valores[0] = 10;
        valores[1] = 5;
        valores[2] = 3;
        valores[3] = 7;
        valores[4] = 9;

        for (int i = 5; i > valores.length; i--) {

            System.out.println(valores[i]);

        }
    }

}
