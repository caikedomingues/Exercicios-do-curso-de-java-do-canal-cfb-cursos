
/*Aqui criamos uma classe que irá implementar a classe ser vivo, sendo assim,
 * a classe é obrigada a implementar os métodos da classe SerVivo
 */
public class Animal implements SerVivo {
    /* Depois de implementar os métodos criaremos o construtor */

    /* Construtor */
    public Animal() {

    }

    /* Métodos obrigatórios */
    public void Mover() {
    }

    public void Comer(int massa) {
    }

    public void info() {

        System.out.printf("Vivo: %s%n", this.vivo ? "sim" : "não");
    }

}
