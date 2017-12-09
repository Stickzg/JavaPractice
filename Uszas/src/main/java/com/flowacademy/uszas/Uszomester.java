package com.flowacademy.uszas;

import com.flowacademy.uszas.exceptions.UszoException;

import java.io.Serializable;

public class Uszomester extends Uszo implements Serializable {

    public Uszomester(String nev, int teljesitmeny, String nemzetiseg) {
        super(nev, teljesitmeny, nemzetiseg);
    }

    @Override
    double uszik() throws UszoException {
        return super.getTeljesitmeny();
    }

    public void megment (Uszo uszo) {
        System.out.println(this.getNev() + " megmentette " +uszo + "-t.");
    }

    @Override
    public String toString() {
        return this.getClass() + this.getNev() + this.getTeljesitmeny() + this.getNemzetiseg() + "\n";
    }


}
