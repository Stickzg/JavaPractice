package com.flowacademy.media.Lejatszo;

import com.flowacademy.media.Mp3;
import com.flowacademy.media.Videoclip;

public class Winamp {
    private static int tombHeader = 0;

    private Mp3[] mp3s;
    private int tombMeret;

    public Winamp(Mp3[] mp3s, int tombMeret) {
        this.mp3s = mp3s;
        this.tombMeret = tombMeret;
    }

    public int getTombMeret() {
        return tombMeret;
    }

    public void hozzaAd (Mp3 zene) {
        if ( tombHeader <=tombMeret ) {
            mp3s[tombHeader] = zene;
            tombHeader++;
        }
    }

    public Mp3 lekerdez (int i) {
        return mp3s[i];
    }

    public String info (Mp3 mp3) {
        return mp3.toString();
    }

    public static void main(String[] args) {

        try {
            Winamp winamp = new Winamp(new Mp3[Integer.parseInt(args[0])], Integer.parseInt(args[0]));
            winamp.hozzaAd(new Mp3("Tobi", "Tobi albuma", "Ki az a Tobi", 20));
            winamp.hozzaAd(new Mp3("Nem Tobi", "Ez se az albuma", "Passz", 12));
            winamp.hozzaAd(new Videoclip("Taka", "Takata", "Ratakata", 5,
                    5,10 ));
            winamp.hozzaAd(new Videoclip("ASd", "qwe", "asdqwe",
                    4, 5,5));

            int osszhossz = 0;

            for (Mp3 mp3: winamp.mp3s) {
                winamp.info(mp3);
                osszhossz += mp3.getDalHossz();
            }

            System.out.println("Az átlag hossz: " + osszhossz/winamp.mp3s.length);

        } catch (ArrayIndexOutOfBoundsException e) {
            e.fillInStackTrace();
        }



    }

}
