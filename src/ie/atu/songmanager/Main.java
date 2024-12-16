package ie.atu.songmanager;

//import java.util.ArrayList;
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
                // Close the USer Input Scanner
                userInput.close();
                break; // Break out of display infinite loop

                 // Part 3: Polymorphism



    } // End of if

    } // End of While

    System.out.println();

    // Part 2: Inheritance

    // Create an instance of Genre
    Genre songObject2 = new Genre("Like a Prayer", "Pop Rock");

    // Call the play() method
    songObject2.play();

    // Call the describeGenre() method
    songObject2.describeGenre();

    System.out.println();

    // Part 3: Polymorphism / Heterogeneous Collections

     // Create a basic Song
      MusicLibrary basicSong = new MusicLibrary("Bad Romance", "Lady Gaga", 2009);
      basicSong.play();
      System.out.println(basicSong.getInfo());

      System.out.println();

      // Create a SongWithDuration object
      SongWithDuration extendedSong = new SongWithDuration("Break My Soul", "Beyonce", 2022, 278);  // Duration in seconds
      extendedSong.play();  // This will include the duration in the output
      extendedSong.displayDuration();  // This will display the duration
      System.out.println(extendedSong.getInfo());  // This will include the duration in the info

    // Part 4: Abstration

} // End of Main Method

} // End of Main Class
