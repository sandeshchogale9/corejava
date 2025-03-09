package incubation.javafeatures.java17;

public class RecordExample {
    public static void main(String[] args) {
        Employ emp = new Employ("Alice", 50000.0, "IT");

        // Access fields using auto-generated methods
        System.out.println(emp.name());       // Alice
        System.out.println(emp.salary());     // 50000.0
        System.out.println(emp.department()); // IT

        // Auto-generated toString()
        System.out.println(emp);  // Output: Employee[name=Alice, salary=50000.0, department=IT]
    }
}
