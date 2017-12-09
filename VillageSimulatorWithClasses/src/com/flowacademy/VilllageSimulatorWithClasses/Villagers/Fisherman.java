package com.flowacademy.VilllageSimulatorWithClasses.Villagers;

import java.io.Serializable;
import java.util.Random;

public class Fisherman extends Human implements Gatherer, Serializable {

    private int sizeOfNet;
    private float luck;
    Random random = new Random();

    public Fisherman(String name, int age, int currentEnergy) {
        super(name, age, currentEnergy);
        this.sizeOfNet = random.nextInt();
        this.luck = random.nextFloat();
    }

    public int getSizeOfNet() {
        return sizeOfNet;
    }

    public void setSizeOfNet(int sizeOfNet) {
        this.sizeOfNet = sizeOfNet;
    }

    public double getLuck() {
        return luck;
    }

    public void setLuck(float luck) {
        this.luck = luck;
    }

    @Override
    public int gather() {
        int gatheredFishAmount = (int) (this.luck*this.sizeOfNet*
                ((float) (this.getCurrentEnergy()*.01)));
        Storage.setFish(Storage.getFish()+gatheredFishAmount);
        return gatheredFishAmount;
    }
}
