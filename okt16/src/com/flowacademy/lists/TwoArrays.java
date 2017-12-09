package com.flowacademy.lists;

public class TwoArrays {

    public static void main(String[] args) {

        int[] elso = new int[10];
        int[] masodik = new int[elso.length];

        for (int i=0; i < elso.length; i++) {
            elso[i]=i;
        }

        System.arraycopy(elso, 0, masodik, 0, elso.length);

        for (int integer: elso) {
            System.out.print(integer + ", ");
        }

        System.out.println("");

        for(int integer : masodik) {
            System.out.print(integer + ", ");
        }

    }
}
