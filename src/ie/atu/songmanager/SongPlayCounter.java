package ie.atu.songmanager;

// SongPlayCounter class
class SongPlayCounter {
    private int totalPlays;

    // Constructor
    public SongPlayCounter() {
        this.totalPlays = 0;
    }

    // Method 1: Increment plays by 1 (single play)
    public void incrementPlay() {
        totalPlays++;
    }

    // Method 2: Increment plays by a specified number
    public void incrementPlay(int numberOfPlays) {
        if (numberOfPlays > 0) {
            totalPlays += numberOfPlays;
        }
    }

    // Method 3: Increment plays for a specified number of users
    public void incrementPlay(int numberOfPlays, int numberOfUsers) {
        if (numberOfPlays > 0 && numberOfUsers > 0) {
            totalPlays += numberOfPlays * numberOfUsers;
        }
    }

    // Method to get the total number of plays
    public int getTotalPlays() {
        return totalPlays;
    }
}