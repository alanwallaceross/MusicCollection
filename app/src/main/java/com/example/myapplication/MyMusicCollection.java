package com.example.myapplication;

import java.util.ArrayList;

public class MyMusicCollection {

    ArrayList<MusicTrack> musicTracks;

    public MyMusicCollection(){
        musicTracks = new ArrayList<MusicTrack>();
    }

    public ArrayList<MusicTrack> getMusicTracks() {
        return musicTracks;
    }

    public void addToMusicTracks(MusicTrack track){
        getMusicTracks().add(track);
    }
}
