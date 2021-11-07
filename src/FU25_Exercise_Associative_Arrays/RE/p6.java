package FU25_Exercise_Associative_Arrays.RE;

import java.util.*;

public class p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> mapCurseStudents = new LinkedHashMap<>();


        while (!input.equals("end")) {

            String nameCourse = input.split(" : ")[0];
            String nameStudent = input.split(" : ")[1];

            if (!mapCurseStudents.containsKey(nameCourse)) {
                mapCurseStudents.put(nameCourse, new ArrayList<>());
            }
            mapCurseStudents.get(nameCourse).add(nameStudent);

            input = scanner.nextLine();


        }

        mapCurseStudents.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());

                    List<String> students = entry.getValue();
                    students.stream().sorted().forEach(StudentName -> System.out.println("-- " + StudentName));

                });
    }
}
