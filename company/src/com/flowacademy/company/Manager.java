package com.flowacademy.company;

public class Manager extends Colleague {

    private int money;

    Worker[] dolgozok = new Worker[20];

    public Manager( int netWorth) {
        super("Manager", netWorth);
    }

    private double greedy= dolgozok.length/.5;

    public void bonusztKap(int money) {
       for(Worker worker: dolgozok) {
           worker.bonusztKap((int)(money/greedy));
           this.money+=money-(int)(money/greedy);
       }
    }
}
