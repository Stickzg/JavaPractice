package com.flowacademy.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lists {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }

        Iterator<Integer> iteratorLista = lista.iterator();

        while(iteratorLista.hasNext()){
            if (iteratorLista.next()  <= 2) {
                iteratorLista.remove();
            }
        }

        System.out.println(lista);
    }

}
