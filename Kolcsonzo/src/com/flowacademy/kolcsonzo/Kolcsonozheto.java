package com.flowacademy.kolcsonzo;

import com.flowacademy.kolcsonzo.Exceptions.HibasKolcsonzesException;

public interface Kolcsonozheto {

    boolean kikolcsonoz(int i, int j) throws HibasKolcsonzesException;

    boolean visszaHoz();

}
