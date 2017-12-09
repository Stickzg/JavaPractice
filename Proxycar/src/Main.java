public class Main {

    public static void main(String[] args) {


        Person Bob = new Person(14, "US");
        Icar audiA4 = new AgeControllProxy(new Car(), 18);
        audiA4.beindit(Bob);
        audiA4.vezet(Bob);
    }
}
