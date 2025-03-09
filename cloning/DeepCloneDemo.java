package incubation.cloning;

//Deep Cloning
//When to Use?
//When the object has mutable references and we need independent copies.
//When we want to ensure changes to one object don’t affect the other.
class Address1 implements Cloneable {
    String city;

    Address1(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Address1(this.city); // Deep copy
    }
}

class Employee1 implements Cloneable {
    String name;
    Address1 address;

    Employee1(String name, Address1 address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee1 cloned = (Employee1) super.clone(); // Shallow copy first
        cloned.address = (Address1) address.clone(); // Deep copy mutable object
        return cloned;
    }
}

public class DeepCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("New York");
        Employee emp1 = new Employee("John", addr);
        Employee emp2 = (Employee) emp1.clone();

        emp2.address.city = "Los Angeles"; // Only emp2 is modified

        System.out.println(emp1.name + " lives in " + emp1.address.city); // John lives in New York
        System.out.println(emp2.name + " lives in " + emp2.address.city); // John lives in Los Angeles
        //Why is Deep Cloning Better?
        //Now emp1.address.city remains New York, even after modifying emp2.address.city.
        //emp2 gets a completely separate copy of Address
    }
}

