package ie.atu.songmanager;

// Abstract class representing a SongInfo
public abstract class SongInfo {
    protected String title;  // Title of the song
    protected String artist; // Artist who performed the song
    protected String album;  // Album the song is part of
    
    // Constructor to initialize the song with its title, artist, and album
    public SongInfo(String title, String artist, String album) {
        this.title = title;
        this.artist = artist;
        this.album = album;
    }
    
    // Abstract method to return the album name (which will be implemented by subclasses)
    public abstract String getAlbum();
    
    // Method to display the song details (title, artist, and album)
    public void displayDetails() {
        System.out.println("Song: " + title + " by " + artist);
        System.out.println("Album: " + album);
    }
}