public class Main {

    public static void main(String[] args) {

        Human[] emberek = new Human[3];
        emberek[0] = new Absztinens();
        emberek[1] = new Alkoholista();
        emberek[2] = new Szexmániás();

        Kocsma kocsma = new Kocsma();

        for (Human human: emberek) {
            kocsma.accept(human);
        }
    }

}
