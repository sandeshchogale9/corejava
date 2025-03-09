package incubation.solidprinciples;

//Definition: A class should have only one reason to change, meaning it should focus on a single responsibility.
//
//When to Use?
//When a class is handling multiple unrelated functionalities.
//To improve code maintainability and readability.
//To avoid large, monolithic classes that are hard to modify.

class SingleResponsibilityPrinciple {
    class Employee {
        void calculateSalary() { /* Salary logic */ }

        void generateReport() { /* Report logic */ }
    }
    //❌ Problem: The class is handling two responsibilities: salary calculation and report generation.


    //After Fixed
    //Now each class has a single responsibility.
    class SalaryCalculator {
        void calculateSalary() { /* Salary logic */ }
    }

    class ReportGenerator {
        void generateReport() { /* Report logic */ }
    }
}
