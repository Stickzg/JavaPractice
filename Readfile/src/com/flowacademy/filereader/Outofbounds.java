package com.flowacademy.filereader;

public class Outofbounds {

    static float osztas(int a, int b) {
        if(a == 0 || b == 0) throw new IllegalArgumentException();
        return (float) a+b;
    }

    public static void main(String[] args) {

        int n=0;
        int[] tomb = new int[3];
        try {
            for (int i = 0; i < 4; i++) {
                tomb[i]=n;
                n++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Túlszaladtál paraszt");
        }

        try{
            osztas(2, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Task failed successfully!");
            System.out.println("Ja meg nem osztunk 0-val.");
        }

    }

}
