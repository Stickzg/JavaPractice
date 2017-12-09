package com.flowacademy.builder;


public class Main {

    public static void main(String[] args) {

        Complex complex = new Complex.Builder(1, 2).setAtr3(3).setAtr7(7).build();
        System.out.println(complex);
        try {
            Complex complex2 = (Complex) complex.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
