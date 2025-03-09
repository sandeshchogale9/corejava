package incubation.designpatternsproject.structural;

//Use Case: When we want to decouple abstraction and implementation so they can evolve independently.
//Example: Different Devices (TV, Radio) controlled by different Remotes (Basic, Advanced)
public class BridgePatternDemo {
    public static void main(String[] args) {
        Device tv = new TV1();
        Device radio = new Radio();

        RemoteControl basicRemote = new BasicRemote(tv);
        RemoteControl advancedRemote = new AdvancedRemote(radio);

        System.out.println("\nUsing Basic Remote with TV:");
        basicRemote.turnOn();
        basicRemote.setVolume(10);
        basicRemote.turnOff();

        System.out.println("\nUsing Advanced Remote with Radio:");
        advancedRemote.turnOn();
        advancedRemote.setVolume(20);
        ((AdvancedRemote) advancedRemote).mute();  // Advanced feature
        advancedRemote.turnOff();
    }
}

