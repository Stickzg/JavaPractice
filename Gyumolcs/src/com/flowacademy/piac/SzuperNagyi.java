package com.flowacademy.piac;

import com.flowacademy.piac.portéka.Gyumolcs;

import java.util.Arrays;
import java.util.Random;

public class SzuperNagyi extends Vasarlo {

    private Random alkudozás = new Random();
    private int alkudozo = alkudozás.nextInt(1);

    public SzuperNagyi(Gyumolcs[] kosar, int penz) {
        super(kosar, (int) (penz*0.8));
    }

    private void megmondtam(){
        System.out.println("ugye unokám megmondtam, hogy ennél az árusnál lehet alkudni…");
    }

    @Override
    public void vasarol(Gyumolcs gyumolcs) {
        if(gyumolcs.getSzin().equals("Zöld") || gyumolcs.getSzin().equals("Sárga") &&
                gyumolcs.getAr() <= penz) {
            if(alkudozo<1) {
                super.kosar[kosarSzamlalo] = gyumolcs;
                kosarSzamlalo++;
                penz -= gyumolcs.getAr();
            } else {
                super.kosar[kosarSzamlalo] = gyumolcs;
                kosarSzamlalo++;
                penz -= gyumolcs.getAr()*0.9;
                megmondtam();
            }
        } else if (gyumolcs.getAr()<= penz) {
            System.out.println("Sajnos nem tudjuk megvenni a(z) " + gyumolcs.getFajta() + "-t.");
        } else {
            System.out.println("Elnézést, de csak zöld gyümölcsöt veszek.");
        }
    }

    @Override
    public String toString() {
        return "SzuperNagyi(" +
                ", alkudozo: " + alkudozo +
                ", kosar: " + Arrays.toString(kosar) +
                ", penz: " + penz +
                ')';
    }
}
