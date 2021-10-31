package FU21_Objects_and_Classes.RE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p4Songs {

    static class Songs {
        String type;
        String name;
        String time;

        public void setType(String type) {
            this.type = type;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Songs> listSong = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] arrSong = scanner.nextLine().split("_");
            String type = arrSong[0];
            String name = arrSong[1];
            String time = arrSong[2];

            Songs currentSong = new Songs();

            currentSong.setType(type);
            currentSong.setName(name);
            currentSong.setTime(time);

            listSong.add(currentSong);// добавям в листа
        }
         String command = scanner.nextLine();// all / typeList
        if (command.equals("all")){
            for (Songs item : listSong){
                System.out.println(item.getName());
            }
        }else {
            for (Songs item : listSong){
                if (item.getType().equals(command)){//ако типа е равен на командата
                    System.out.println(item.getName());
                }
            }
        }
    }
}
