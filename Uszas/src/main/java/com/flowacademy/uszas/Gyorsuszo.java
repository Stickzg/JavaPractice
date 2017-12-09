package com.flowacademy.uszas;

import com.flowacademy.uszas.exceptions.UszoException;
import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;

import java.io.Serializable;
import java.util.Random;

public class Gyorsuszo extends Uszo implements Versenyzo, Serializable {
    private static final long SerialVersionUID = 2017120701L;
    Random random = new Random();


    public Gyorsuszo(String nev, int teljesitmeny, String nemzetiseg) {
        super(nev, teljesitmeny, nemzetiseg);
    }

    public Gyorsuszo() {
    }

    @Override
    public double versenyez(int i) throws UszoException {
        double startTime = 1.5;
        double turnCounter = (i/50) * 2;
        double swimTime = 0;
        while (i != 0) {
            i-=10;
            swimTime += this.uszik();
        }
        return startTime+turnCounter+swimTime;
    }

    @Override
    double uszik() throws UszoException {
        double jelenlegiTeljesitmeny = (getTeljesitmeny() * 1.3) * random.nextDouble();
        if ( jelenlegiTeljesitmeny != 0 ) {
            return jelenlegiTeljesitmeny;
        } else {
            throw  new UszoException(this.getNev() + " kiégett, nem tud uszni.");
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return this.getClass() + this.getNev() + this.getTeljesitmeny() + this.getNemzetiseg() + "\n";
    }
}
