package com.flowacademy.builder;

public class Complex implements Cloneable {

    private int atr1;
    private int atr2;
    private int atr3;
    private int atr4;
    private int atr5;
    private int atr6;
    private int atr7;

    private Complex(int atr1, int atr2, int atr3, int atr4, int atr5, int atr6, int atr7) {
        this.atr1 = atr1;
        this.atr2 = atr2;
        this.atr3 = atr3;
        this.atr4 = atr4;
        this.atr5 = atr5;
        this.atr6 = atr6;
        this.atr7 = atr7;
    }

    public int getAtr1() {
        return atr1;
    }

    public int getAtr2() {
        return atr2;
    }

    public int getAtr3() {
        return atr3;
    }

    public int getAtr4() {
        return atr4;
    }

    public int getAtr5() {
        return atr5;
    }

    public int getAtr6() {
        return atr6;
    }

    public int getAtr7() {
        return atr7;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static class Builder {

        private int atr1;
        private int atr2;
        private int atr3;
        private int atr4;
        private int atr5;
        private int atr6;
        private int atr7;

        public Builder(int atr1, int atr2) {
            this.atr1 = atr1;
            this.atr2 = atr2;
        }

        public Builder setAtr3(int atr3) {
            this.atr3 = atr3;
            return this;
        }

        public Builder setAtr4(int atr4) {
            this.atr4 = atr4;
            return this;
        }

        public Builder setAtr5(int atr5) {
            this.atr5 = atr5;
            return this;
        }

        public Builder setAtr6(int atr6) {
            this.atr6 = atr6;
            return this;
        }

        public Builder setAtr7(int atr7) {
            this.atr7 = atr7;
            return this;
        }

        public Complex build () {
            return new Complex(atr1, atr2, atr3, atr4, atr5, atr6, atr7);
        }

    }

}
