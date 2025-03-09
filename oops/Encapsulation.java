package incubation.oops;

class Parent {
    void show() {
        System.out.println("Parent class show");
    }
    void show2() {
        System.out.println("Parent class show2");
    }
}

//Inheritance allows a child class to acquire properties and behavior from a parent class.
//Reduces redundancy.
//Enhances code reusability.
class Child extends Parent {
    //Prevents direct access to fields (security).
    //Controls how data is modified.
    private double balance; // Private field (data hiding)

    public double getBalance() {  // Getter method
        return balance;
    }

    public void deposit(double amount) {  // Setter method
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    void show() {
        System.out.println("Child class");
        //super.show();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.show();
        child.show2();
        child.deposit(100);
        System.out.println(child.getBalance());
        //Parent parent = new Parent();
        //parent.show();
    }

}

