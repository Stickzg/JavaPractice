package com.flowacademy.shrek;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Lovaskocsi extends Observable {

    private List<Karakter> rakomany;
    private String ott;

    public Lovaskocsi(){ this.rakomany = new ArrayList<Karakter>(); }

    public Lovaskocsi(List<Karakter> rakomany) {
        this.rakomany = rakomany;
    }

    public void beszall(Karakter karakter) {
        rakomany.add(karakter);
        addObserver(karakter);
    }

    public void kiszall(Karakter karakter) {
        rakomany.remove(karakter);
        System.out.println("Kiszált: " + karakter.getNev());
        deleteObserver(karakter);
    }

    public void setOtt(String ott) {
        System.out.println("Megérkeztünk a " + ott + "/ba/be/ra/re etc...");
        this.ott = ott;
        setChanged();
        notifyObservers(ott);
    }

    public String getOtt() {
        return ott;
    }
}
