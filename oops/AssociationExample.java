package incubation.oops;

class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Student2 {
    String name;

    Student2(String name) {
        this.name = name;
    }
}

public class AssociationExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith");
        Student2 student = new Student2("John");

        System.out.println(teacher.name + " teaches " + student.name);
        // Mr. Smith teaches John

        //Both objects exist independently (A Teacher can exist without a Student).
    }
}

