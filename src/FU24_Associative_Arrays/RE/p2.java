package FU24_Associative_Arrays.RE;

import java.util.*;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> mapSynonyms= new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!mapSynonyms.containsKey(word)){
                List<String> listSynonym = new ArrayList<>();
                listSynonym.add(synonym);
                mapSynonyms.put(word,listSynonym);
            }else {
                List<String> listSynonym = mapSynonyms.get(word);
                listSynonym.add(synonym);
                mapSynonyms.put(word,listSynonym);
            }
        }
        for (Map.Entry<String, List<String>> entry : mapSynonyms.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
