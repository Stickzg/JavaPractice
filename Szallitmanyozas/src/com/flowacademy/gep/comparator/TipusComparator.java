package com.flowacademy.gep.comparator;

import com.flowacademy.gep.Teherauto;

import java.util.Comparator;

public class TipusComparator implements Comparator<Teherauto> {
    @Override
    public int compare(Teherauto teherauto1, Teherauto teherauto2) {
        return String.CASE_INSENSITIVE_ORDER.compare(teherauto1.getTipus(), teherauto2.getTipus());
    }
}
