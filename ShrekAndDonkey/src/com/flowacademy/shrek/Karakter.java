package com.flowacademy.shrek;

import java.util.Observable;
import java.util.Observer;

public class Karakter implements Observer {

    private String nev;
    private String hova;

    public Karakter(String nev, String hova) {
        this.nev = nev;
        this.hova = hova;
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof Lovaskocsi) {
            if (this.hova.equals(o)) {
                ((Lovaskocsi) observable).kiszall(this);
            }
        }
    }

    public String getNev() {
        return nev;
    }
}
