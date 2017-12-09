package com.flowacademy.raktar;

import com.flowacademy.raktar.Aru;
import com.flowacademy.raktar.exceptions.RosszMinoseg;

import java.util.Random;

public class Gyumolcs implements Aru {
    private Random romlasRandom = new Random();
    private String gyumolcsNev;

    public Gyumolcs(String gyumolcsNev) {
        this.gyumolcsNev = gyumolcsNev;
    }

    @Override
    public boolean joMeg() throws RosszMinoseg {
        int temp = romlasRandom.nextInt(6)+1;
        if (temp == 3) {
            throw new RosszMinoseg("Ez a gyümölcs romlott, én nem venném meg");
        } else if (temp%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Gy;" +
                gyumolcsNev;
    }
}
