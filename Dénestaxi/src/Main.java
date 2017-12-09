public class Main {

    public static void main(String[] args) {
        Client[] kliensek = new Client[3];

        kliensek[0] = new Client("Béla", 30, 0, 10, new Trolley());
        kliensek[0].travel();

    }

}
