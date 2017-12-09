package com.flowacademy.gep.comparator;

import com.flowacademy.gep.Markolo;
import com.flowacademy.gep.MunkaGep;
import com.flowacademy.gep.Teherauto;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {
        List<Teherauto> szallitok = new LinkedList<>();
        szallitok.add(new Teherauto(120,"Ifa", 200));
        szallitok.add(new Teherauto(200, "Mann", 300));
        szallitok.add(new Teherauto(300, "Ifa", 400));
        szallitok.add(new Teherauto(400, "Mann", 500));

        List<MunkaGep> munkagepek = new LinkedList<>(szallitok);
        munkagepek.add(new Markolo(200, "Cat", 200));

        System.out.println(Collections.max(munkagepek).getTipus());

        Collections.sort(munkagepek);
        System.out.println("Munkagépek: " + munkagepek);


        Collections.sort(szallitok);
        szallitok.sort(new SulyComparator());
        System.out.println("Suly szerint rendezve: " + szallitok);
        szallitok.sort(new TeherbirasComparator());
        System.out.println("Teherbiras szerint rendezve: " + szallitok);
        szallitok.sort(new TipusComparator());
        System.out.println("Tipus szerint rendezve: " + szallitok);

    }
 }
