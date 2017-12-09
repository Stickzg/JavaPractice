public class AgeControllProxy implements Icar {
    Car car;
    private int ageControll;

    public AgeControllProxy(Car car, int ageControll) {
        this.car = car;
        this.ageControll = ageControll;
    }



    @Override
    public void beindit(Person person) {
        car.beindit(person);
    }

    @Override
    public void vezet(Person person) {
        if (person.getAge() > ageControll) {
            car.vezet(person);
        } else {
            System.out.println("You ain't driving the car you lil sh*t!");
        }
    }
}
