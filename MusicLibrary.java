import java.util.ArrayList;
import java.util.Random;

class MusicLibrary {
    private ArrayList<String> songs;

    public MusicLibrary() {
        songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
        System.out.println("Added song: " + song);
    }

    public void removeSong(String song) {
        if (songs.remove(song)) {
            System.out.println("Removed song: " + song);
        } else {
            System.out.println("Song not found: " + song);
        }
    }

    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs available to play!");
            return;
        }
        Random rand = new Random();
        int index = rand.nextInt(songs.size());
        System.out.println("Playing: " + songs.get(index));
    }

    public void showLibrary() {
        System.out.println("\nMusic Library: " + songs);
    }
}


