package incubation.javafeatures.java17;

import java.util.List;
import java.util.Comparator;

public class HighestSalaryFinder {
    public static Employees findHighestPaidEmployee(List<Employees> employees) {
        return employees.stream()
                .max(Comparator.comparing(Employees::salary)) // Find max salary
                .orElse(null); // Handle empty list case
    }

    public static void main(String[] args) {
        List<Employees> employees = List.of(
                new Employees("John", 70000, "HR"),
                new Employees("Alice", 90000, "IT"),
                new Employees("Bob", 75000, "Finance")
        );

        Employees highestPaid = findHighestPaidEmployee(employees);
        System.out.println(highestPaid); // Output: Employee[name=Alice, salary=90000.0, department=IT]
    }
}

// Java 14+ Record Class for Employee
record Employees(String name, double salary, String department) {}

