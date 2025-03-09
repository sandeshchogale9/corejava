package incubation.solidprinciples;

//Definition: Don't force classes to implement unnecessary methods.
//Prefer multiple small interfaces over one large interface.
//
//When to Use?
//When an interface contains too many unrelated methods.
//To prevent forcing subclasses to implement unnecessary methods.
public class InterfaceSegregationPrinciple {
    interface Worker {
        void work();
        void eat();
    }

    class Robot implements Worker {
        public void work() { /* Work Logic */ }
        public void eat() { /* Not needed for Robot */ }  // ❌ Violates ISP
    }
    //❌ Problem: Robot doesn't need eat(), but it's forced to implement it.



    //After ISP (Fixed)
    //Now interfaces are split into specific behaviors.
    interface Workable {
        void work();
    }

    interface Eatable {
        void eat();
    }

    class RobotUpdated implements Workable {
        public void work() { /* Work Logic */ }
    }


}
