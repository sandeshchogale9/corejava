package incubation.oops;

public class ClassLoaderExample {
    public static void main(String[] args) {
        // Get ClassLoader of this class
        ClassLoader classLoader = ClassLoaderExample.class.getClassLoader();

        System.out.println("Application ClassLoader: " + classLoader);
        System.out.println("Parent (Extension) ClassLoader: " + classLoader.getParent());
        System.out.println("Grandparent (Bootstrap) ClassLoader: " + classLoader.getParent().getParent());

        //OUTPUT
        //Application ClassLoader: sun.misc.Launcher$AppClassLoader
        //Parent (Extension) ClassLoader: sun.misc.Launcher$ExtClassLoader
        //Grandparent (Bootstrap) ClassLoader: null
        //(Null because Bootstrap ClassLoader is native and not written in Java.)
    }
}

