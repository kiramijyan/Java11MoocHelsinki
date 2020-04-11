
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String initialArtist, String initialName, int initialDurationInSeconds) {
        this.artist = initialArtist;
        this.name = initialName;
        this.durationInSeconds = initialDurationInSeconds;
    }

    public boolean equals(Object compared){
        
        if (this == compared){
            return true;
        }

        
        if(!(compared instanceof Song)){
            return false;
        }
        
        Song objSong = (Song)compared;
        
        if(this.name.equals(objSong.name) 
                && this.artist.equals(objSong.artist)
                && this.durationInSeconds == objSong.durationInSeconds){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
}
