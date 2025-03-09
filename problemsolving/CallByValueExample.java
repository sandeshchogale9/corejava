package incubation.problemsolving;

//When a primitive type is passed to a method, a copy of its value is sent.
//Changes inside the method don’t affect the original variable.

//Call by Value for Objects (Reference Copy)
//Java passes object references by value (not by reference).
//Changes to the object affect the original object because the reference points to the same memory.
//However, changing the reference itself does not affect the original object.
public class CallByValueExample {
    static void modify(int x) {
        x = 10; // Only local copy changes
    }

    static class Student {
        String name;

        Student(String name) {
            this.name = name;
        }
    }
    static void modify(Student s) {
        s.name = "Updated"; // ✅ Modifies the actual object
        //s = new Student("Updated");//Not Modifies the actual object
    }

    public static void main(String[] args) {
        //Call by Reference (Not Used in Java)
        //In languages like C++, passing an object’s memory reference would allow modification of the original object directly.
        //Java does not support call by reference. Instead, it passes a copy of the reference.
        int num = 5;
        modify(num);
        System.out.println(num); // Output: 5 (unchanged)
        //Original variable remains unchanged because Java passes a copy of num.

        //Object reference is copied, but both references point to the same object in memory.
        Student s1 = new Student("Original");
        modify(s1);
        System.out.println(s1.name); // Output: Updated
    }

}

