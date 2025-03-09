package incubation.problemsolving;

// Step 1: Define the Animal interface
abstract class Animal {
    double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    abstract String makeSound();
}

// Step 2: Create different animals
class Lion extends Animal {
    public Lion(double weight) { super(weight); }
    @Override String makeSound() { return "Roar"; }
}

class Elephant extends Animal {
    public Elephant(double weight) { super(weight); }
    @Override String makeSound() { return "Trumpet"; }
}

class Dog extends Animal {
    public Dog(double weight) { super(weight); }
    @Override String makeSound() { return "Bark"; }
}

// Step 3: Factory for creating animals
class AnimalFactory {
    public static Animal createAnimal(String type, double weight) {
        switch (type.toLowerCase()) {
            case "lion": return new Lion(weight);
            case "elephant": return new Elephant(weight);
            case "dog": return new Dog(weight);
            default: throw new IllegalArgumentException("Unknown animal type: " + type);
        }
    }
}

// Step 4: SoundManager for playing animal sounds
class SoundManager {
    public void playSound(Animal animal) {
        System.out.println("Playing sound: " + animal.makeSound());
    }
}

// Step 5: ZooFacade to simplify interactions
class ZooFacade {
    private final SoundManager soundManager = new SoundManager();

    public Animal addAnimal(String type, double weight) {
        return AnimalFactory.createAnimal(type, weight);
    }

    public void makeAnimalSound(Animal animal) {
        soundManager.playSound(animal);
    }
}

// Step 6: Test Zoo with Facade Pattern
public class ZooFacadeExample {
    public static void main(String[] args) {
        ZooFacade zoo = new ZooFacade();

        Animal lion = zoo.addAnimal("lion", 200);
        Animal elephant = zoo.addAnimal("elephant", 500);

        zoo.makeAnimalSound(lion);      // Output: Playing sound: Roar
        zoo.makeAnimalSound(elephant);  // Output: Playing sound: Trumpet
    }
}

