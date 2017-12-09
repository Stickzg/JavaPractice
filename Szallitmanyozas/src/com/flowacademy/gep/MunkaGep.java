package com.flowacademy.gep;

import java.io.Serializable;

public abstract class MunkaGep implements Serializable, Comparable<MunkaGep> {

    protected int suly;
    protected String tipus;


    public MunkaGep(int suly, String tipus) {
        this.suly = suly;
        this.tipus = tipus;
    }

    public int getSuly() {
        return suly;
    }

    public void setSuly(int suly) {
        this.suly = suly;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    private static final long serialVersionUID = 20171205L;

    @Override
    public int compareTo(MunkaGep munkaGep) {
        return String.CASE_INSENSITIVE_ORDER.compare(munkaGep.getTipus(), this.getTipus());
    }
}
