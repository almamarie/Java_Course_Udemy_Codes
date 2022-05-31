import java.util.ArrayList;
import java.util.Objects;

public class Album {
    private String name;
    private ArrayList<Song> album;

    public Album(String name) {
        this.name = name;
        album = new ArrayList<Song>();
    }

    public static Album createAlbum(String name){
        return new Album(name);
    }

    // add a new song
    public boolean addSong(Song newSong){
        // check if song is in album
        if(findSong(newSong)){
            System.out.println("Song already in album");
            return false;
        }

        album.add(newSong);
        System.out.println("Song successfully added to album");
        return true;
        // add song to album
    }

    // remove a song
    public boolean removeSong(String songToRemove){
        Song song = findSong(songToRemove);
        if(song == null){
            System.out.println("Cannot find song in system");
            return false;
        }
        album.remove(song);
        System.out.println("Song removed successfully");
        return true;
    }

    public void printAllSongsTitles(){
        for(Song song : album){
            System.out.println(song.getTitle());
        }
    }

    public void printAllSongsTitlesAndDuration(){
        for(Song song : album){
            System.out.println(song.getTitle() + "\t\t" + song.getDuration());
        }
    }

    private boolean findSong(Song song){
        return album.contains(song);
    }

    public Song findSong(String songTitle){
        for( Song song : album){
            if(Objects.equals(song.getTitle(), songTitle)){
                return song;
            }
        }
        return null;
    }
}
