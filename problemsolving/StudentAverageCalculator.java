package incubation.problemsolving;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}

public class StudentAverageCalculator {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", Arrays.asList(85, 90, 80)),
                new Student("Bob", Arrays.asList(70, 75, 80)),
                new Student("Charlie", Arrays.asList(95, 88, 92))
        );

        // Compute average grades for each student and store in a Map
        Map<String, Double> studentAverages = students.stream()
                .collect(Collectors.toMap(
                        Student::getName,  // Key: Student Name
                        s -> s.getGrades().stream().mapToInt(Integer::intValue).average().orElse(0.0) // Compute Average
                ));
        /*
        * Map<String, Double> studentAverages = students.stream()
        .collect(Collectors.groupingBy(
                Student::getName,
                Collectors.averagingInt(grade -> grade) // Works if `students` is a list of grades directly
        ));
        * */

        /*Map<String, Double> studentAverages = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getName,
                        Collectors.averagingInt(s -> s.getGrades().stream()
                                .mapToInt(Integer::intValue)
                                .sum() / s.getGrades().size()) // Compute the average manually
                ));*/

        /*
        Map<String, Double> studentAverages = new HashMap<>();

        students.forEach(student -> {
            double avg = student.getGrades().stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0.0);
            studentAverages.put(student.getName(), avg);
        });

        * */

        /*
        * Map<String, Double> studentAverages = students.stream()
        .collect(Collectors.toMap(
                Student::getName,
                s -> {
                    DoubleSummaryStatistics stats = s.getGrades().stream()
                            .mapToInt(Integer::intValue)
                            .summaryStatistics();
                    return stats.getAverage();
                }
        ));
        * */


        // Print results
        studentAverages.forEach((name, avg) -> System.out.println(name + " -> " + avg));
    }
}

