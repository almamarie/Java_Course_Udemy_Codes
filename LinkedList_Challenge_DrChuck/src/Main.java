import java.util.ArrayList;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {


        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on ", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("the gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);

        albums.add(album);

        album = new Album("For those bapout to rock", "AC/DC");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Stormbringer", 4.6);
        album.addSong("Stormbringer", 4.6);
        album.addSong("Stormbringer", 4.6);
        album.addSong("Stormbringer", 4.6);
        album.addSong("Stormbringer", 4.6);
        album.addSong("Stormbringer", 4.6);
        album.addSong("Stormbringer", 4.6);
        album.addSong("Stormbringer", 4.6);
    }
}
