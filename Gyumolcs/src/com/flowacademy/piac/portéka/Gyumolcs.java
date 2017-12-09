package com.flowacademy.piac.portéka;

public class Gyumolcs {

    private int ar;
    private String szin;
    private String fajta;


    public Gyumolcs(int ar, String szin, String fajta) {
        this.ar = ar;
        switch (szin) {
            case "piros": this.szin="piros";
                break;
            case "zöld": this.szin="zöld";
                break;
            case "sárga": this.szin="sárga";
                break;
            default:
                System.out.println("Hibás a megadott szín");
                System.exit(1);
        }
        this.fajta = fajta;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }


    @Override
    public String toString() {
        return "com.flowacademy.piac.portéka.Gyumolcs(" +
                "ar: " + ar +
                ", szin: " + szin +
                ", fajta: " + fajta +
                ')';
    }
}
