package com.flowacademy.company;

public abstract class Colleague implements Companyworker {

    private String position;
    private int netWorth;

    public Colleague(String position, int netWorth) {
        this.position = position;
        this.netWorth = netWorth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(int netWorth) {
        this.netWorth = netWorth;
    }





    public void bonusztKap(int money) {
    }
}
