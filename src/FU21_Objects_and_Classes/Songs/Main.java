package FU21_Objects_and_Classes.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Songs> songsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] songsArray = scanner.nextLine().split("_");
            String command = songsArray[0];
            String nameSong = songsArray[1];
            String timeSong = songsArray[2];

            Songs songsMain = new Songs(command, nameSong, timeSong);
            songsList.add(songsMain);
        }
        String commandTrue = scanner.nextLine();

        for (Songs song : songsList) {
            if (commandTrue.equals(song.getCommand())) {
                System.out.printf("%s\n", song.getNameSong());
            }
            if (commandTrue.equals("all")) {
                System.out.printf("%s\n", song.getNameSong());
            }
        }
    }
}

