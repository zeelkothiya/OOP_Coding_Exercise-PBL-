//AIM
/*Write a Java program to simulate a Music Playlist using LinkedList<String>. Perform the
following operations:
1. Add songs to the playlist.
2. Display the full playlist.
3. Play the first song (remove from front).
4. Skip the last song (remove from end).
5. Display the updated playlist after each operation. */

import java.util.*;

public class practical31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();

        System.out.println("Enter 5 songs:");
        for(int i = 0; i < 5; i++) {
            playlist.add(sc.nextLine());
        }

        System.out.println("Playlist: " + playlist);

        if(!playlist.isEmpty()) {
            System.out.println("Playing first song: " + playlist.removeFirst());
            System.out.println("After playing: " + playlist);
        }

        if(!playlist.isEmpty()) {
            System.out.println("Skipping last song: " + playlist.removeLast());
            System.out.println("After skipping: " + playlist);
        }
    }
}
