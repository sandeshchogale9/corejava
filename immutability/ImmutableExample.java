package incubation.immutability;

import java.util.*;

final class Employee {
    private final String name;
    private final int id;
    private final List<String> skills; // Immutable List

    // Constructor with Deep Copy
    public Employee(String name, int id, List<String> skills) {
        this.name = name;
        this.id = id;
        this.skills = Collections.unmodifiableList(new ArrayList<>(skills)); // Deep copy + Unmodifiable
    }

    // Getters (Return a copy of skills to prevent external modification)
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<String> getSkills() {
        return new ArrayList<>(skills); // Returning a copy prevents external modifications
    }

    // Implementing equals() - compares values
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(skills, employee.skills);
    }

    // Implementing hashCode() - ensures consistent hashing
    @Override
    public int hashCode() {
        return Objects.hash(name, id, skills);
    }

    // Override toString() for better debugging
    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", skills=" + skills + "}";
    }
}

public class ImmutableExample {
    public static void main(String[] args) {
        // Creating Employees with Immutable Skills List
        List<String> skills1 = new ArrayList<>(Arrays.asList("Java", "Spring", "Microservices"));
        Employee e1 = new Employee("Alice", 101, skills1);

        List<String> skills2 = new ArrayList<>(Arrays.asList("Python", "Django", "ML"));
        Employee e2 = new Employee("Bob", 102, skills2);

        // Using Employee as a HashMap Key
        Map<Employee, String> employeeMap = new HashMap<>();
        employeeMap.put(e1, "Manager");
        employeeMap.put(e2, "Developer");

        // Retrieving from HashMap
        System.out.println(employeeMap.get(new Employee("Alice", 101, Arrays.asList("Java", "Spring", "Microservices")))); // ✅ Output: Manager
        System.out.println(employeeMap.get(new Employee("Bob", 102, Arrays.asList("Python", "Django", "ML")))); // ✅ Output: Developer

        // Trying to Modify Skills (This should not affect the object)
        skills1.add("AWS"); // This does not modify e1's skills as it's unmodifiable
        System.out.println(e1.getSkills()); // ✅ Still prints: [Java, Spring, Microservices]

        // Trying to Modify via Getter
        e1.getSkills().add("Kafka"); // ❌ Throws UnsupportedOperationException
    }
}

