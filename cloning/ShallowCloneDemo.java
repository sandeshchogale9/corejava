package incubation.cloning;

//Shallow Cloning
//When to Use?
//When the object contains only primitive or immutable fields.
//When you don’t need separate copies of referenced objects.
//When cloning needs to be fast and memory-efficient.
class Address {
    String city;
    Address(String city) {
        this.city = city;
    }
}

class Employee implements Cloneable {
    String name;
    Address address; // Mutable object reference

    Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

public class ShallowCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("New York");
        Employee emp1 = new Employee("John", addr);
        Employee emp2 = (Employee) emp1.clone();

        emp2.name = "Doe";
        emp2.address.city = "Los Angeles"; // Modifies original object's address

        System.out.println(emp1.name + " lives in " + emp1.address.city); // John lives in Los Angeles
        System.out.println(emp2.name + " lives in " + emp2.address.city); // Doe lives in Los Angeles

        //Problem with Shallow Cloning
        //emp2.address.city = "Los Angeles" also modifies emp1.address.city.
        //Both objects share the same reference to Address.
    }
}

