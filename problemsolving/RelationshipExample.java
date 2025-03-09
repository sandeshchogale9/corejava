package incubation.problemsolving;

/*
import jakarta.persistence.*;
import java.util.List;
import jakarta.persistence.*;
import java.time.YearMonth;

public class RelationshipExample {
    @Entity
    @Table(name = "Employee")
    public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String firstName;
        private String lastName;
        private String joiningDate;

        // One Employee has many Salary records
        @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<Salary> salaries;

        // Constructors, Getters, and Setters
    }


    @Entity
    @Table(name = "Salary")
    public class Salary {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private double salaryAmount;

        @Column(name = "salary_month")
        private YearMonth salaryMonth;

        // Many Salary records belong to one Employee
        @ManyToOne
        @JoinColumn(name = "emp_id", nullable = false) // Foreign Key
        private Employee employee;

        // Constructors, Getters, and Setters
    }

}
*/
