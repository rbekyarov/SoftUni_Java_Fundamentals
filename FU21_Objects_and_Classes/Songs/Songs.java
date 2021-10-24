package FU21_Objects_and_Classes.Songs;

public class Songs {
    private String command;
    private String nameSong;
    private String timeSong;

    public Songs(String command, String nameSong, String timeSong) {
        this.command = command;
        this.nameSong = nameSong;
        this.timeSong = timeSong;
    }
    public String getNameSong() {
        return nameSong;
    }
    public String getCommand() {
        return command;
    }
}
