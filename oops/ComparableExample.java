package incubation.oops;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.id, s.id); // Ascending order
    }
}

//compareTo() – Natural Ordering (Comparable Interface)
//It is used when a class implements the Comparable<T> interface.
//Defines the natural sorting order of objects.
//Used in TreeSet, TreeMap, and Collections.sort() (when no custom comparator is provided).
//Internal Working of compareTo()
//compareTo() typically returns:
//0 → If both objects are equal.
//< 0 → If the current object is less than the other object.
//> 0 → If the current object is greater than the other object.

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student(3, "Alice"), new Student(1, "Bob"));
        Collections.sort(list);
        list.forEach(s -> System.out.println(s.id + " " + s.name));
    }
}

