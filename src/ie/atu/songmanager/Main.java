package ie.atu.songmanager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Part 1: Encapsulation

        // Create Object
        Song songObject1 = new Song(1, "Rainbow", 85, 3.33);
        System.out.println(songObject1.getidNumber());
        System.out.println(songObject1.getName());
        System.out.println(songObject1.getnumberOfPlays());
        System.out.println(songObject1.getlength());

        // Create a Scanner
        Scanner userInput = new Scanner(System.in);
        int userSelection = 0; // Used to store user Menu option selection

        // Create infinite while loop to display Menu after every command
        while (true) {
            // Display Menu to console
            System.out.println("");
            System.out.println("###############################");
            System.out.println("#  Studient Applicarion v0.9  #");
            System.out.println("###############################");
            System.out.println("(1) Add an Artist.");
            System.out.println("(2) Delete an Artist.");
            System.out.println("(3) Show total Number of Artists");
            System.out.println("(4) Search for Artist by ID.");
            System.out.println("(5) Quit.");
            System.out.println("Select an option from 1 to 5 and press Enter");

            // Store user Menu option selection
            userSelection = userInput.nextInt();

            if (userSelection == 5) { // Quit

                System.out.println("Student Application Closing - Goodbye!");
                // Close the User Input Scanner
                userInput.close();
                break; // Break out of display infinite loop

            } // End of if

        } // End of While

        System.out.println(); // Break

        // Part 2: Inheritance

        // Create an instance of Genre
        Genre songObject2 = new Genre("Like a Prayer", "Pop Rock");

        // Call the play() method
        songObject2.play();

        // Call the describeGenre() method
        songObject2.describeGenre();

        System.out.println(); // Break

        // Part 3: Polymorphism / Heterogeneous Collections

        // Create a basic Song
        MusicLibrary basicSong = new MusicLibrary("Bad Romance", "Lady Gaga", 2009);
        basicSong.play();
        System.out.println(basicSong.getInfo());

        System.out.println(); // Break

        // Create a SongWithDuration object
        SongWithDuration extendedSong = new SongWithDuration("Break My Soul", "Beyonce", 2022, 278); // Duration in
                                                                                                     // seconds
        extendedSong.play(); // This will include the duration in the output
        System.out.println(extendedSong.getInfo()); // This will include the duration in the info

        System.out.println(); // Break

        // Create a SongWithReleaseDate object (with release date)
        SongWithReleaseDate extendedSongWithReleaseDate = new SongWithReleaseDate("Blinding Lights", "The Weeknd", 2019,
                "November 29, 2019");
        extendedSongWithReleaseDate.play(); // This will include the release date in the output
        System.out.println(extendedSongWithReleaseDate.getInfo()); // This will include the release date in the info

        System.out.println(); // Break

        // Create a SongPlaylist object
        SongPlaylist playlist = new SongPlaylist();

        // Create MusicLibrary objects (representing songs) and add them to the playlist
        MusicLibrary2 song1 = new MusicLibrary2("Can't Get You Out of My Head", "Kylie Minogue");
        MusicLibrary2 song2 = new MusicLibrary2("Say My Name", "Destiny's Child");
        MusicLibrary2 song3 = new MusicLibrary2("Levitating", "Dua Lipa");

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        // Play all songs in the playlist
        playlist.playAllSongs();

        // Show details of all songs in the playlist
        playlist.showSongDetails();

        System.out.println(); // Break

        // Part 4: Abstration

        // Create a PopSong with title, artist, and album
        SongInfo popSong = new PopSong("Toxic", "Britney Spears", "In The Zone");

        // Display the details of the PopSong
        popSong.displayDetails();

        System.out.println(); // Break

        // Create a RockSong with title, artist, and album
        SongInfo rockSong = new RockSong("Bohemian Rhapsody", "Queen", "A Night at the Opera");

        // Display the details of the RockSong
        rockSong.displayDetails();

    } // End of Main Method

} // End of Main Class
