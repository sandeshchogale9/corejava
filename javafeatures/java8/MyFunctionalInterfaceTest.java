package incubation.javafeatures.java8;

interface MyInterface {
    default void show() {
        System.out.println("Default Method in Interface");
    }
}

class MyFunctionalInterfaceClass implements MyInterface {
}

class MyFunctionalInterfaceTest{
    public static void main(String[] args) {
        new MyFunctionalInterfaceClass().show();
    }
}




