package com.flowacademy.vehicles;

import com.flowacademy.vehicles.Exceptions.ElromlottException;
import com.flowacademy.vehicles.Exceptions.NincsUzemanyagException;

import java.io.Serializable;

public class Gepkocsi extends Jarmu implements IMotorizalt, Serializable {

    private int uzemanyag;

    public Gepkocsi(int suly, int maxSebesseg) {
        super(suly, maxSebesseg);
        this.uzemanyag = 50;
    }


    @Override
    public void indulas() throws ElromlottException, NincsUzemanyagException {
        if ( isElromlott()) {
            throw new ElromlottException("Elromlott a kocsi.");
        } else if ( this.uzemanyag<=0 ) {
            throw new NincsUzemanyagException("Kifogyott az üzemanyag.");
        } else {
            System.out.println("Elindultunk a kocsival.");
            this.uzemanyag-=10;
        }
    }

    @Override
    public void uzemanyagToltes(int i) {
        this.uzemanyag+=10;
    }

    @Override
    public int getUzemanyag() {
        return this.uzemanyag;
    }

}
