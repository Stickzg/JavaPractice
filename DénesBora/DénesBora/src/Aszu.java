public class Aszu extends Bor {

    private int puttonyos;

    public Aszu(int evjarat, int puttonyos) {
        super("Aszu", evjarat);
        this.puttonyos = puttonyos;
    }

    public int getPuttonyos() {
        return puttonyos;
    }

    public void setPuttonyos(int puttonyos) {
        this.puttonyos = puttonyos;
    }

    public Aszu(String fajta, int evjarat, int puttonyos) {
        super(fajta, evjarat);
        this.puttonyos = puttonyos;
    }
}
