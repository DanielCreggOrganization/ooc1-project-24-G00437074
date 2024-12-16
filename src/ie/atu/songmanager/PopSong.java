package ie.atu.songmanager;

// Class representing a Pop Song, extends the SongInfo class
public class PopSong extends SongInfo {

    // Constructor to initialize the title, artist, and album of the Pop Song
    public PopSong(String title, String artist, String album) {
        super(title, artist, album); // Call the constructor of the Song class to set title, artist, and album
    }

    // Implement the abstract method to return the album name
    @Override
    public String getAlbum() {
        return album; // Return the album of the song
    }
}
