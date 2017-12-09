package com.flowacademy.lists;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Halmaz {

    public static void main(String[] args) {
        HashSet<Integer> halmaz = new HashSet<Integer>();


        halmaz.add(1);
        halmaz.add(2);
        halmaz.add(3);
        halmaz.add(4);
        halmaz.add(5);

        for (Integer integer: halmaz) {
            System.out.println(integer);
        }

        Iterator<Integer> iterator = halmaz.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println("");
        System.out.println(halmaz);
    }

}
