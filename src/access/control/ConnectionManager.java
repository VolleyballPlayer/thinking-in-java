package access.control;

class Connection {
    private Connection() { System.out.println("Connection()"); }
    static Connection createConnection() {
        return new Connection();
    }
}

//Exercise8
public class ConnectionManager {
    static int remaining = 5;
    static void showRemaining() {
        System.out.println("Available connections: " + remaining);
    }
    static Connection[] connections = new Connection[5];
    {
        for(Connection c : connections)
            c = Connection.createConnection();
    }
    public static Connection getConnection() {
        if(remaining > 0) {
            System.out.println("Creating Connection");
            return connections[--remaining];
        }else
            System.out.println("No more connections available!");
        return null;
    }
    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();
        showRemaining();
        getConnection();
        showRemaining();
        getConnection();
        showRemaining();
        getConnection();
        showRemaining();
        getConnection();
        showRemaining();
        getConnection();
        showRemaining();
        getConnection();
        showRemaining();
    }

}