package ie.atu.songmanager;

public class Genre extends Song {
    private String genreName;

    // Constructor to initialize the genre and song title
    public Genre(String title, String genreName) {
        super(title); // Set the song title
        this.genreName = genreName;
    }

    // Method to print the genre of the song
    public void describeGenre() {
        System.out.println("This song belongs to the \"" + genreName + "\" genre.");
    }
}