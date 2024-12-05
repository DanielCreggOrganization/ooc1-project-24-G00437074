package ie.atu.songmanager;

// Base class
class Music {
    protected String sound;

    // Constructor
    public Music(String sound) {
        this.sound = sound;
    }

    // Method to describe the music
    public void describe() {
        System.out.println("This is a type of music that makes the sound: " + sound);
    }
}

// Subclass for Rhythm
class Rhythm extends Music {
    private int beatsPerMinute;

    // Constructor
    public Rhythm(String sound, int beatsPerMinute) {
        super(sound);
        this.beatsPerMinute = beatsPerMinute;
    }

    // Overriding describe() for Rhythm
    @Override
    public void describe() {
        System.out.println("This is rhythmic music with a sound: " + sound + " and beats per minute: " + beatsPerMinute);
    }
}

// Subclass for Melody
class Melody extends Music {
    private String scale;

    // Constructor
    public Melody(String sound, String scale) {
        super(sound);
        this.scale = scale;
    }

    // Overriding describe() for Melody
    @Override
    public void describe() {
        System.out.println("This is melodic music with a sound: " + sound + " and played in the scale: " + scale);
    }
}
