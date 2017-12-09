package com.flowacademy.gep;

import java.io.Serializable;
import java.util.Random;

public class Teherauto extends MunkaGep implements ISzallito, Serializable, Comparable<MunkaGep> {

    private int teherbiras;
    private int megrakodottsag;

    private Random random = new Random();

    public Teherauto(int suly, String tipus, int teherbiras) {
        super(suly, tipus);
        this.teherbiras = teherbiras;
        this.megrakodottsag = 0;
    }

    public int getTeherbiras() {
        return teherbiras;
    }

    public void setTeherbiras(int teherbiras) {
        this.teherbiras = teherbiras;
    }

    public int getMegrakodottsag() {
        return megrakodottsag;
    }

    public void setMegrakodottsag(int megrakodottsag) {
        this.megrakodottsag = megrakodottsag;
    }



    @Override
    public double szallit(int tavolsag) throws Exception {
        if (this.megrakodottsag == 0) {
            throw new Exception("Nincs rakomány");
        } else {
            this.megrakodottsag = 0;
            return tavolsag/(this.suly + this.megrakodottsag)*random.nextDouble();
        }
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Teherauto) ) return false;

        Teherauto teherauto = (Teherauto) o;

        if ( teherbiras != teherauto.teherbiras ) return false;
        if ( megrakodottsag != teherauto.megrakodottsag ) return false;
        return random != null ? random.equals(teherauto.random) : teherauto.random == null;
    }

    @Override
    public int hashCode() {
        int result = teherbiras;
        result = 31 * result + megrakodottsag;
        result = 31 * result + (random != null ? random.hashCode() : 0);
        return result;
    }

    public int compareTo(Teherauto teherauto) {
        if (teherauto.suly < this.suly) {
            return 1;
        } else if (teherauto.suly > this.suly) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Teherauto{" +
                "teherbiras=" + teherbiras +
                ", megrakodottsag=" + megrakodottsag +
                ", suly=" + suly +
                ", tipus='" + tipus +
                '}' + "\n";
    }
}
