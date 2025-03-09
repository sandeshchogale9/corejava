package incubation.problemsolving;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeAnalysis {
    public static void main(String[] args) {
        // Sample Employee List
        List<Employee> employees = Arrays.asList(
                new Employee("John", 90000, "IT", "Alice"),
                new Employee("David", 80000, "Finance", "Alice"),
                new Employee("Sophia", 120000, "IT", "Bob"),
                new Employee("Michael", 95000, "HR", "Alice"),
                new Employee("Emma", 110000, "IT", "Sophia"),
                new Employee("Ethan", 105000, "Finance", "David")
        );

        // 1️⃣ Find employees reporting to a specific manager
        String managerName = "Alice";
        long count = employees.stream()
                .filter(e -> e.getName().equals(managerName))
                .count();
        System.out.println("Employees reporting to " + managerName + " → " + count);

        // 2️⃣ Get the top 3 highest-paid employees
        List<String> top3Employees = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()) // Sort by salary (desc)
                .limit(3) // Get top 3
                .map(Employee::getName) // Extract names
                .collect(Collectors.toList());
        System.out.println("Top 3 highest-paid employees → " + top3Employees);

        // 3️⃣ Calculate average salary per department
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println("Average salary per department:");
        avgSalaryByDept.forEach((dept, avgSalary) ->
                System.out.printf("%s -> %.2f%n", dept, avgSalary));
    }
}

// Employee class using Java 14+ Record
//record Employee(String name, double salary, String department, String manager) {}

