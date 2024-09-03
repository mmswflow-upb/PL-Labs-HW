import java.util.Random;

public class Playlist{
    
    private Song[] playlist;
    
    public Playlist(){

        this.playlist = new Song[0];
    }

    public void addSong(Song s){

        Song[] newPlaylist = new Song[this.playlist.length+1];

        for (int i = 0; i < this.playlist.length; i++){

            newPlaylist[i] = this.playlist[i];
        }

        newPlaylist[newPlaylist.length-1] = s;

        this.playlist = newPlaylist;
    }

    public Boolean removeSong(String songName){

        Boolean res = false;
        Song[] newPlaylist;

        int removedSongs = 0;
        int k = 0;//We use this as an index to move songs from old playlist to the new one.

        for (int i = 0; i < this.playlist.length; i++){

            if (this.playlist[i].getTitle().equals(songName)){

                this.playlist[i] = null;
                res = true;
                removedSongs++;
            }     
        }
        if (removedSongs == 0){

            return res;
        }

        newPlaylist = new Song[this.playlist.length-removedSongs];

        for (int z = 0; z < this.playlist.length; z++){

            if (this.playlist[z] != null){

                newPlaylist[k] = this.playlist[z];
                k++;
            }
        }
        this.playlist = newPlaylist;
        return res;
    }

    public Double totalDuration(){

        Double res = 0.0;

        for (int i = 0; i < this.playlist.length; i++){

            res += this.playlist[i].getDuration();
        }

        return res;
    }

    public Boolean removeArtist(String artist){

        Boolean res = false;

        for (int i = 0; i < this.playlist.length; i++){

            if (this.playlist[i].getArtist().equals(artist)){

                removeSong(this.playlist[i].getTitle());
                res = true;
            }
        }

        return res;
    }
    
    public void shuffle(){

        Song temp;

        for (int i = 0; i < this.playlist.length; i++){

            Random rand = new Random();
            int randNum = rand.nextInt(this.playlist.length);

            temp = this.playlist[randNum];
            this.playlist[randNum] = this.playlist[i];
            this.playlist[i] = temp;
        }
    }

    public String displayPlaylist(){

        String res = "";

        for (int i = 0; i < this.playlist.length; i++){

            res +=  this.playlist[i].getTitle() + ", ";
        }
        return res + "\n";
    }
}