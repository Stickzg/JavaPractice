package com.flowacademy.gep;


import java.io.Serializable;

public class Markolo extends MunkaGep implements Serializable {

    private int kanalmeret;

    public Markolo(int suly, String tipus, int kanalmeret) {
        super(suly, tipus);
        this.kanalmeret = kanalmeret;
    }

     public double atrakod(int tomeg, int tavolsag, Teherauto szallito) {
        double timer = 0;
         while (tomeg > 0) {
             if ( szallito.getMegrakodottsag() == szallito.getTeherbiras() ) {
                 try {
                     szallito.szallit(tavolsag);
                     timer += szallito.szallit(tavolsag);
                 } catch (Exception e) {
                     e.fillInStackTrace();
                 }
             } else {
                 tomeg -= this.kanalmeret;
                 //Rakomány tömeg átrakodása
                 szallito.setMegrakodottsag(szallito.getMegrakodottsag() + this.kanalmeret);
                 if ( this.equals(szallito) ) {
                     timer += 5;
                 } else {
                     timer+=6;
                 }
             }
         }
         return timer;
     }


    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Markolo) ) return false;

        Markolo markolo = (Markolo) o;

        return kanalmeret == markolo.kanalmeret;
    }

    @Override
    public int hashCode() {
        return kanalmeret;
    }

    @Override
    public String getTipus() {
        return super.getTipus() + " kanálméret: "
                + this.kanalmeret;
    }
}
