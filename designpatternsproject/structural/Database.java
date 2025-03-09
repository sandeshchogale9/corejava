package incubation.designpatternsproject.structural;

//Example: Virtual Proxy for Expensive Database Access
//Instead of loading a real database connection immediately, we create a proxy that loads it on demand.

// Common Interface
interface Database {
    void connect();
}
// Real Database Connection (Expensive to Create)
class RealDatabase implements Database {
    private String dbName;

    public RealDatabase(String dbName) {
        this.dbName = dbName;
        System.out.println("Connecting to Database: " + dbName);  // Expensive operation
    }

    public void connect() {
        System.out.println("Connected to " + dbName);
    }
}
// Proxy Database (Delays Initialization)
class ProxyDatabase implements Database {
    private RealDatabase realDatabase;
    private String dbName;

    public ProxyDatabase(String dbName) {
        this.dbName = dbName;
    }

    public void connect() {
        if (realDatabase == null) {
            realDatabase = new RealDatabase(dbName);  // Lazy Loading
        }
        realDatabase.connect();
    }
}

