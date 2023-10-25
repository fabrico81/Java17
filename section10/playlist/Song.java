package section10.playlist;

public class Song {

    private String songTitle;
    private double duration;
    public Song(String songTitle, double duration) {
        this.songTitle = songTitle;
        this.duration = duration;
    }

    public String getTitle() {
        return this.songTitle;
    }

    @Override
    public String toString() {
        return this.songTitle + ": " + this.duration;
    }
}
