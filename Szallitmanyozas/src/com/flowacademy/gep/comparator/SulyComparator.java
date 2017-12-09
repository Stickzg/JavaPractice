package com.flowacademy.gep.comparator;

import com.flowacademy.gep.Teherauto;

import java.util.Comparator;

public class SulyComparator implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        Teherauto teherauto1 = (Teherauto)(o);
        Teherauto teherauto2 = (Teherauto)(t1);
        return teherauto1.compareTo(teherauto2);
    }
}
