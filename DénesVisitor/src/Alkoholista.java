public class Alkoholista extends Human {

    @Override
    public void visit(Kocsma kocsma) {
        System.out.println("Tömbházmester");
    }

    @Override
    public void visit(Bordély bordély) {
        System.out.println("Should've started here.");
    }

    @Override
    public void visit(Temető temető) {
        System.out.println("How did i get here from the pub?");
    }
}
