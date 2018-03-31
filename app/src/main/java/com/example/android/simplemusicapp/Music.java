package com.example.android.simplemusicapp;

/**
 * Created by Xan on 2018. 03. 26..
 */

public class Music {
    //type of the music
    private String mType;
    //artist of the music
    private String mArtist;
    //cover of the music
    private int mCover;

    public Music(String type, String artist, int cover) {
        mType = type;
        mArtist = artist;
        mCover = cover;
    }
    //get the type of the music
    public String getmType() {
        return mType;
    }
    //get the artist of the music
    public String getmArtist() {return mArtist;}
    //get the cover of the music
    public  int getmCover() {return mCover;}

}
