package com.hyperclock.prashant.simplemultiscreenapplication;

public class Song {
    private String mName;
    private String mArtist;
    private String mGenre;

    public Song(String mName, String mArtist, String mGenre) {
        this.mName = mName;
        this.mArtist = mArtist;
        this.mGenre = mGenre;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmArtist() {
        return mArtist;
    }

    public void setmArtist(String mArtist) {
        this.mArtist = mArtist;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }
}
