package ie.atu.songmanager;

public class MusicLibrary2 {
    private String title;  // Title of the song
    private String artist; // Artist who performed the song
    
    // Constructor to initialize the song with its title and artist
    public MusicLibrary2(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    
    // Method to play the song
    public void play() {
        System.out.println("Playing: " + title + " by " + artist);
    }
    
    // Method to display details of the song
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
    }
}