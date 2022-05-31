import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    private LinkedList<Song> playlist = new LinkedList<Song>();


    public boolean addSong(Song song){
        // check if a song is in a playlist
        if(findSong(song)){
            System.out.println("Song already in playlist");
            return false;
        }

        // add the song
        playlist.add(song);
        System.out.println("Song successfully added to playlist");
        return true;
    }

    public void removeSong(Song song){
        playlist.remove(song);
    }

    private boolean findSong(Song song){
        return playlist.contains(song);
    }


}
