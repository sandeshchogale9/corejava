package incubation.designpatternsproject.structural;

//Use Case: When we need to control access, add security, or delay expensive object creation.
//Example: Restricting access to a database with a proxy class.
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Database db = new ProxyDatabase("EmployeeDB");

        // First call initializes connection
        db.connect();
        // Output: Connecting to Database: EmployeeDB
        //         Connected to EmployeeDB

        // Second call reuses connection
        db.connect();
        // Output: Connected to EmployeeDB
    }
}

