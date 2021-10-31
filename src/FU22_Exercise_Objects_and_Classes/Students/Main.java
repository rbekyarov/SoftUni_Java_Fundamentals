package FU22_Exercise_Objects_and_Classes.Students;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Students>students= new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String data = scanner.nextLine();
            String [] dataArr = data.split(" ");
            String firstName = dataArr[0];
            String lastName = dataArr[1];
            double grade = Double.parseDouble(dataArr[2]);
            Students studentsObject = new Students(firstName,lastName,grade);
             students.add(studentsObject);
        }
        students = students.stream().sorted(Comparator.comparingDouble(Students::getGrade))
                .collect(Collectors.toList());// сортираме по оценка

        Collections.reverse(students);// обръща списъска с обекти , за да може първо да се подредят
        //обектите с най-висока оценка

        for (Students s: students)
            System.out.println(s.toString());

    }
}
