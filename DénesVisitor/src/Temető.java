public class Temető implements IPlaces {

    @Override
    public void accept(Human human) {
        human.visit(this);
    }
}
