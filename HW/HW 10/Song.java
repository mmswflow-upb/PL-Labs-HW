public class Song{
    
    private String title;
    private String artist;
    private Double duration;
    private String genre;

    public Song(String t, String art, Double dur, String gen){

        this.title = t;
        this.artist = art;
        this.duration = dur;
        this.genre = gen;
    }

    public String getTitle(){

        return this.title;
    }
    public String getArtist(){

        return this.artist;
    }
    public Double getDuration(){

        return this.duration;
    }
}
