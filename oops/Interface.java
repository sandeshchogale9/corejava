package incubation.oops;

interface Interface1 {
    void makeSound1();
    default void print(){
        System.out.println("Interface1");
    }
}

interface Interface2 {
    void makeSound1();
    default void print(){
        System.out.println("Interface2");
    }
}

class Cat implements Interface1, Interface2 {
    public void makeSound1() {
        System.out.println("Meow");
    }

    @Override
    public void print() {
        Interface1.super.print();
        //print();
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound1();
        cat.print();

    }
}

