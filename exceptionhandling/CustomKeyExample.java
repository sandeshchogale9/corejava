package incubation.exceptionhandling;

import java.util.*;

class Employee3 {
    int id;
    String name;

    Employee3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee3 emp = (Employee3) obj;
        return id == emp.id && Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class CustomKeyExample {
    public static void main(String[] args) {
        Map<Employee3, String> map = new HashMap<>();
        Employee3 e1 = new Employee3(101, "Alice");
        Employee3 e2 = new Employee3(101, "Alice"); // Same data

        map.put(e1, "Developer");

        System.out.println(map.get(e2)); // Correctly retrieves "Developer" because hashCode and equals are overridden
    }
}

