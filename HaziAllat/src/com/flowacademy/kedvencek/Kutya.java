package com.flowacademy.kedvencek;

import com.flowacademy.kedvencek.exceptions.HaziallatException;

public class Kutya extends Haziallat {

    public Kutya(String nev) {
        super(5, 5, nev);
    }

    @Override
    public void simogat() throws HaziallatException, Exception {
        this.setJokedv(getJokedv()+1);
    }

    @Override
    public void megetet() throws HaziallatException, Exception {
        if ( this.getEhseg() <= 0 ) {
            throw new HaziallatException("Már nem éhes");
        } else {
            this.setEhseg(getEhseg()-1);
        }
    }

    public void setaltat(){
        this.setJokedv(getJokedv()+1);
        this.setEhseg(getEhseg()-2);
    }

    @Override
    public String toString() {
        return this.getNev() + ' ' +
            jokedvuE() + '.';
    }
}
