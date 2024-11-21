package ie.atu.songmanager;

public class Song {

    // Instance Variables 
    private int idNumber; // Unique ID
    private String name; 
    private float numberOfPlays; 
    private double length;

    // Constructor
    public Song(int idNumber, String name, float numberOfPlays, double length){
        this.idNumber = idNumber;
        this.name = name;
        this.numberOfPlays = numberOfPlays;
        this.length = length;
    }

    // Getter Methods
    public int getidNumber(){
        return this.idNumber;
    }

    public String name(){
        return this.name;
    }

    public float numberOfPlays(){
        return this.numberOfPlays;
    }

    public double length(){
        return this.length;
    }

    // Setter Methods
    public void setidNumber(int idNumber){
        this.idNumber = idNumber;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setnumberOfPlays(float numberOfPlays){
        this.numberOfPlays = numberOfPlays;
    }
    public void setlength(double length){
        this.numberOfPlays = numberOfPlays;
    }

    



}
