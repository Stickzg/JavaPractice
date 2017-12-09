package com.flowacademy.kedvencek;

import com.flowacademy.kedvencek.exceptions.HaziallatException;

public abstract class Haziallat {
    private int jokedv;
    private int ehseg;
    private String nev;

    public Haziallat(int jokedv, int ehseg, String nev) {
        this.jokedv = jokedv;
        this.ehseg = ehseg;
        this.nev = nev;
    }

    public int getJokedv() {
        return jokedv;
    }

    public void setJokedv(int jokedv) {
        this.jokedv = jokedv;
    }

    public int getEhseg() {
        return ehseg;
    }

    public void setEhseg(int ehseg) {
        this.ehseg = ehseg;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public abstract void simogat() throws HaziallatException, Exception;

    public abstract void megetet() throws HaziallatException, Exception;

    public Boolean jokedvuE(){
        if ( this.getJokedv()> 8 && this.getEhseg()<4 ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Haziallat{" +
                "jokedv=" + jokedv +
                ", ehseg=" + ehseg +
                ", nev='" + nev + '\'' +
                '}';
    }
}
