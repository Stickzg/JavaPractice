package com.flowacademy.VilllageSimulatorWithClasses.Villagers;

import com.flowacademy.VilllageSimulatorWithClasses.Exception.IsFullException;

import java.io.Serializable;
import java.util.Random;

public class Human implements Serializable {

    private String name;
    private int age;
    private int currentEnergy;
    private Random random = new Random();

    public Human(String name, int age, int currentEnergy) {
        this.name = name;
        this.age = age;
        this.currentEnergy = currentEnergy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCurrentEnergy() {
        return this.currentEnergy;
    }

    public void setCurrentEnergy(int i) {
        this.currentEnergy = i;
    }



    public void eszik(WhatToEat whatToEat) throws IsFullException {
        int tempRoll = random.nextInt(10);
        if (whatToEat.equals("FISH")) {
            Storage.setFish(Storage.getFish()-tempRoll);
            this.currentEnergy+=tempRoll;
        } else {
            Storage.setMeat(Storage.getMeat() - tempRoll);
            this.currentEnergy+=tempRoll;
        }

        // check fullness after feeding
        if (this.getCurrentEnergy() > 100 ) {
            this.setCurrentEnergy(100);
            throw new IsFullException(this.name + " is full and can't eat no more.");
        }

    }

}
