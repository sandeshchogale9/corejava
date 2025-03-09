package incubation.problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryPerDept {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 70000, "HR",""),
                new Employee("Alice", 90000, "IT",""),
                new Employee("Bob", 75000, "Finance",""),
                new Employee("David", 85000, "IT",""),
                new Employee("Emily", 65000, "HR","")
        );

        // Compute average salary per department
        Map<String, Double> avgSalaryPerDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,             // Group by department
                        Collectors.averagingDouble(Employee::getSalary) // Compute average salary
                ));

        // Print result
        avgSalaryPerDept.forEach((dept, avgSalary) ->
                System.out.println(dept + " -> " + avgSalary));
    }
}

// Java 14+ Record Class for Employee
//record Employee(String name, double salary, String department) {}


