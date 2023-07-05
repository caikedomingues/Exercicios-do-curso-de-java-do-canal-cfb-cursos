
import java.util.ArrayList;

public class ListaArray3 {
    public static void main(String[] args) {

        /*
         * Vamos supor que tenho um ArrayList de 100 posições, porém só
         * estou ocupando 5 espaços, sendo assim, para evitar que
         * espaços sejam ocupados desnecessariamente, eu devo cortar
         * ou elminar esses espaços. Para isso usamos o método
         * trimToSize(), por ele ser void, não precisamos passar
         * parametros para ele.
         */
        ArrayList<String> nomes = new ArrayList<>(100);

        nomes.add("Caike");
        nomes.add("Milene");
        nomes.add("Tony");
        nomes.add("Nicolas");
        nomes.add("Amanda");

        nomes.trimToSize();

    }
}
