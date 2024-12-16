package ie.atu.songmanager;

// Class representing a Rock Song, extends the SongInfo class
public class RockSong extends SongInfo {
    
    // Constructor to initialize the title, artist, and album of the Rock Song
    public RockSong(String title, String artist, String album) {
        super(title, artist, album); // Call the constructor of the Song class to set title, artist, and album
    }
    
    // Implement the abstract method to return the album name
    @Override
    public String getAlbum() {
        return album; // Return the album of the song
    }
}
