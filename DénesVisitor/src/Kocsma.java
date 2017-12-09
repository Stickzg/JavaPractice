public class Kocsma implements IPlaces {

    @Override
    public void accept(Human human) {
        human.visit(this);
    }

}
