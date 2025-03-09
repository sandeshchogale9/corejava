package incubation.designpatternsproject.behavioral;

//Use Case: When multiple subclasses share the same algorithm structure but need different implementations for some steps.
//Example: Coffee and Tea preparation where boiling and serving are the same, but ingredients differ.
// Abstract Class
abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    protected abstract void brew();
    protected abstract void addCondiments();
    private void boilWater() { System.out.println("Boiling water"); }
    private void pourInCup() { System.out.println("Pouring into cup"); }
}

// Concrete Class: Coffee
class Coffee extends Beverage {
    protected void brew() { System.out.println("Brewing coffee"); }
    protected void addCondiments() { System.out.println("Adding sugar and milk"); }
}

// Concrete Class: Tea
class Tea extends Beverage {
    protected void brew() { System.out.println("Steeping tea leaves"); }
    protected void addCondiments() { System.out.println("Adding lemon"); }
}

// Client Code
public class TemplateMethodDemo {
    public static void main(String[] args) {
        new Coffee().prepareRecipe();
        new Tea().prepareRecipe();
    }
}

