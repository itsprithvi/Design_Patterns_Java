package singleton.eagerInitialization;

public class DBConnection {
    private static DBConnection instance = new DBConnection();

    private DBConnection() {
        // initialize attributes
    }

    public static DBConnection getInstance() {

        return instance;
    }
}
