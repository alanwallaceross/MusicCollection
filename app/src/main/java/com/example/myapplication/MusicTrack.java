package com.example.myapplication;

public class MusicTrack {

    private String trackName;
    private String artistName;
    private int trackRunningTime;

    public MusicTrack(){
        trackName = "";
        artistName = "";
        trackRunningTime = 0;
    }

    public MusicTrack(String trackName, String artistName, int trackRunningTime){
        this.trackName = trackName;
        this.artistName = artistName;
        this.trackRunningTime = trackRunningTime;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getTrackRunningTime() {
        return trackRunningTime;
    }

    public void setTrackRunningTime(int trackRunningTime) {
        this.trackRunningTime = trackRunningTime;
    }

    public String printDetailsOfTrack(){
        System.out.println("Track name: " + this.getTrackName());
        System.out.println("Artist name: " + this.getArtistName());
        System.out.println("Running time: " + this.getTrackRunningTime());
        return "Track name: " + this.getTrackName() + "Artist name: " + this.getArtistName() + "Running time: " + this.getTrackRunningTime();
    }
}
