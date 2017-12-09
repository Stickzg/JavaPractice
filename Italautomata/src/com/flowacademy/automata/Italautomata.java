package com.flowacademy.automata;

public class Italautomata extends UresAutomata {

    private boolean hidegItalE;
    private String hidegMeleg(boolean hidegItalE) {
        if ( hidegItalE ) {
            return " | ez a gép hideg italokat árusít.";
        } else {
            return " | ez a gép meleg italokat árusít";
        }
    }

    @Override
    public void penztBedob(int penz) {
        if(gepbenRendelkezesrealloPoharakSzama < 1) {
            System.out.println("Próbálkozzon később!");
        } else if (penz < 95) {
            System.out.println("Kevés a bedobott pénz!");
        } else {
            gepbenRendelkezesrealloPoharakSzama--;
            bedobottPenzErteke+=95;
            System.out.println("Sikeres volt a tranzakció!");
            System.out.println("Visszajáró: " + (penz-95));
        }
    }

    public Italautomata(int gepbenRendelkezesrealloPoharakSzama, boolean hidegItalE) {
        super(0 , gepbenRendelkezesrealloPoharakSzama, true);
        this.hidegItalE = hidegItalE;
    }

    @Override
    public String toString() {
        return super.toString()
        + hidegMeleg(hidegItalE);
    }
}
