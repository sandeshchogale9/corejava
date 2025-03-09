package incubation.designpatternsproject.creational;

//Use Case: When we need multiple related factories to create objects.
//Example: Creating different UI themes (Dark Theme, Light Theme) with Buttons & Checkboxes.
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // Creating Dark Theme UI
        UIFactory darkFactory = new DarkThemeFactory();
        Button darkButton = darkFactory.createButton();
        Checkbox darkCheckbox = darkFactory.createCheckbox();

        darkButton.paint();       // Output: Rendering Dark Button
        darkCheckbox.render();    // Output: Rendering Dark Checkbox

        // Creating Light Theme UI
        UIFactory lightFactory = new LightThemeFactory();
        Button lightButton = lightFactory.createButton();
        Checkbox lightCheckbox = lightFactory.createCheckbox();

        lightButton.paint();      // Output: Rendering Light Button
        lightCheckbox.render();   // Output: Rendering Light Checkbox
    }
}
//When to Use Abstract Factory?
//When you need families of related objects (e.g., UI Themes, Database Drivers, Car Parts)
//When you want to ensure that related objects are created together

