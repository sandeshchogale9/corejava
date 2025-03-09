package incubation.finalvariable;

//Must be initialized either:
//At the time of declaration, OR
//Inside the constructor (ensuring all constructors initialize it.
class FinalInstance {
    final int x; // Must be initialized in constructor or at declaration

    // Constructor initializing the final variable
    FinalInstance(int value) {
        this.x = value;
    }

    public static void main(String[] args) {
        FinalInstance obj = new FinalInstance(100);
        System.out.println(obj.x); // 100
    }
}

