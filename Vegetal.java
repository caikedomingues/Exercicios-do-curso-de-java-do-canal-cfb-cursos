public class Vegetal {
    private Boolean vivo;
    private int massa;

    public Vegetal(int massa) {
        this.vivo = true;
        this.massa = massa;

    }

    public int getMassa() {
        return this.massa;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    public void info() {
        System.out.printf("Tipo: %s%n", getClass().toString());
        System.out.printf("Vivo: %s%n", this.getVivo() ? "sim" : "não");
        System.out.printf("Massa: %s%n", this.massa);

    }

}
