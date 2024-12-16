[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17263102)
# OOC1 Project

**Title:** Song Manager
**Name:** Adam Devlin 
**Student ID:** G00437074

## Application Function

My Application, Song Manager, has a variety of things it does to ensure all 4 Pillars of OOP are used.

For Encapsulation, the code provides a basic framework for an interactive console-based application that display details of a Song Object, allowes the user to interact with a menuc and continunes to run until the user selects to quit.

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

## Roadblocks and Unfinished Functionality



## Resources

Provide links to resources used:

* [Tutorialspoint](https://www.tutorialspoint.com/java/) - Java Tutorials site I found helpful
