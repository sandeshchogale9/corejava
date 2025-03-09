package incubation.designpatternsproject.creational;

// Abstract Factory Interface
interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Abstract Product 1: Button
interface Button {
    void paint();
}

// Concrete Product: Dark Button
class DarkButton implements Button {
    public void paint() {
        System.out.println("Rendering Dark Button");
    }
}

// Concrete Product: Light Button
class LightButton implements Button {
    public void paint() {
        System.out.println("Rendering Light Button");
    }
}

// Abstract Product 2: Checkbox
interface Checkbox {
    void render();
}

// Concrete Product: Dark Checkbox
class DarkCheckbox implements Checkbox {
    public void render() {
        System.out.println("Rendering Dark Checkbox");
    }
}

// Concrete Product: Light Checkbox
class LightCheckbox implements Checkbox {
    public void render() {
        System.out.println("Rendering Light Checkbox");
    }
}

// Factory 1: Creates Dark Theme UI Elements
class DarkThemeFactory implements UIFactory {
    public Button createButton() {
        return new DarkButton();
    }

    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}

// Factory 2: Creates Light Theme UI Elements
class LightThemeFactory implements UIFactory {
    public Button createButton() {
        return new LightButton();
    }

    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
