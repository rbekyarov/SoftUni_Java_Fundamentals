package FU28_Exercise_Text_Processing;

import java.util.Scanner;

public class p3ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] path = scanner.nextLine().split(":?\\\\");
        String text = path[path.length-1] ;
        String[]result = text.split("\\.");
        System.out.println("File name: "+result[0]);
        System.out.println("File extension: "+result[1]);
            //String path = scanner.nextLine();
            //
            //System.out.printf("File name: %s%n", path.substring(path.lastIndexOf('\\') + 1, path.lastIndexOf('.')));
            //System.out.printf("File extension: %s%n", path.substring(path.lastIndexOf('.') + 1));
    }
}
