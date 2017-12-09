package com.flowacademy.uszas;

import com.flowacademy.uszas.exceptions.UszoException;

public abstract class Uszo implements Comparable<Uszo> {

    private String nev;
    private int teljesitmeny;
    private String nemzetiseg;
    private static final long SerialVersionUID = 2017120700L;

    public Uszo(String nev, int teljesitmeny, String nemzetiseg) {
        this.nev = nev;
        this.teljesitmeny = teljesitmeny;
        this.nemzetiseg = nemzetiseg;
    }

    public Uszo() {
    }

    abstract double uszik() throws UszoException;

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public void setTeljesitmeny(int teljesitmeny) {
        this.teljesitmeny = teljesitmeny;
    }

    public String getNemzetiseg() {
        return nemzetiseg;
    }

    public void setNemzetiseg(String nemzetiseg) {
        this.nemzetiseg = nemzetiseg;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Uszo uszo) {
        if ( uszo instanceof Uszomester ) {
            return String.CASE_INSENSITIVE_ORDER.compare(this.nev, uszo.nev);
        } else {
            return 0;
        }
    }



}
