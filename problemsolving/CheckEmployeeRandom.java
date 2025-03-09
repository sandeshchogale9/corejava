package incubation.problemsolving;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Employees {
    String name;
    String id;
    String department;

    public Employees(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ", Dept: " + department + ")";
    }
}

public class CheckEmployeeRandom {
    public static void main(String[] args) {
        List<Employees> employees = getEmployees();

        // (A) Print all employees department-wise
        Map<String, List<Employees>> departmentWiseEmployees =
                employees.stream().collect(Collectors.groupingBy(emp -> emp.department));

        departmentWiseEmployees.forEach((dept, empList) -> {
            System.out.println(dept + " -> " + empList);
        });

        // (B) Supplier to generate random numbers and select a random employee
        Supplier<Employees> randomEmployeeSupplier = () -> {
            Random random = new Random();
            int index = random.nextInt(employees.size()); // Get a random index
            return employees.get(index);
        };

        // Select 1 random employee
        System.out.println("\nRandomly Selected Employee: " + randomEmployeeSupplier.get());

        // Select multiple random employees
        List<Employees> randomEmployees = IntStream.range(0, 3) // Get 3 random employees
                .mapToObj(i -> randomEmployeeSupplier.get())
                .collect(Collectors.toList());

        System.out.println("Multiple Random Employees: " + randomEmployees);
    }

    // Method to get employees (simulating DB retrieval)
    private static List<Employees> getEmployees() {
        return Arrays.asList(
                new Employees("John", "E001", "IT"),
                new Employees("Alice", "E002", "HR"),
                new Employees("Bob", "E003", "Finance"),
                new Employees("Sophia", "E004", "IT"),
                new Employees("David", "E005", "HR"),
                new Employees("Emma", "E006", "Finance")
        );
    }
}

