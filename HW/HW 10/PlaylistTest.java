public class PlaylistTest{
    public static void main(String[] args){

        Playlist myPlaylist = new Playlist();

        Song song1 = new Song("Would","Alice in Chains", 3.27, "Grunge");
        Song song2 = new Song("Gasoline","The Weeknd", 3.32, "R&B");
        Song song3 = new Song("Clocks", "Coldplay", 5.08, "Alt Rock");
        Song song4 = new Song("A Rush of Blood to the Head", "Coldplay", 5.51 ,"Alt Rock");
        Song song5 = new Song("Thank You", "Dido", 3.38 ,"Synth-pop");
        Song song6 = new Song("Long Way", "Joyner Lucas", 3.01,"Rap");
        Song song7 = new Song("Faith", "The Weeknd", 4.43 ,"R&B");
        Song song8 = new Song("Blinding Lights", "The Weeknd", 3.2,"R&B");

        myPlaylist.addSong(song1);
        myPlaylist.addSong(song2);

        System.out.println("The playlist after adding 2 songs: ");
        System.out.println(myPlaylist.displayPlaylist());

        Boolean res = myPlaylist.removeSong(song3.getTitle());
        
        if (res == false){

            System.out.println("Couldn't remove the song named " + song3.getTitle() + "\n");
        }

        myPlaylist.addSong(song3);
        myPlaylist.addSong(song4);
        myPlaylist.addSong(song5);
        myPlaylist.addSong(song6);
        myPlaylist.addSong(song7);
        myPlaylist.addSong(song8);

        System.out.println("The Complete Playlist After Adding All Other Songs:");
        
        System.out.println(myPlaylist.displayPlaylist());

        myPlaylist.shuffle();
        System.out.println("The Shuffled Playlist ");
        System.out.println(myPlaylist.displayPlaylist());

        myPlaylist.removeArtist("The Weeknd");
        System.out.println("My playlist after removing all songs from The Weeknd: ");
        System.out.println(myPlaylist.displayPlaylist());

        //The total duration of the playlist should be 20.25 

        System.out.println("The Total Duration of our playlist is: " + myPlaylist.totalDuration());
    }
}