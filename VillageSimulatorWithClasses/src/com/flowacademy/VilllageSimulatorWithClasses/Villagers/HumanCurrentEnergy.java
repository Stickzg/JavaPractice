package com.flowacademy.VilllageSimulatorWithClasses.Villagers;

public class HumanCurrentEnergy {

    private int value;

    HumanCurrentEnergy(int value) throws IllegalArgumentException {
        if ( value > 0 && value < 101 ) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Hibás a bevitt adat.");
        }
    }


    public final int addValue(int i) {
        return value+=i;
    }

    public final int getValue(){
        return this.value;
    }

    public final void setValue(int i) {
        this.value = i;
    }

}
