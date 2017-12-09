package com.flowacademy.kolcsonzo;

import com.flowacademy.kolcsonzo.Exceptions.HibasKolcsonzesException;

public final class OktatoVideo extends Video {

    public OktatoVideo(String filmCime, String kolcsonozhetoIdo) {
        super(filmCime, kolcsonozhetoIdo, 0);
    }

    @Override
    public boolean kikolcsonoz(int kor, int napok) throws HibasKolcsonzesException {
        if ( napok <= kolcsonidoInterizer(this.getKolcsonozhetoIdo()) ) {
            System.out.println("Jó tanulást!");
            return true;
        } else {
            throw new HibasKolcsonzesException("Ennyi időre nem lehet kivenni.");
        }
    }



}
