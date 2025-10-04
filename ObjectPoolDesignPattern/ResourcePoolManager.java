import java.util.ArrayList;
import java.util.List;

public class ResourcePoolManager {
    List<DBConnection> connectionInUse;
    List<DBConnection> freeConnections;
    int initialPoolSize = 3;
    int maxPoolSize = 6;

    private static ResourcePoolManager instance = null;
    
    private ResourcePoolManager() {
        connectionInUse = new ArrayList<>();
        freeConnections = new ArrayList<>();
        for(int i=0;i<initialPoolSize;i++) {
            freeConnections.add(new DBConnection());
        }
    }

    public static ResourcePoolManager getInstance() {
        if(instance == null) {
            synchronized(ResourcePoolManager.class) {
                if(instance == null) {
                    instance = new ResourcePoolManager();
                }
            }
        }
        return instance; 
    }

    public DBConnection getConnection() {
        if(freeConnections.isEmpty() && connectionInUse.size() < maxPoolSize) {
            freeConnections.add(new DBConnection());
        } else if (freeConnections.isEmpty() && connectionInUse.size() >= maxPoolSize) {
            System.out.println("Cannot create new connection as max pool size is reached");
            return null;
        }

        DBConnection d = freeConnections.remove(freeConnections.size()-1);
        connectionInUse.add(d);
        return d;
    }

    public void releaseConnection(DBConnection dbConnection) {
        if(dbConnection != null) {
            connectionInUse.remove(dbConnection);
            freeConnections.add(dbConnection);
        }
    }

}
