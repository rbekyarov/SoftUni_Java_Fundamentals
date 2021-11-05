package FU24_Associative_Arrays.RE;

import java.util.*;
import java.util.stream.Collectors;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listInput = Arrays.stream(scanner.nextLine().split(" ")).map(String::toLowerCase).collect(Collectors.toList());
        System.out.println();
        Map<String,Integer> mapInput = new LinkedHashMap<>();

        for (String e:listInput){
            if(!mapInput.containsKey(e)){
                mapInput.put(e,1);
            }else {
                int count = mapInput.get(e);
                count++;
                mapInput.put(e,count);
            }
        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> e : mapInput.entrySet()) {
            if (e.getValue()%2==1){
                resultList.add(e.getKey());
            }
        }
        System.out.print(String.join(", ",resultList));
    }
}
