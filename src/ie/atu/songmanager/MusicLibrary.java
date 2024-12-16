package ie.atu.songmanager;

//  Polymorphosism - Heterogeneous Collections

public class MusicLibrary {
    // Instance variables to store the song's title, artist, and release year
    protected String title;
    protected String artist;
    protected int year;

    // Constructor to initialize the Song object with title, artist, and year
    public MusicLibrary(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    // Method to play the song
    public void play() {
        System.out.println("Playing the song: " + title + " by " + artist);
    }

    // Method to stop the song
    public void stop() {
        System.out.println("Stopping the song: " + title);
    }

    // Method to get the song's information in a string
    public String getInfo() {
        return "\"" + title + "\" by " + artist + " (" + year + ")";

    }
}