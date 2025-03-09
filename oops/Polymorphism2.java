package incubation.oops;

//Increases flexibility in code.
//Supports method customization.
//Method Overriding (Runtime Polymorphism)
class ParentClass {
    void show() {
        System.out.println("Parent class");
    }
}

class ChildClass extends ParentClass {
    @Override
    void show() {
        //super.show();
        System.out.println("Child class");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        ParentClass obj = new ChildClass();
        obj.show(); // Calls Child's overridden method
    }
}

