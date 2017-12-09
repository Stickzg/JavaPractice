public class Client {

    private String name;
    private int money;
    private int time;
    private int mentalHealth;
    private ITravelStrategy strategy;


    public Client(String name, int money, int time, int mentalHealth, ITravelStrategy it) {
        this.name = name;
        this.money = money;
        this.time = time;
        this.mentalHealth = mentalHealth;
        this.strategy = it;
    }

    public void travel(){
        this.strategy.travel(this);
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getMentalHealth() {
        return mentalHealth;
    }

    public void setMentalHealth(int mentalHealth) {
        this.mentalHealth = mentalHealth;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", time=" + time +
                ", mentalHealth=" + mentalHealth +
                '}';
    }
}
