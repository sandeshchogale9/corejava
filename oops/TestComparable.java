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

public class TestComparable {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student(3, "Alice"), new Student(1, "Bob"));
        Collections.sort(list);
        list.forEach(s -> System.out.println(s.id + " " + s.name));
    }
}

