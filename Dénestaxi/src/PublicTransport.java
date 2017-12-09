
public abstract class PublicTransport implements ITravelStrategy {

    protected abstract void traveling();

    @Override
    public void travel(Client c) {
        System.out.println("Felszálltam.");
        System.out.println("Jegyellenőrzés.");

        // methodman
        traveling();

        System.out.println("Leszálltam");
    }
}
