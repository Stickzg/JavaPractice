package com.flowacademy.raktar;

import com.flowacademy.raktar.Aru;
import com.flowacademy.raktar.exceptions.RosszMinoseg;

public class Tejtermek implements Aru {

    private long gyartasiIdo;
    private long szavatossagiIdo;
    private String nev;
    long vetel = System.currentTimeMillis()/1000;

    public Tejtermek(long gyartasiIdo, long szavatossagiIdo, String nev) {
        this.gyartasiIdo = gyartasiIdo;
        this.szavatossagiIdo = szavatossagiIdo;
        this.nev = nev;
    }

    @Override
    public boolean joMeg() throws RosszMinoseg {
        if (gyartasiIdo - vetel < szavatossagiIdo) {
            return true;
        } else {
            throw new RosszMinoseg("A termék lejárt szavidővel rendelkezik.");
        }
    }

    @Override
    public String toString() {
        return "T" +
                ";" + nev +
                ";" + gyartasiIdo +
                ";" + szavatossagiIdo;
    }
}
