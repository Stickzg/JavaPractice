package com.flowacademy.vehicles;

import com.flowacademy.vehicles.Exceptions.ElromlottException;

public class Kerekpar extends Jarmu {

    public Kerekpar(int suly) {
        super(suly, 40);
    }

    @Override
    public void indulas() throws ElromlottException {
        if ( this.isElromlott() ) {
            throw new ElromlottException("Elromlott a bicikli.");
        } else {
            System.out.println("Elindultunk biciklivel");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " bicikli.";
    }
}
