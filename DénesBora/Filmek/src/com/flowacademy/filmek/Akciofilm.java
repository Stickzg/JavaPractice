package com.flowacademy.filmek;

public class Akciofilm extends Film {

    private String akcioHosNeve;
    private boolean ferfi;
    private int halalozasiSzam;

    public Akciofilm(String cim, String rendezoNeve, int gyartasDatuma
                     , boolean ferfi, String akcioHosNeve, int halalozasiSzam) {
        super(cim, rendezoNeve, gyartasDatuma);
        this.akcioHosNeve = akcioHosNeve;
        this.ferfi = ferfi;
        this.halalozasiSzam = halalozasiSzam;
    }


    public String getAkcioHosNeve() {
        return akcioHosNeve;
    }

    public void setAkcioHosNeve(String akcioHosNeve) {
        this.akcioHosNeve = akcioHosNeve;
    }

    public boolean isFerfi() {
        return ferfi;
    }

    public void setFerfi(boolean ferfi) {
        this.ferfi = ferfi;
    }

    public int getHalalozasiSzam() {
        return halalozasiSzam;
    }

    public void setHalalozasiSzam(int halalozasiSzam) {
        this.halalozasiSzam = halalozasiSzam;
    }

    @Override
    public String toString() {
        return "Akciofilm(" +
                "akcioHosNeve : " + akcioHosNeve +
                ", ferfi-e: " + ferfi +
                ", halalozasiSzam :" + halalozasiSzam +
                ", cim : " + cim +
                ", rendezoNeve : " + rendezoNeve +
                ", gyartasDatuma : " + gyartasDatuma +
                ')';
    }


}
