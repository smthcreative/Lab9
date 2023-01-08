package db;

public class Connection {
    // We cannot get the connection through the constructor cuz it is private,
    // so we create a copy thisConnection and get the connection of that.
    private static Connection thisConnection;

    private Connection() {

    }

    public static Connection getConnection() {
        if (thisConnection == null) {
            thisConnection =  new Connection();
        }

        return thisConnection;
    }
}
