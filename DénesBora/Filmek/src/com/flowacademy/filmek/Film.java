package com.flowacademy.filmek;

import java.util.Random;

public class Film {
    private Random rng = new Random();


    protected String cim;
    protected String rendezoNeve;
    protected int gyartasDatuma;

    public Film(String cim, String rendezoNeve, int gyartasDatuma) {
        this.cim = cim;
        this.rendezoNeve = rendezoNeve;
        this.gyartasDatuma = gyartasDatuma;
    }

    public boolean jelolesOscarra(int jelolesEve) {

        int nyeresiEsely = rng.nextInt(1);

        if (jelolesEve > 2017 && jelolesEve < 1929) {
            System.out.println("Hibás a jelölés éve!");
            return false;
        } else if ( nyeresiEsely>0 ){
            System.out.println(this.cim + " nyert!");
            return true;
        } else {
            System.out.println(this.cim + " nem nyert.");
            return false;
        }
    }



    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getRendezoNeve() {
        return rendezoNeve;
    }

    public void setRendezoNeve(String rendezoNeve) {
        this.rendezoNeve = rendezoNeve;
    }

    public int getGyartasDatuma() {
        return gyartasDatuma;
    }

    public void setGyartasDatuma(int gyartasDatuma) {
        this.gyartasDatuma = gyartasDatuma;
    }

    @Override
    public String toString() {
        return "Film{" +
                "cim: " + cim +
                ", rendezoNeve: " + rendezoNeve +
                ", gyartasDatuma: " + gyartasDatuma +
                '}';
    }
}
