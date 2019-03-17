package com.example.myapplication;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyMusicCollection {

    private ArrayList<MusicTrack> musicTracks;
    private ArrayList<String> musicTrackArtists;
    private ArrayList<String> musicTrackNames;

    public MyMusicCollection(){
        musicTracks = new ArrayList();
        musicTrackArtists = new ArrayList();
    }

    public ArrayList<MusicTrack> getMusicTracks() {
        return musicTracks;
    }

    public ArrayList getMusicTrackNames(){
        return musicTrackNames;
    }

    public ArrayList getMusicTrackArtists(){
        return musicTrackArtists;
    }

    public void addToMusicTracks(MusicTrack track){
        getMusicTracks().add(track);
//        getMusicTrackNames().add(track.getTrackName());
//        getMusicTrackArtists().add(track.getArtistName());
    }
    public void addToMusicTrackNames(MusicTrack track){
        getMusicTrackNames().add(track.getTrackName());
    }

    public void addToMusicTrackArtists(MusicTrack track){
        getMusicTrackArtists().add(track.getArtistName());
    }


}
