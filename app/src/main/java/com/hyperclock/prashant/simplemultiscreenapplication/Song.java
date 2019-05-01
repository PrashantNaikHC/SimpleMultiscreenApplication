package com.hyperclock.prashant.simplemultiscreenapplication;

public class Song {
    private String mName;
    private String mArtist;
    private String mGenre;
    private int mImageId;

    public Song(String mName, String mArtist, String mGenre, int mImageId) {
        this.mName = mName;
        this.mArtist = mArtist;
        this.mGenre = mGenre;
        this.mImageId = mImageId;
    }

    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
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
