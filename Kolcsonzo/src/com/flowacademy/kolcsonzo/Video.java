package com.flowacademy.kolcsonzo;

import com.flowacademy.kolcsonzo.Exceptions.HibasKolcsonzesException;

import java.io.Serializable;


public class Video implements Kolcsonozheto, Serializable {

    private String filmCime;
    private boolean kivanKolcsonozve;
    private String kolcsonozhetoIdo;
    public int korhatar;



    public Video(String filmCime, String kolcsonozhetoIdo, int korhatar) {
        this.filmCime = filmCime;
        this.kivanKolcsonozve = true;
        this.kolcsonozhetoIdo = kolcsonozhetoIdo;
        this.korhatar = korhatar;
    }

    protected int kolcsonidoInterizer (String s) {
        switch (s) {
            case "egynapos": return 1;
            case "kétnapos": return 2;
            default:
                return 1000;
        }
    }

    @Override
    public boolean kikolcsonoz(int kor, int napok) throws HibasKolcsonzesException {
        if ( kor >= this.korhatar && napok == kolcsonidoInterizer(this.kolcsonozhetoIdo)) {
            return kivanKolcsonozve = true;
        } else if (this.kivanKolcsonozve == true) {
            System.out.println("Ez már kivan kölcsönözve.");
            return false;
        } else if ( kor < this.korhatar ){
            throw new HibasKolcsonzesException("Túl fiatal vagy, hogy kikölcsönözd ezt a filmet.");
        } else {
            throw new HibasKolcsonzesException("Ilyen sok időre nem veheted ki ezt a filmet.");
        }
    }

    @Override
    public boolean visszaHoz() {
        return this.kivanKolcsonozve = false;
    }

    public String getFilmCime() {
        return filmCime;
    }

    public void setFilmCime(String filmCime) {
        this.filmCime = filmCime;
    }

    public boolean isKivanKolcsonozve() {
        return kivanKolcsonozve;
    }

    public void setKivanKolcsonozve(boolean kivanKolcsonozve) {
        this.kivanKolcsonozve = kivanKolcsonozve;
    }

    public String getKolcsonozhetoIdo() {
        return kolcsonozhetoIdo;
    }

    public void setKolcsonozhetoIdo(String kolcsonozhetoIdo) {
        this.kolcsonozhetoIdo = kolcsonozhetoIdo;
    }

    public int getKorhatar() {
        return korhatar;
    }

    public void setKorhatar(int korhatar) {
        this.korhatar = korhatar;
    }


    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Video) ) return false;

        Video video = (Video) o;

        if ( kivanKolcsonozve != video.kivanKolcsonozve ) return false;
        if ( korhatar != video.korhatar ) return false;
        if ( !filmCime.equals(video.filmCime) ) return false;
        return kolcsonozhetoIdo.equals(video.kolcsonozhetoIdo);
    }

    @Override
    public int hashCode() {
        int result = filmCime.hashCode();
        result = 31 * result + (kivanKolcsonozve ? 1 : 0);
        result = 31 * result + kolcsonozhetoIdo.hashCode();
        result = 31 * result + korhatar;
        return result;
    }

    @Override
    public String toString() {
        return "Video(" +
                "filmCime: " + filmCime +
                ", kivanKolcsonozve: " + kivanKolcsonozve +
                ", kolcsonozhetoIdo: " + kolcsonozhetoIdo +
                ", korhatar: " + korhatar +
                ')';
    }
}
