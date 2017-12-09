public class Car implements Icar {

    public void beindit(Person person) {
        System.out.println("Age of driver: " + person.getAge());
    }

    public void vezet(Person person) {
        System.out.println("Age of the person driving: " + person.getAge());
    }

}
