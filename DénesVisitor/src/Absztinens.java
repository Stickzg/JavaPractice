public class Absztinens extends Human {

    @Override
    public void visit(Kocsma kocsma) {
        System.out.println("Hell no.");
    }

    @Override
    public void visit(Bordély bordély) {
        System.out.println("Oh, hell no.");
    }

    @Override
    public void visit(Temető temető) {
        System.out.println("wasted");
    }
}
