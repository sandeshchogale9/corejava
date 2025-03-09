package incubation.designpatternsproject.behavioral;
//Use Case: When an object changes behavior dynamically based on its state.
//Example: Traffic Light changing behavior based on the color state.

// State Interface
interface TrafficLightState {
    void handle();
}

// Concrete States
class RedState implements TrafficLightState {
    public void handle() { System.out.println("Stop! Red Light"); }
}
class GreenState implements TrafficLightState {
    public void handle() { System.out.println("Go! Green Light"); }
}
class YellowState implements TrafficLightState {
    public void handle() { System.out.println("Slow Down! Yellow Light"); }
}

// Context (Traffic Light)
class TrafficLight {
    private TrafficLightState state;
    public void setState(TrafficLightState state) { this.state = state; }
    public void change() { state.handle(); }
}

// Client Code
public class StatePatternDemo {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.setState(new RedState());
        trafficLight.change();  // Stop! Red Light

        trafficLight.setState(new GreenState());
        trafficLight.change();  // Go! Green Light

        trafficLight.setState(new YellowState());
        trafficLight.change();  // Slow Down! Yellow Light
    }
}

