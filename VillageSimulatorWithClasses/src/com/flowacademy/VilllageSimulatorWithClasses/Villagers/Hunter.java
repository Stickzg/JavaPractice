package com.flowacademy.VilllageSimulatorWithClasses.Villagers;

import java.io.Serializable;
import java.util.Random;

public class Hunter extends Human implements Gatherer, Serializable {

    private Random random = new Random();
    private float luck;

    public Hunter(String name, int age, int currentEnergy) {
        super(name, age, currentEnergy);
        luck = random.nextFloat();
    }

    @Override
    public int gather() {
        int sizeOftheBeast = random.nextInt(20);
        int gatheredMeat = Math.round(sizeOftheBeast*this.luck*
                ((float) (this.getCurrentEnergy()*.01)));
        Storage.setMeat( Storage.getMeat()+gatheredMeat );
        return gatheredMeat;
    }

    public double getLuck() {
        return luck;
    }

    public void setLuck(float luck) {
        this.luck = luck;
    }



}
