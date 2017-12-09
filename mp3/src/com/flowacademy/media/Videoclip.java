package com.flowacademy.media;

public class Videoclip extends Mp3 {

    private int videoHossz;
    private int videoSzeles;

    public Videoclip(String eloado, String album, String szamCime,
                     int dalHossz, int videoHossz, int videoSzeles) {
        super(eloado, album, szamCime, dalHossz);
        this.videoHossz = videoHossz;
        this.videoSzeles = videoSzeles;
    }

    public int getVideoHossz() {
        return videoHossz;
    }

    public void setVideoHossz(int videoHossz) {
        this.videoHossz = videoHossz;
    }

    public int getVideoSzeles() {
        return videoSzeles;
    }

    public void setVideoSzeles(int videoSzeles) {
        this.videoSzeles = videoSzeles;
    }

    @Override
    public String toString() {
        return super.toString() +
                " a képmérete pedig: " +
                getVideoSzeles() + 'X' + getVideoHossz()
                ;
    }
}
