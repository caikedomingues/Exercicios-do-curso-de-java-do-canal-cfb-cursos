public class AnimalAbstract {

    /* vamos criar uma classe absttrata com implementação em SerVivo */
    abstract class AnimalAbstratact implements SerVivo {

        /*
         * Vamos criar variáveis que irão conter as caracteristicas do ser
         */

        private Boolean vivo = true;
        private int massa;
        private int x; // irá trabalhar a movimentação
        private int y; // Irá trabalhar a movimentação
        private int velocidade;
        private int forca;

        /*
         * Vamos criar um construtor, como estamos implementando SerVivo,
         * devemos implementar os métodos dele
         */

        /* Vamos passar os parametros para o construtor */
        public AnimalAbstratact(int velocidade, int massa, int forca) {
            /* Aqui dentro iremos inicializar variáveis */
            this.vivo = true;
            this.massa = massa;
            this.x = 0;
            this.y = 0;
            this.forca = forca;
            this.velocidade = velocidade;

        }

        /* Vamos criar os métodos set e get das caracteristicas */
        public void setVivo(Boolean vivo) {
            this.vivo = vivo;

        }

        public Boolean getVivo() {
            return this.vivo;
        }

        public void setForca() {
            this.forca = forca;
        }

        public int getForca(int forca) {
            return this.forca;
        }

        public void setMassa() {
            this.massa = massa;
        }

        public int getMassa(int massa) {
            return this.massa;
        }

        /* Métodos que sou obrigado a implementar */
        public void Mover() {

            /*
             * Aqui criarei uma condição que verificara se o animal está vivo,
             * possibilitando sua movimentação, o seja se ele estiver o this.vivo
             * irá somar ou incrementar o this.velocidade.
             */

            if (this.vivo) {
                this.x += this.velocidade;
                this.y += this.velocidade;
            } else {
                System.out.printf("O animal esta morto não pode se mover");
            }

        }

        public void Comer(int massa) {

            /*
             * Caso ele esteja vivo, ele poderá comer, e caso coma ele irá
             * receber a massa
             */

            if (this.vivo) {
                this.forca += massa;
            } else {
                System.out.printf("O animal esta morto não pode comer");
            }

        }

        /* Chamada dos métodos */
        Sapo a1 = new Sapo(10, 10, 10);
        Aranha a2 = new Aranha(5, 5, 5, 3);
        Formiga a3 = new Formiga(3, 3, 3);
        Vegetal v1 = new Vegetal(1);
        Vegetal v2 = new Vegetal(3);
        Vegetal v3 = new Vegetal(6);

        public void info() {
            System.out.printf("Tipo: %s%n", getClass().toString());
            System.out.printf("Vivo: %s%n", this.getVivo() ? "sim" : "não");
            System.out.printf("Massa: %s%n", this.massa);
            System.out.printf("velocidade: ", this.velocidade);
            System.out.printf("Força: %s%n", this.forca);

        }

    }

}
