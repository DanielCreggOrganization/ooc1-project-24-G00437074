package ie.atu.songmanager;

public class Song {

    // Instance Variables 
    private int idNumber; // Unique ID
    private String name; 
    private float numberOfPlays; 
    private double length;


    // Getter and Setter Methods
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

    public void setidNumber(int idNumber){
        this.idNumber = idNumber;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setnumberOfPlays(float numberOfPlays){
        this.numberOfPlays = numberOfPlays;
    }
    public void setlength(double Lenght){
        this.numberOfPlays = numberOfPlays;
    }




}
