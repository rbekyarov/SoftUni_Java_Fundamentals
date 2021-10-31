package FU24_Associative_Arrays;

import java.util.*;

public class p2WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // създаваме предварително Map от, string (думата) и List (синонимите)
        Map<String, List<String>>  synonymMap = new LinkedHashMap<>();

        for (int i = 0; i <n ; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            //докато в Мап-а, ключа не се съдържа
            if (!synonymMap.containsKey(word)){
                List<String> synonymForCurrentWord = new ArrayList<>();
                synonymForCurrentWord.add(synonym);
                synonymMap.put(word,synonymForCurrentWord);
            }else{
                List<String>synonymForCurrentWord=synonymMap.get(word);
                synonymForCurrentWord.add(synonym);
                synonymMap.put(word,synonymForCurrentWord);
            }

        }//имаме мап с уникален ключ и 2 стойности които са в списък
        for (Map.Entry<String,List<String>> entry : synonymMap.entrySet()){
            String currentWord = entry.getKey();
            List<String>synonymForCurrentWord=entry.getValue();
            System.out.printf("%s - %s%n",currentWord,String.join(", ",synonymForCurrentWord));
        }
    }
}
