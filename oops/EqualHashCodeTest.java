package incubation.oops;

import java.util.Objects;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee emp = (Employee) obj;
        return id == emp.id && Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class EqualHashCodeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John");
        Employee e2 = new Employee(1, "John");

        System.out.println(e1.equals(e2)); // true
        System.out.println(e1.hashCode() == e2.hashCode()); // true
    }
}

