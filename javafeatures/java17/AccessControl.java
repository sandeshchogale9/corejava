package incubation.javafeatures.java17;
sealed interface UserRole permits Admin, Manager, Employee {}

record Admin(String name) implements UserRole {}
record Manager(String name) implements UserRole {}
record Employee(String name) implements UserRole {}

public class AccessControl {
    // Method to define access levels based on user role
    public static String getAccessLevel(UserRole user) {
        return switch (user) {
            case Admin a -> "Full Access";
            case Manager m -> "Limited Access";
            case Employee e -> "Restricted Access";
        };
    }

    public static void main(String[] args) {
        UserRole user1 = new Admin("Alice");
        UserRole user2 = new Manager("Charlie");
        UserRole user3 = new Employee("Bob");

        System.out.println(((Admin) user1).name() + " → " + getAccessLevel(user1)); // Full Access
        System.out.println(((Manager) user2).name() + " → " + getAccessLevel(user2)); // Limited Access
        System.out.println(((Employee) user3).name() + " → " + getAccessLevel(user3)); // Restricted Access
    }
}
