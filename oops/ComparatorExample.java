package incubation.oops;

import java.util.*;

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // Sort by name
    }
}
//compare() – Custom Comparator (Comparator Interface)
//Used when implementing the Comparator<T> interface.
//Allows custom sorting of objects.
//Can be used for multiple sorting strategies.
//Internal Working of compare()
//Similar to compareTo(), it returns:
//0 → If both objects are equal.
//< 0 → If o1 should come before o2.
//> 0 → If o1 should come after o2.

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student(3, "Alice"), new Student(1, "Bob"));
        Collections.sort(list, new StudentComparator());
        list.forEach(s -> System.out.println(s.id + " " + s.name));
    }
}

