package incubation.designpatternsproject.structural;

// Abstraction Layer
abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    abstract void turnOn();
    abstract void turnOff();
    abstract void setVolume(int volume);
}

// Refined Abstraction 1: Basic Remote
class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }
}

// Refined Abstraction 2: Advanced Remote (with Mute Function)
class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }

    public void mute() {
        System.out.println("Muting the device");
        device.setVolume(0);
    }
}
// Implementor Interface
interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}

// Concrete Implementor 1: TV
class TV1 implements Device {
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF");
    }

    public void setVolume(int volume) {
        System.out.println("TV volume set to " + volume);
    }
}

// Concrete Implementor 2: Radio
class Radio implements Device {
    public void turnOn() {
        System.out.println("Radio is turned ON");
    }

    public void turnOff() {
        System.out.println("Radio is turned OFF");
    }

    public void setVolume(int volume) {
        System.out.println("Radio volume set to " + volume);
    }
}
