package com.flowacademy.gep.comparator;

import com.flowacademy.gep.Teherauto;

import java.util.Comparator;

public class TeherbirasComparator implements Comparator<Teherauto> {

    @Override
    public int compare(Teherauto teherauto1, Teherauto teherauto2) {
        if (teherauto1.getTeherbiras() < teherauto2.getTeherbiras()) {
            return 1;
        } else if (teherauto1.getTeherbiras() > teherauto2.getTeherbiras()) {
            return -1;
        } else {
            return 0;
        }
    }
}
