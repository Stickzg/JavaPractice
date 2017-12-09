package com.flowacademy.gep;

import java.io.Serializable;

public class FastestMachines implements Serializable {

    private Teherauto teherauto;
    private Markolo markolo;
    private double speed;

    public FastestMachines(Teherauto teherauto, Markolo markolo, double speed) {
        this.teherauto = teherauto;
        this.markolo = markolo;
        this.speed = speed;
    }

    public Teherauto getTeherauto() {
        return teherauto;
    }

    public void setTeherauto(Teherauto teherauto) {
        this.teherauto = teherauto;
    }

    public Markolo getMarkolo() {
        return markolo;
    }

    public void setMarkolo(Markolo markolo) {
        this.markolo = markolo;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
