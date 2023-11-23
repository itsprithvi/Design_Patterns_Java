package singleton.singleThread;

public class DBConnection {
    private static DBConnection instance = null;

    private DBConnection() {
        // initialize attributes
    }

    public static DBConnection getInstance() {
        if(instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}
