package incubation.oops;

import java.util.*;

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // Sort by name
    }
}

public class TestComparator {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student(3, "Alice"), new Student(1, "Bob"));
        Collections.sort(list, new StudentComparator());
        list.forEach(s -> System.out.println(s.id + " " + s.name));
    }
}

