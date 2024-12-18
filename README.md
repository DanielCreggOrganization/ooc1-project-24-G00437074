[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17263102)
# OOC1 Project

**Title:** Song Manager
**Name:** Adam Devlin 
**Student ID:** G00437074

## Application Function

My Application, Song Manager, has a variety of things it does to ensure all 4 Pillars of OOP are used.

For Encapsulation, the code provides a basic framework for an interactive console-based application that display details of a Song Object, allowes the user to interact with a menu and continues to run until the user selects to quit.

For Inheritance, the code demonstrates how inheritance can be used, where the Genre class inherits methods from the parent class (Song) and add it's own functionality specific to the song's genre.

For Polymorphism, this code demonstrates basic concepts of OOP, including inheritance, compositon and method overriding. 

And for Abstration, the code here demonstrates abstraction, where the SongInfo abstract class defines common properties and behaviour for songs, while subclasses like PopSong and RockSong provide specific implementations for how to display song details.


## Running the Application

Provide step by step instructions on how to run your applicaiton. Are there any prerequisite softwares required?

```list
List the instructions step by step
    1. Create the project folder (e.g. Song Manager)
    2. Create your main class, Main.java.
    3. Write the Classes 
        - Song.java
        - Genre.java
        - MusicLibrary.java
        - MusicLibrary2.java
        - Main.java
        - SongWithDuration.java
        - SongWith ReleaseData.java
        - SongPlaylist.java
        - SongInfo.java
        - PopSong.java
        - RockSong.java
        - Note: Make sure all methods (e.g. play(), getInfo() etc.) are implemented in these classes.
    4. Compile your Java Code (if everything is set up correctly, it will generate all .class files in your project.)
    5. Run the Application
    6. Interact with the Application
        - Change inputs, add an artist, delete an artist etc.
    7. Debugging (if there are any errors, fix them based on error messages and try again)
    7. Closing the Program (To quit press 5)

```

## Minimum Project Requirements

Describe how you have met all minimum project requirements below:

* The repository contains, at minimum, two commits per week (Note: There should be many commits per day coding). DONE
* The project, including code and documentation, is fully contained in the provided GitHub Classroom repository. DONE
* Methods = Add Item, Remove Item, Update Item, Find total items, Search Items and Quit. DONE
* The code MUST compile. DONE
* The application code must be formatted in a consistent and standard way. DONE
* The code must contain comments. One comment per class, method and variable at minimum. DONE
* The documentation and commentary must be free of a grammar and speling mistakes. DONE

## Project Requirements above and beyond

Throughout the development of my Song Manager application, I aimed to meet the basic requirements of the Object-Oriented Programming project while also incorporating features and design principles that enhanced the application's functionality. I tried to take care in the way I structured the project in a way that follows OOP for flexibility and easy maintenance.

## Application Architecture

Discuss in detail how the application is structured. List all classes and describe their purpose. List all methods and describe what they do.

1. Encapsulation and Data Hiding

    I made sure to follow the principle of encapsulation, which is central to OOP. I encapsulated the properties of the Song class by making them private and provided getter methods to retrieve them. This approach ensures that the internal state of an object is protected from direct access, allowing for more controlled manipulation of data.

    For example, in the Song class, the fields like idNumber, name, and length are private, and public methods like getidNumber(), getName(), getnumberOfPlays(), and getlength() are used to access these values. This practice aligns with the concept of data encapsulation.

2. Inheritance and Extending Functionality

    One area where I strived to demonstrate inheritance was with the different types of songs and their unique behaviors. I created subclasses like SongWithDuration, SongWithReleaseDate, and Genre, which extended the functionality of the base Song class.

    For instance, the SongWithDuration class extends the MusicLibrary class and adds the feature of song duration in seconds, while the SongWithReleaseDate class extends functionality by including a release date. These subclasses not only allowed for specialization but also showed how inheritance can be used to extend existing functionality without modifying the base class.

3. Polymorphism and Method Overriding

    I applied polymorphism by creating methods like play() and getInfo() that were used across different types of songs. This method allowed me to demonstrate how a single method call can trigger different behavior depending on the object type (whether it’s a PopSong, RockSong, or MusicLibrary).

    For example, the play() method is inherited by all song classes but provides different implementations depending on the type of song. This approach allowed me to handle various song types in a uniform way, showing the power of polymorphism in OOP.

4. Abstraction and Simplifying Interfaces

    To make the system more flexible and maintainable, I introduced abstraction in the form of the SongInfointerface (or abstract class). This allowed me to define common behaviors for all songs (like displaying song details), while each song type (PopSong, RockSong, etc.) provides its specific implementation.

    This also paved the way for adding new song types in the future without modifying existing code, which is a hallmark of good OOP design. The displayDetails() method is a good example of abstract behavior that can be customized in each subclass, ensuring that each song type displays its unique details.

5. Creating a Playlist and Managing Multiple Songs

    I implemented a playlist system to manage multiple songs, using a SongPlaylist class that can store and play multiple MusicLibrary objects (or songs). This is useful for future expansions, like adding features for sorting songs, removing songs, or adding more song-related behaviors.

    The SongPlaylist class is an example of how I used a heterogeneous collection to store different types of songs (using the common SongInfo interface or base class) and perform operations on them collectively, like playing or showing song details.

