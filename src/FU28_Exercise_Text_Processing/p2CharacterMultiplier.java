package FU28_Exercise_Text_Processing;

import java.util.Scanner;

public class p2CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        String word1 = text[0];
        String word2 = text[1];
        int n = 0;
        int sum = 0;


      boolean  isWord1IsSmailer = false;
      boolean  isWord2IsSmailer = false;
        if(word1.length()<word2.length()){
            n=word1.length();
            isWord1IsSmailer = true;
        }else {
            n=word2.length();
            isWord2IsSmailer = true;
        }
        for (int i = 0; i <n ; i++) {
            char w1 = word1.charAt(i);
            char w2 = word2.charAt(i);
            sum +=w1*w2;
            }
        if (isWord1IsSmailer){
            for (int i = word1.length(); i <word2.length() ; i++) {
                sum +=word2.charAt(i);
            }
        }
        if (isWord2IsSmailer){
            for (int i = word2.length(); i <word1.length() ; i++) {
                sum +=word1.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
