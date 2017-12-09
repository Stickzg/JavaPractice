public class Szexmániás extends Human {


    @Override
    public void visit(Kocsma kocsma) {
        System.out.println("Jägerbombs!");
    }

    @Override
    public void visit(Bordély bordély) {
        System.out.println("Fick jaa");
    }

    @Override
    public void visit(Temető temető) {
        System.out.println("They can't say no.");
    }
}
