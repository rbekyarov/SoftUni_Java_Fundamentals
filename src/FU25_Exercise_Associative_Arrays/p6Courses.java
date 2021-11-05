package FU25_Exercise_Associative_Arrays;

import java.util.*;

public class p6Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();
        while (!input.equals("end")) {
            String[] inputArr = input.split(" : ");
            String courseName = inputArr[0];
            String personName = inputArr[1];

            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());//за Value - създавме нов лист
            }
            courses.get(courseName).add(personName);//добавяме Кеy и Value (стойност в списък)

            input = scanner.nextLine();

        }
        //взема всичко от мапа ,сравянваме големината на списъците и сортираме като най - голямия го изместваме най отпред
        courses.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry -> {//принтира името и големината на списъка
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());

                    List<String> students = entry.getValue();//принтира съдържанието на списъка
                    students.stream().sorted().forEach(StudentName -> System.out.println("-- "+StudentName));

                });

        //courses.forEach((k, v) -> System.out.printf("%s -> %s%n", k, v));
    }
}
