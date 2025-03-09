package incubation.oops;

class Address implements Cloneable {
    String city;
    Address(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Address(this.city); // Deep copy
    }
}

class Employee2 implements Cloneable {
    int id;
    Address address;

    Employee2(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone(); // Shallow copy

        Employee2 cloned = (Employee2) super.clone();
        cloned.address = (Address) this.address.clone(); // Deep copy
        return cloned;
    }

}

public class TestShallowDeepClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee2 e1 = new Employee2(1, new Address("New York"));
        Employee2 e2 = (Employee2) e1.clone();

        e2.address.city = "Los Angeles"; // Changes original object
        System.out.println(e1.address.city); // Los Angeles (unexpected change)
    }
}

