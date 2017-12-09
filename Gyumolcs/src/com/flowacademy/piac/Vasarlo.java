package com.flowacademy.piac;

import com.flowacademy.piac.portéka.Gyumolcs;

import java.util.Arrays;

public class Vasarlo {

    protected Gyumolcs[] kosar;
    protected int penz;
    static int kosarSzamlalo = 0;

    public Vasarlo(Gyumolcs[] kosar, int penz) {
        this.kosar = kosar;
        this.penz = penz;
    }

    public void vasarol (Gyumolcs gyumolcs) {
        if(gyumolcs.getSzin().equals("Zöld") && gyumolcs.getAr() <= penz) {
            kosar[kosarSzamlalo] = gyumolcs;
            kosarSzamlalo++;
            penz-=gyumolcs.getAr();
        } else if (gyumolcs.getAr()<= penz) {
            System.out.println("Sajnos nem tudjuk megvenni a(z) " + gyumolcs.getFajta() + "-t.");
        } else {
            System.out.println("Elnézést, de csak zöld gyümölcsöt veszek.");
        }
    }

    @Override
    public String toString() {
        return "Vasarlo" +
                "kosár Tartalma: " + Arrays.toString(kosar) +
                ", penz: " + penz;
    }

}
