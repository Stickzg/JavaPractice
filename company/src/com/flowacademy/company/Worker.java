package com.flowacademy.company;

public class Worker extends Colleague {
    private int penz;
    public Worker(int netWorth) {
        super("Worker", netWorth);
    }


    public void bonusztKap(int penz) {
        this.penz+=penz;
    }
}
