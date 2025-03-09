package incubation.oops;


import java.util.List;
import java.util.ArrayList;

//-If the Department is deleted, Employee objects still exist.
//-Employees are aggregated into the Department but not owned by it
class Employee3 {
    String name;

    Employee3(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    List<Employee3> employees;

    Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(Employee3 emp) {
        employees.add(emp);
    }

    void showEmployees() {
        System.out.println(deptName + " Department Employees: ");
        for (Employee3 e : employees) {
            System.out.println(e.name);
        }
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Department hr = new Department("HR");

        Employee3 e1 = new Employee3("Alice");
        Employee3 e2 = new Employee3("Bob");

        hr.addEmployee(e1);
        hr.addEmployee(e2);

        hr.showEmployees();
        // HR Department Employees:
        // Alice
        // Bob
    }
}

