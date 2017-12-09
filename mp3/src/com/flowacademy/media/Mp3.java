package com.flowacademy.media;

public class Mp3 {

    private String eloado;
    private String album;
    private String szamCime;
    private int dalHossz;

    public Mp3(String eloado, String album, String szamCime, int dalHossz) {
        this.eloado = eloado;
        this.album = album;
        this.szamCime = szamCime;
        this.dalHossz = dalHossz;
    }

    public String getEloado() {
        return eloado;
    }

    public void setEloado(String eloado) {
        this.eloado = eloado;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSzamCime() {
        return szamCime;
    }

    public void setSzamCime(String szamCime) {
        this.szamCime = szamCime;
    }

    public int getDalHossz() {
        return dalHossz;
    }

    public void setDalHossz(int dalHossz) {
        this.dalHossz = dalHossz;
    }

    @Override
    public String toString() {
        return "Ez a szám " +
                eloado + " előadótól a" +
                szamCime + " nevű szám, ami a(z) " +
                album + " albumon található, hossza pedig :" +
                dalHossz;
    }
}
