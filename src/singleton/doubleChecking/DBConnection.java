package singleton.doubleChecking;

public class DBConnection {
    private static DBConnection instance = null;

    private DBConnection() {
        // initialize attributes
    }

    public static DBConnection getInstance() {
        if(instance == null) {
            synchronized (DBConnection.class) {
                if(instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
}
