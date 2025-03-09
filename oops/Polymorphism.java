package incubation.oops;

//Polymorphism allows a method to have multiple forms, making the code more flexible.
public class Polymorphism {
    //Method Overloading (Compile-time Polymorphism)
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Polymorphism math = new Polymorphism();
        System.out.println(math.add(5, 10));    // Calls int add()
        System.out.println(math.add(5.5, 2.3)); // Calls double add()


    }

}
