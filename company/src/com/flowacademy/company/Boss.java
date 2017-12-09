package com.flowacademy.company;

public class Boss extends Colleague {
    private int money;
    private Manager[] beosztottak = new Manager[10];

    public Boss(int netWorth) {
        super("Boss", netWorth);
    }

    private double greedy = beosztottak.length*.5;

    @Override
    public void bonusztKap(int money) {
        for (Manager manager: beosztottak) {
            manager.bonusztKap((int) (money/greedy));
            this.money+=(money-(int) (money/greedy));
        }
    }
}
