/*
1.	Encrypt, Sort and Print Array
        Write a program that reads a sequence of strings from the console. Encrypt every string by summing:
        •	The code of each vowel multiplied by the string length
        •	The code of each consonant divided by the string length
        Sort the number sequence in ascending order and print it on the console.
        On first line, you will always receive the number of strings you have to read.
*/
/*
INPUT   OUTPUT
4
Peter    1032
Maria    1071
Katya    1168
Todor    1532
*/

package FU12_Exercise_Arrays.MoreExercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p1EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> outputs = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String[] word = scanner.nextLine().split("");
            sum = 0;
            for (int j = 0; j < word.length; j++) {

                boolean isVowel = false;
                char symbol = word[j].charAt(0);
                char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
                for (char vowel : vowels) {
                    if (symbol == vowel) {
                        isVowel = true;
                        break;
                    }
                }
                {
                    if (isVowel) {
                        sum += symbol * word.length;

                    } else {
                        sum += symbol / word.length;
                    }
                }
            }
                outputs.add(sum);
        }
        Collections.sort(outputs);
        for (int k = 0; k < outputs.size(); k++) {
            System.out.println(outputs.get(k));
        }
    }
}
