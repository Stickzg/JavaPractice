package com.flowacademy.kolcsonzo;

import com.flowacademy.kolcsonzo.Exceptions.NotfoundException;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Videoteka implements Serializable {

    Map<String, Video> videok = new HashMap();
    Map<String, OktatoVideo> oktatoVideok = new HashMap();

    public Videoteka() {
    }

    public void hozzaAd(Video video) {
        if ( video instanceof OktatoVideo ) {
            oktatoVideok.put(video.getFilmCime(), (OktatoVideo) video);
        } else {
            videok.put(video.getFilmCime(), video);
        }
    }

    public Video keres (Boolean oktato, String videoCim) throws NotfoundException {
            if ( oktato ) {
                return keres(videoCim, oktatoVideok );
            }
                return keres(videoCim, videok);
    }

    private <E extends Video>Video keres (String cím, Map<String,E> videoMap ) throws NotfoundException {
        if ( videoMap.containsKey(cím) ) {
            return videoMap.get(cím);
        } else {
            throw new NotfoundException("Nincs a tékában.");
        }
    }

}
