package ie.atu.songmanager;


public class SongWithReleaseDate extends MusicLibrary {
    private String releaseDate;  // New instance variable for release date
    
    // Constructor to initialize the SongWithReleaseDate object with title, artist, year, and release date
    public SongWithReleaseDate(String title, String artist, int year, String releaseDate) {
        super(title, artist, year);  // Call the parent constructor (Song)
        this.releaseDate = releaseDate;  // Initialize the release date
    }
    
    // Override the play method to include release date when playing the song
    @Override
    public void play() {
        System.out.println("Playing the song: \"" + title + "\" by " + artist + ". Released on: " + releaseDate);
    }
    
    // New method to display the song's release date
    public void displayReleaseDate() {
        System.out.println("The song \"" + title + "\" was released on: " + releaseDate);
    }
    
    // Override the getInfo method to include release date information
    @Override
    public String getInfo() {
        return "\"" + title + "\" by " + artist + " (" + year + "), Released on: " + releaseDate;
    }
}
