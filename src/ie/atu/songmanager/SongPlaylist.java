package ie.atu.songmanager;

import java.util.List;
import java.util.ArrayList;

// Class representing a song playlist
public class SongPlaylist {
    private List<MusicLibrary2> songs; // List to store songs in the playlist
    
    // Constructor to initialize the playlist
    public SongPlaylist() {
        this.songs = new ArrayList<>(); // Initialize the empty list of songs
    }
    
    // Method to add a song to the playlist
    public void addSong(MusicLibrary2 song) {
        songs.add(song); // Add the song to the playlist
    }
    
    // Method to play all songs in the playlist
    public void playAllSongs() {
        System.out.println("\nPlaying all songs:");
        for (MusicLibrary2 song : songs) {
            song.play(); // Play each song in the playlist
        }
    }
    
    // Method to show details for each song in the playlist
    public void showSongDetails() {
        System.out.println("\nSong details:");
        for (MusicLibrary2 song : songs) {
            song.displayDetails(); // Display details of each song
            System.out.println("---------------");
        }
    }
}
