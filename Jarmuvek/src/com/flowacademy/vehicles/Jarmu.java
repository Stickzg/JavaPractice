package com.flowacademy.vehicles;

import com.flowacademy.vehicles.Exceptions.ElromlottException;

import java.io.Serializable;

public abstract class Jarmu implements Serializable {

    private int suly;
    private int maxSebesseg;
    private boolean elromlott = false;

    public Jarmu(int suly, int maxSebesseg) {
        this.suly = suly;
        this.maxSebesseg = maxSebesseg;
    }

    public int getSuly() {
        return suly;
    }

    public void setSuly(int suly) {
        this.suly = suly;
    }

    public int getMaxSebesseg() {
        return maxSebesseg;
    }

    public void setMaxSebesseg(int maxSebesseg) {
        this.maxSebesseg = maxSebesseg;
    }

    public boolean isElromlott() {
        return elromlott;
    }

    public void setElromlott(boolean elromlott) {
        this.elromlott = elromlott;
    }

    public abstract void indulas () throws ElromlottException;

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Jarmu) ) return false;

        Jarmu jarmu = (Jarmu) o;

        return suly == jarmu.suly;
    }

    @Override
    public int hashCode() {
        return suly;
    }

    @Override
    public String toString() {
        return "Jarmu{" +
                "suly=" + suly +
                ", maxSebesseg=" + maxSebesseg +
                ", elromlott=" + elromlott +
                '}';
    }
}


