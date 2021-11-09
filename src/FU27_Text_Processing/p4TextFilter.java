package FU27_Text_Processing;

import java.util.Scanner;

public class p4TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []forbiddenWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for(String forbiddenWord :forbiddenWords){
            String wordForStars = convertToStars(forbiddenWord);
           text =  text.replace(forbiddenWord,wordForStars);
        }
        System.out.println(text);
    }

    private static String convertToStars(String forbiddenWord) {
        String starsResult = "";
        for (int i = 0; i <forbiddenWord.length() ; i++) {
            starsResult += "*";
        }
        return starsResult;
    }
}
