package incubation.designpatternsproject.behavioral;

//Use Case: When multiple handlers can process a request without knowing which one will handle it.
//Example: Support Ticket System where requests are passed to different support levels.

// Handler Interface
abstract class SupportHandler {
    protected SupportHandler nextHandler;
    public void setNextHandler(SupportHandler nextHandler) { this.nextHandler = nextHandler; }
    public abstract void handleRequest(String issue);
}

// Concrete Handler: Level 1 Support
class Level1Support extends SupportHandler {
    public void handleRequest(String issue) {
        if (issue.equals("Basic")) System.out.println("Level 1 Support: Solved.");
        else if (nextHandler != null) nextHandler.handleRequest(issue);
    }
}

// Concrete Handler: Level 2 Support
class Level2Support extends SupportHandler {
    public void handleRequest(String issue) {
        if (issue.equals("Advanced")) System.out.println("Level 2 Support: Solved.");
        else if (nextHandler != null) nextHandler.handleRequest(issue);
    }
}

// Client Code
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        level1.setNextHandler(level2);

        level1.handleRequest("Basic");  // Level 1 Support: Solved.
        level1.handleRequest("Advanced");  // Level 2 Support: Solved.
    }
}

