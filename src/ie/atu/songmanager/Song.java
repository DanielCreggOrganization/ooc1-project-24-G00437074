package ie.atu.songmanager;

public class Song {

    // Instance Variables 
    private int idNumber; // Unique ID
    private String name; 
    private float numberOfPlays; 
    private double lengthMin; //add Minute unit

    // Constructor
    public Song(int idNumber, String name, float numberOfPlays, double length){
        this.idNumber = idNumber;
        this.name = name;
        this.numberOfPlays = numberOfPlays;
        this.lengthMin = length;
    }

    // Getter Methods
    public int getidNumber(){
        return this.idNumber;
    }

    public String getName(){
        return this.name;
    }

    public float getnumberOfPlays(){
        return this.numberOfPlays;
    }

    public double getlength(){
        return this.lengthMin;
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
        this.lengthMin = length;
    }

}