6. User Interaction and Menu-Driven System

    A user menu system was implemented to interact with the user, providing options to perform different actions like adding or deleting artists. While this might not be overly complex, it added interactivity and allowed me to implement a looping menu system, which is useful for applications with a repetitive task flow.

    The use of the Scanner class to handle user input allows for a more dynamic interaction, letting the user decide what actions to take within the application.

List of Classes and their Purposes:
    
        - Genre.java - This class extends Song.java to inherit the genre and song title to print the genre of the song entered.
        - Main.java - Base class for every other class to interact with and print the output of each class.
        - MusicLibrary.java - I created this class to showcase Polymoprhism/Heterogeneous Collections. Here you have instance variables
                            to store song's info, constructer to initiliaze and 3 methods to play the song, stop the song and a method to
                            print out the song's info in a string.
        - MusicLibrary2.java - I had to create a second MusicLibary class (MusicLibrary2.java) because I couldn't figure out how to get
                            the code to work in the initial class I created. I created this for the SongPlaylist.java class to print a list
                            of songs in a playlist.
        - PopSong.java - Class representing a Pop Song, extends the SongInfo class, with a constructor to initialize song, and also
                        using Override to abstract method to return the song's album name.
        - RockSong.java - Same as above, a class representing a Rock Song, extends the SongInfo class, uses abstration to return album
                        name.
        - Song.java - Created this class to showcase both Encapsulation and Inheritance. Here you have a constructor, getter and setter
                    methods that interact with the Main.java class. You also have another constructor to set the song's title and print 
                    the output.
        - SongInfo.java - Abstract class representing a SongInfo, here you have constructor to initialize song's info, an abstract method 
                        to return the song's album name and to display the song's details.
        - SongPlaylist.java - Class representing a song playlist, using a list to store the song's in the playlist. Here, there is a 
                            constructor to initialize playlist, method to add a song to the playlist, method to play all the songs in the
                            playlist and a method to list all the songs in the playlist.
        - SongWithDuration.java - This class was created for the Heterogeneous Collection to print the song's duration in the output.  
                                It extends the MusicLibrary.java class. Included in this clas is a constructor to initialize info, and Override method to include the duration when playing the song and a second Override method to override the getInfo() method to include duration.
        - SongWith ReleaseData.java - Same as above, class created for the Hetergenous Collection to print the song's release date. It
                                    extends the MusicLibrary.java class. Included in this clas is a constructor to initialize info, and Override method to include the song's release date when playing the song and a second Override method to override the getInfo() method to include durrelease date.

List of Method's and their Functions:
        - public void describeGenre // Method to print the genre of the song
        - songObject2.play(); // Call the play() method
        - songObject2.describeGenre(); // Call the describeGenre() method
        - basicSong.play(); // plays song in output
        - extendedSong.play(); // This will include the duration in the output
        - extendedSongWithReleaseDate.play(); // This will include the release date in the output
        - playlist.addSong(song1); // Adds song to playlist list
        - playlist.playAllSongs(); // Play all songs in the playlist
        - playlist.showSongDetails(); // Show details of all songs in the playlist
        - popSong.displayDetails(); // Display the details of the PopSong
        - rockSong.displayDetails(); // Display the details of the RockSong
        - public void play() // Method to play the song
        - public void stop() // Method to stop the song
        - public String getInfo() // Method to get the song's information in a string
        - public void displayDetails() // Method to display details of the song
        -  @Override
            public String getAlbum() {
                return album; // Return the album of the song
             }
        - public abstract String getAlbum() // Abstract method to return the album name (which will be implemented by subclasses)
        - public void displayDetails() // Method to display the song details (title, artist, and album)
        - public void addSong(MusicLibrary2 song) // Method to add a song to the playlist
        - public void playAllSongs() // Method to play all songs in the playlist
        - public void showSongDetails() // Method to show details for each song in the playlist
        - @Override
             public void play() // Override the play method to include duration when playing the song
        -  public void displayDuration() // New method to display the song's duration
        - @Override
            public String getInfo() // Override the getInfo method to include duration information
        - public void displayReleaseDate() // New method to display the song's release date
        - @Override
            public String getInfo() // Override the getInfo method to include release date information
    

## Roadblocks and Unfinished Functionality

While I tried my best to implement these features, I have to admit that OOP is still a new concept for me and I found the whole process challenging. I am working to build my confidence and understanding in this area, however I did have to heavily rely on the labs and online resources to help me complete this project.

I found it hard to get my head around the relationships between classes and how to extend functionality. I wasn't sure whether I was structuring my inheritance relationships correctly, especially when trying to decide when to use inheritance. However, I did try my best to apply the principles in the way I designed the song types and their subclasses.

I also found the concept of method overriding and polymorphism challenging. For example, deciding when to use an overriden method versus keeping a base class was confusing. 

## Resources

Provide links to resources used:

* [Tutorialspoint](https://www.tutorialspoint.com/java/) - Java Tutorials site I found helpful
* [W3Schools](https://www.w3schools.com/java/java_oop.asp)
* [Linkedin](https://www.linkedin.com/learning/programming-foundations-object-oriented-design-3?trk=learning-topics_trending-courses_related-content-card&upsellOrderOrigin=default_guest_learning) - Linkedln course I completed to help me understand OOP more
* [ChatGBT](https://chatgpt.com/)
* [Mozilla Developer](https://developer.mozilla.org/en-US/)
* [ChatGBT](https://chatgpt.com/)




