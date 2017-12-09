package com.flowacademy.szovegkezel;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Szovegkezel {

    public static void main(String[] args) {

        String text = "egy ketto harom negy ot hat het nyolc kilenc tiz";
        String[] array = text.split(" ");
        for(String string:array) {
            System.out.println(string);
        }

        StringTokenizer tokenizer = new StringTokenizer(text, " ");
        while(tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextElement());
        }

        Arrays.stream(array);

    }

}
