package ie.atu.songmanager;

public class SongWithDuration extends MusicLibrary {
    private int duration;  // New instance variable for duration in seconds
    
    // Constructor to initialize the SongWithDuration object with title, artist, year, and duration
    public SongWithDuration(String title, String artist, int year, int duration) {
        super(title, artist, year);  // Call the parent constructor
        this.duration = duration;    // Initialize the duration
    }
    
    // Override the play method to include duration when playing the song
    @Override
    public void play() {
        System.out.println("Playing the song: \"" + title + "\" by " + artist + ". Duration: " + duration + " seconds.");
    }
    
    // New method to display the song's duration
    public void displayDuration() {
        System.out.println("The duration of the song \"" + title + "\" is: " + duration + " seconds.");
    }
    
    // Override the getInfo method to include duration information
    @Override
    public String getInfo() {
        return "\"" + title + "\" by " + artist + " (" + year + "), Duration: " + duration + " seconds.";
    }
}
