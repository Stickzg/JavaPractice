package com.flowacademy.kedvencek;

import com.flowacademy.kedvencek.exceptions.HaziallatException;

public class Macska extends Haziallat {

    public Macska(String nev) {
        super(5, 5, nev);
    }


    public void dorombol() throws HaziallatException{
        if ( super.getJokedv()<0 ) {
            throw new HaziallatException("Szomorú a macska");
        } else {
            this.setEhseg(getEhseg() + 1);
            this.setJokedv(getJokedv() - 2);
        }
    }


    @Override
    public void simogat() throws HaziallatException, Exception {
        this.setJokedv(getJokedv()+1);
    }

    @Override
    public void megetet() throws HaziallatException, Exception {
        if ( this.getEhseg() <= 0 ) {
            throw new HaziallatException("Már nem éhes.");
        } else {
            this.setEhseg(getEhseg() - 1);
        }
    }

    @Override
    public String toString() {
        return this.getNev() + ' ' +
                jokedvuE() + '.';
    }

}
