package incubation.designpatternsproject.behavioral;

//Use Case: When we want to encapsulate requests as objects, allowing undo/redo functionality or queuing commands.
//Example: Remote control buttons that execute different commands (Turn On/Off, Change Volume).

// Command Interface
interface Command {
    void execute();
}

// Concrete Command: Turn TV On
class TurnOnCommand implements Command {
    private TV tv;
    public TurnOnCommand(TV tv) { this.tv = tv; }
    public void execute() { tv.turnOn(); }
}

// Concrete Command: Turn TV Off
class TurnOffCommand implements Command {
    private TV tv;
    public TurnOffCommand(TV tv) { this.tv = tv; }
    public void execute() { tv.turnOff(); }
}

// Receiver (Actual TV Functionality)
class TV {
    public void turnOn() { System.out.println("TV is ON"); }
    public void turnOff() { System.out.println("TV is OFF"); }
}

// Invoker (Remote Control)
class RemoteControl {
    private Command command;
    public void setCommand(Command command) { this.command = command; }
    public void pressButton() { command.execute(); }
}

// Client Code
public class CommandPatternDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        RemoteControl remote = new RemoteControl();

        remote.setCommand(new TurnOnCommand(tv));
        remote.pressButton();  // TV is ON

        remote.setCommand(new TurnOffCommand(tv));
        remote.pressButton();  // TV is OFF
    }
}

