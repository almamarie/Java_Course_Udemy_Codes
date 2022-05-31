import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Album> albums = new ArrayList<Album>();
    private Playlist playlist = new Playlist();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        printInstructions();
        int choice;
        boolean quit = false;

        while (!quit){
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    addSongToAlbum();
                    break;
                case 2:
                    addSongToPlayList();
                    break;
                case 3:
                    moveForward();
                case 4:
                    moveBackward();
                    break;
                case 5:
                    repeatSong();
                    break;
                case 6:
                    removeSongPlaylist();
                    break;
                case 7:
                    removeSongAlbum();
                    break;
                case 8:
                    printInstructions();
            }
        }

    }
}
