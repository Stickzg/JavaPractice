package com.flowacademy.automata;

public class UresAutomata {

    protected int bedobottPenzErteke;
    protected int gepbenRendelkezesrealloPoharakSzama;
    protected boolean hasznalhatoE;
    private String hasznalhatosag(boolean hasznalhatoE) {
        if ( hasznalhatoE ) {
            return "Használható";
        } else {
            return "Nem használható";
        }
    }

    public UresAutomata(int bedobottPenzErteke,
                        int gepbenRendelkezesrealloPoharakSzama,
                        boolean hasznalhatoE) {
        this.bedobottPenzErteke = bedobottPenzErteke;
        this.gepbenRendelkezesrealloPoharakSzama = gepbenRendelkezesrealloPoharakSzama;
        this.hasznalhatoE = hasznalhatoE;
    }

    public void penztBedob(int penz) {
        System.out.println("Ez az automata nincs feltöltve, nem használható.");
    }

    public int getBedobottPenzErteke() {
        return bedobottPenzErteke;
    }

    public void setBedobottPenzErteke(int bedobottPenzErteke) {
        this.bedobottPenzErteke = bedobottPenzErteke;
    }

    public int getGepbenRendelkezesrealloPoharakSzama() {
        return gepbenRendelkezesrealloPoharakSzama;
    }

    public void setGepbenRendelkezesrealloPoharakSzama(int gepbenRendelkezesrealloPoharakSzama) {
        this.gepbenRendelkezesrealloPoharakSzama = gepbenRendelkezesrealloPoharakSzama;
    }

    public boolean isHasznalhatoE() {
        return hasznalhatoE;
    }

    public void setHasznalhatoE(boolean hasznalhatoE) {
        this.hasznalhatoE = hasznalhatoE;
    }

    @Override
    public String toString() {
        return "UresAutomata(" +
                "bedobott pénz érteke: " + bedobottPenzErteke +
                ", " + hasznalhatosag(hasznalhatoE) +
                ')';
    }
}
